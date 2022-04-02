package co.com.sofka.back.Service;

import co.com.sofka.back.Model.Inventario;
import reactor.core.publisher.Flux;

public interface InventarioService {

    Flux<Inventario> findAll();
}
