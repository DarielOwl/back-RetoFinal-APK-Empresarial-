package co.com.sofka.back.Service;

import co.com.sofka.back.Model.Factura;
import co.com.sofka.back.Model.Producto;
import co.com.sofka.back.Service.Impl.FacturaServiceImpl;
import co.com.sofka.back.Service.Impl.ProductoServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class ProductoServiceTest {

    @Autowired
    ProductoServiceImpl productoService;

    //Mostrar todas las ventas
    @Test
    public void allInventarioTest() {
        Flux<Producto> productoFlux = productoService.findAll();
        StepVerifier.create(productoFlux).expectNext().verifyComplete();
    }

}
