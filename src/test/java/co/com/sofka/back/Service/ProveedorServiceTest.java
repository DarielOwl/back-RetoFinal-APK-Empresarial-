package co.com.sofka.back.Service;

import co.com.sofka.back.Model.Proveedor;
import co.com.sofka.back.Service.Impl.ProveedorServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class ProveedorServiceTest {


    @Autowired
    ProveedorServiceImpl proveedorService;

    //Guardar la información de sus proveedores
    @Test
    public void addProveedorTest() {
        Mono<Proveedor> proveedorMono = proveedorService.save(new Proveedor());
        StepVerifier.create(proveedorMono).expectNext().verifyComplete();
    }

}
