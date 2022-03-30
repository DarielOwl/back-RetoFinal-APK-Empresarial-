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

    //Actualizar Cliente
    @Override
    public Mono<Cliente> update(String id, Cliente cliente) {
        return this.clienteRepository.findById(id)
                .flatMap(clienteUpdate -> {
                    cliente.setId(id);
                    return save(cliente);
                })
                .switchIfEmpty(Mono.empty());
    }

    //Eliminar Cliente
    @Override
    public Mono<Cliente> delete(String id) {
        return this.clienteRepository
                .findById(id)
                .flatMap(clienteDelete -> this.clienteRepository.deleteById(clienteDelete.getId()).thenReturn(clienteDelete));
    }


}

