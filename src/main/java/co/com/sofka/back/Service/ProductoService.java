package co.com.sofka.back.Service;

import co.com.sofka.back.Model.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoService {

    //Guardar un Producto
    Mono<Producto> save(Producto producto);

    //Mostrar Todos los Productos
    Flux<Producto> findAll();

    //Actualizar Producto
    Mono<Producto> update(String id, Producto producto);

    //Eliminar Producto
    Mono<Producto> delete(String id);
}
