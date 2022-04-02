package co.com.sofka.back.Service;

import co.com.sofka.back.Model.Cliente;
import co.com.sofka.back.Model.Proveedor;
import co.com.sofka.back.Service.Impl.ClienteServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class ClienteServiceTest {

    @Autowired
    ClienteServiceImpl clienteService;

    //Guardar la información de sus cliente
    @Test
    public void addClientTest() {
        Mono<Cliente> clienteMono = clienteService.save(new Cliente());
        StepVerifier.create(clienteMono).expectNext().verifyComplete();
    }


}
