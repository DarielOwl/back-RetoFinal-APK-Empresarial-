package co.com.sofka.back.Service;

import co.com.sofka.back.Model.Factura;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FacturaService {

    //Guardar un Factura
    Mono<Factura> save(Factura factura);

    //Mostrar Todos los Factura
    Flux<Factura> findAll();

    //Actualizar Factura
    Mono<Factura> update(String id, Factura factura);

    //Eliminar Factura
    Mono<Factura> delete(String id);
}
