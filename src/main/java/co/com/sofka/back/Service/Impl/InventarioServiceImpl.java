package co.com.sofka.back.Service.Impl;

import co.com.sofka.back.Model.Inventario;
import co.com.sofka.back.Repository.ClienteRepository;
import co.com.sofka.back.Repository.InventarioRepository;
import co.com.sofka.back.Service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;

public class InventarioServiceImpl implements InventarioService {

    @Autowired
    InventarioRepository inventarioRepository;

    @Override
    public Flux<Inventario> findAll() {
        return this.inventarioRepository.findAll();
    }
}
