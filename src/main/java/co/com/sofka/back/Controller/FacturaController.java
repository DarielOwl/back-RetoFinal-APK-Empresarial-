package co.com.sofka.back.Controller;

import co.com.sofka.back.Model.Factura;
import co.com.sofka.back.Model.Producto;
import co.com.sofka.back.Service.FacturaService;
import co.com.sofka.back.Service.Impl.FacturaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class FacturaController {

    @Autowired
    FacturaServiceImpl facturaServiceImpl;


    //-----------------CASO DE USO-----------------//
    //Llevar histórico de ventas
    //Mostrar Todos los Factura
    @GetMapping(value = "/allFactura")
    private Flux<Factura> findAll() {
        return this.facturaServiceImpl.findAll();
    }
    //-----------------CASO DE USO-----------------//


    //-----------------CRUD FACTURA-----------------//
    //Guardar un Factura
    @PostMapping("/addFactura")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Factura> save(@RequestBody Factura factura) {
        return this.facturaServiceImpl.save(factura);
    }

    //Actualizar Factura
    @PutMapping("/updateFactura/{id}")
    private Mono<Factura> update(@PathVariable("id") String id, @RequestBody Factura factura) {
        return this.facturaServiceImpl.update(id, factura)
                .flatMap(factura1 -> Mono.just((factura1))
                .switchIfEmpty(Mono.empty()));
    }

    //Eliminar Factura
    @DeleteMapping("/removeFactura/{id}")
    private Mono<Factura> delete(@PathVariable("id") String id) {
        return this.facturaServiceImpl.delete(id)
                .flatMap(factura1 -> Mono.just((factura1))
                .switchIfEmpty(Mono.empty()));
    }


}
