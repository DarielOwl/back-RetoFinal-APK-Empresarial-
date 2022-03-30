package co.com.sofka.back.Repository;

import co.com.sofka.back.Model.Factura;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface FacturaRepository extends ReactiveMongoRepository<Factura,String> {

}
