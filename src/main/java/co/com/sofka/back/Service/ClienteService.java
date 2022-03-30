package co.com.sofka.back.Service;

import co.com.sofka.back.Model.Cliente;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClienteService {

    //Guardar un Cliente
    Mono<Cliente> save(Cliente cliente);

    //Mostrar Todos los Clientes
    Flux<Cliente> findAll();

    //Actualizar Cliente
    Mono<Cliente> update(String id, Cliente cliente);

    //Eliminar Cliente
    Mono<Cliente> delete(String id);
}
