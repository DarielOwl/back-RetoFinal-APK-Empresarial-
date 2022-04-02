package co.com.sofka.back.Controller;

import co.com.sofka.back.Model.Inventario;
import co.com.sofka.back.Model.Producto;
import co.com.sofka.back.Service.Impl.InventarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@CrossOrigin(origins = "*")
@RestController
public class InventarioController {

    //@Autowired
    InventarioServiceImpl inventarioService;

    //TODO: Realizar Caso de Uso de Inventario
    //-----------------CASO DE USO-----------------//
    //Llevar un inventario de sus productos
    //Mostrar Todos los Productos
    @GetMapping(value = "/allInventario")
    private Flux<Inventario> findAll() {
        return this.inventarioService.findAll();
    }
    //-----------------CASO DE USO-----------------//


}
