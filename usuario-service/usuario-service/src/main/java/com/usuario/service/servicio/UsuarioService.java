package com.usuario.service.servicio;

import com.usuario.service.entidades.Usuario;
import com.usuario.service.feignclients.CarroFeignClient;
import com.usuario.service.feignclients.MotoFeignClient;
import com.usuario.service.modelos.Carro;
import com.usuario.service.modelos.Moto;
import com.usuario.service.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsuarioService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CarroFeignClient carroFeignClient;

    @Autowired
    private MotoFeignClient motoFeignClient;


    public List<Usuario> getAll()
    {
        return usuarioRepository.findAll();
    }

    public Usuario getUsuarioById(int id)
    {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario save(Usuario usuario)
    {
        return usuarioRepository.save(usuario);
    }

    public List<Carro> getCarros(int usuarioId)
    {
        return restTemplate.getForObject("http://carro-service/carro/usuario/"+usuarioId, List.class);
    }

    public List<Moto> getMotos(int usuarioId)
    {
        return restTemplate.getForObject("http://moto-service/moto/usuario/"+usuarioId, List.class);
    }

    public Carro saveCarro(int usuarioId, Carro carro)
    {
        carro.setUsuarioId(usuarioId);
        return carroFeignClient.save(carro);

    }

    public Moto saveMoto(int usuarioId, Moto moto)
    {
        moto.setUsuarioId(usuarioId);
        return motoFeignClient.save(moto);
    }
    public Map<String,Object> getUsuarioAndVehiculos(int usuarioId)
    {
        Map<String,Object> resultado = new HashMap<>();
        Usuario usuario = usuarioRepository.findById(usuarioId).orElse(null);

        if (usuario==null)
        {
            resultado.put("Mensaje","Usuario no encontrado");
            return resultado;
        }

        resultado.put("Usuario",usuario);
        List<Carro> carros = carroFeignClient.getCarros(usuarioId);

        if (carros.isEmpty())
        {
            resultado.put("Carros","Carro no encontrado");
        }else {
            resultado.put("Carros",carros);
        }

        List<Moto> motos=motoFeignClient.getMotos(usuarioId);

        if (motos.isEmpty())
        {
            resultado.put("Motos","Moto no encontrado");
        }else {
            resultado.put("Motos",motos);
        }

        return resultado;
    }
}
