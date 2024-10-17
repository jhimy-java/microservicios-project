package com.usuario.service.feignclients;

import com.usuario.service.modelos.Carro;
import com.usuario.service.modelos.Moto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "carro-service", url = "http://localhost:8002")
public interface CarroFeignClient {

    @PostMapping("/carro")  // Define la ruta directamente en el método
    public Carro save(@RequestBody Carro carro);

    @GetMapping("carro/usuario/{usuarioId}")
    public List<Carro> getCarros(@PathVariable("usuarioId") int usuarioId);

}
