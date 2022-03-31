package co.com.sofka.back.Service.Impl;

import co.com.sofka.back.Model.Producto;
import co.com.sofka.back.Repository.ProductoRepository;
import co.com.sofka.back.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    //Guardar un Producto
    @Override
    public Mono<Producto> save(Producto producto) {
        return productoRepository.save(producto);
    }

    //Mostrar Todos los Productos
    @Override
    public Flux<Producto> findAll() {
        return this.productoRepository.findAll();
    }
}
