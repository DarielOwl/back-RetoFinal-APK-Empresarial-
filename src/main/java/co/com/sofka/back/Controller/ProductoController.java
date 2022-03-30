package co.com.sofka.back.Controller;

import co.com.sofka.back.Model.Producto;
import co.com.sofka.back.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class ProductoController {

    @Autowired
    ProductoService productoService;

}
