package co.com.sofka.back.Controller;

import co.com.sofka.back.Model.Producto;
import co.com.sofka.back.Model.Proveedor;
import co.com.sofka.back.Service.Impl.ProductoServiceImpl;
import co.com.sofka.back.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class ProductoController {

    @Autowired
    ProductoServiceImpl productoServiceImpl;


    //-----------------CRUD PRODUCTO-----------------

    //Guardar un Producto
    @PostMapping("/addProducto")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Producto> save(@RequestBody Producto producto) {
        return this.productoServiceImpl.save(producto);
    }

    //Mostrar Todos los Productos
    @GetMapping(value = "/allProducto")
    private Flux<Producto> findAll() {
        return this.productoServiceImpl.findAll();
    }

}
