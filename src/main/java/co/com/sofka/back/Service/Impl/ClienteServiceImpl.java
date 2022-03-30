package co.com.sofka.back.Service.Impl;

import co.com.sofka.back.Model.Cliente;
import co.com.sofka.back.Repository.ClienteRepository;
import co.com.sofka.back.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    //Guardar un Cliente
    @Override
    public Mono<Cliente> save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    //Mostrar Todos los Clientes
    @Override
    public Flux<Cliente> findAll() {
        return this.clienteRepository.findAll();
    }




}

