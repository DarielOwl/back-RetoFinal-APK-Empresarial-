package co.com.sofka.back.Controller;

import co.com.sofka.back.DTO.ProveedorDTO;
import co.com.sofka.back.Model.Cliente;
import co.com.sofka.back.Model.Proveedor;
import co.com.sofka.back.Service.Impl.ProductoServiceImpl;
import co.com.sofka.back.Service.Impl.ProveedorServiceImpl;
import co.com.sofka.back.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class ProveedorController {

    @Autowired
    ProveedorServiceImpl proveedorServiceImpl;

    //-----------------CASO DE USO-----------------//
    // Guardar la información de sus proveedores
    //Guardar un Proveedor
    @PostMapping("/addProveedor")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Proveedor> save(@RequestBody Proveedor proveedor) {
        return this.proveedorServiceImpl.save(proveedor);
    }
    //-----------------CASO DE USO-----------------//

    //-----------------CRUD PROVEEDOR-----------------//
    //Mostrar Todos los Proveedores
    @GetMapping(value = "/allProveedor")
    private Flux<Proveedor> findAll() {
        return this.proveedorServiceImpl.findAll();
    }

    //Actualizar Proveedor
    @PutMapping("/updateProveedor/{id}")
    private Mono<Proveedor> update(@PathVariable("id") String id, @RequestBody Proveedor proveedor) {
        return this.proveedorServiceImpl.update(id, proveedor)
                .flatMap(proveedor1 -> Mono.just((proveedor1))
                .switchIfEmpty(Mono.empty()));
    }

    //Eliminar Proveedor
    @DeleteMapping("/removeProveedor/{id}")
    private Mono<Proveedor> delete(@PathVariable("id") String id) {
        return this.proveedorServiceImpl.delete(id)
                .flatMap(proveedor1 -> Mono.just((proveedor1)))
                .switchIfEmpty(Mono.empty());
    }




    /*Notas:
    * Al guardar el proveedor, se deberia guardar voletaproveedor?
    * */


}
