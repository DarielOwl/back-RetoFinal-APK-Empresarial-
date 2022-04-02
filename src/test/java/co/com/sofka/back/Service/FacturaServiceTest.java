package co.com.sofka.back.Service;

import co.com.sofka.back.Model.Factura;
import co.com.sofka.back.Service.Impl.FacturaServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class FacturaServiceTest {

    @Autowired
    FacturaServiceImpl facturaService;

    //Mostrar todas las ventas
    @Test
    public void allFacturaTest() {
        Flux<Factura> facturaFlux = facturaService.findAll();
        StepVerifier.create(facturaFlux).expectNext().verifyComplete();
    }
}
