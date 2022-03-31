package co.com.sofka.back.Service;

import co.com.sofka.back.DTO.ProveedorDTO;
import co.com.sofka.back.Model.Proveedor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProveedorService {

    //Guardar un Proveedor
    Mono<Proveedor> save(Proveedor proveedor);

    //Mostrar Todos los Proveedores
    Flux<Proveedor> findAll();

    //Actualizar Proveedor
    Mono<Proveedor> update(String id, Proveedor proveedor);

    //Eliminar Proveedor
    Mono<Proveedor> delete(String id);
}
