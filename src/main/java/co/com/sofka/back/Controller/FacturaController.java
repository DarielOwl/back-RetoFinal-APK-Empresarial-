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

    //-----------------CRUD FACTURA-----------------//

    //TODO: El metodo POST no guarda en el campo productos, hacer que guarde una LISTA de productos
    //Guardar un Factura
    @PostMapping("/addFactura")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Factura> save(@RequestBody Factura factura) {
        return this.facturaServiceImpl.save(factura);
    }

    //Mostrar Todos los Factura
    @GetMapping(value = "/allFactura")
    private Flux<Factura> findAll() {
        return this.facturaServiceImpl.findAll();
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

    //TODO: Realizar Caso de Uso de Factura
    //-----------------CASO DE USO-----------------//
    //Llevar histórico de ventas
    /*Notas:
     * El historico de ventas son las facturas.
     * y podria ser voletaproveedor?
     * */




}
