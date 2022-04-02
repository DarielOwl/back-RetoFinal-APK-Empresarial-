package co.com.sofka.back.Controller;

import co.com.sofka.back.Model.Producto;
import co.com.sofka.back.Model.Proveedor;
import co.com.sofka.back.Service.Impl.ProductoServiceImpl;
import co.com.sofka.back.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class ProductoController {

    @Autowired
    ProductoServiceImpl productoServiceImpl;


    //-----------------CRUD PRODUCTO-----------------//

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

    //Actualizar Producto
    @PutMapping("/updateProducto/{id}")
    private Mono<ResponseEntity<Producto>> update(@PathVariable("id") String id, @RequestBody Producto producto) {
        return this.productoServiceImpl.update(id, producto)
                .flatMap(producto1 -> Mono.just(ResponseEntity.ok(producto1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    //Eliminar Producto
    @DeleteMapping("/removeProducto/{id}")
    private Mono<ResponseEntity<Producto>> delete(@PathVariable("id") String id) {
        return this.productoServiceImpl.delete(id)
                .flatMap(producto1 -> Mono.just(ResponseEntity.ok(producto1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }


}
