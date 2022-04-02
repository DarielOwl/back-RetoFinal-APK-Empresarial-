package co.com.sofka.back.Controller;

import co.com.sofka.back.Model.Cliente;
import co.com.sofka.back.Service.Impl.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class ClienteController {

    @Autowired
    ClienteServiceImpl clienteServiceImpl;

    //-----------------CRUD CLIENTE-----------------//

    //Guardar un Cliente
    @PostMapping("/addCliente")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Cliente> save(@RequestBody Cliente cliente) {
        return this.clienteServiceImpl.save(cliente);
    }

    //Mostrar Todos los Clientes
    @GetMapping(value = "/allCliente")
    private Flux<Cliente> findAll() {
        return this.clienteServiceImpl.findAll();
    }

    //TODO: Mejorar Funcion, Sacarle el "ResponseEntity", se esta trabajando con webflux
    //Actualizar Cliente
    @PutMapping("/updateCliente/{id}")
    private Mono<ResponseEntity<Cliente>> update(@PathVariable("id") String id, @RequestBody Cliente cliente) {
        return this.clienteServiceImpl.update(id, cliente)
                .flatMap(cliente1 -> Mono.just(ResponseEntity.ok(cliente1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    //TODO: Mejorar Funcion, Sacarle el "ResponseEntity", se esta trabajando con webflux
    //Eliminar Cliente
    @DeleteMapping("/removeCliente/{id}")
    private Mono<ResponseEntity<Cliente>> delete(@PathVariable("id") String id) {
        return this.clienteServiceImpl.delete(id)
                .flatMap(cliente1 -> Mono.just(ResponseEntity.ok(cliente1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));

    }

    //TODO: Realizar Caso de Uso de Cliente
    //-----------------CASO DE USO-----------------//
    //Raúl debe poder guardar la información de sus cliente

}
