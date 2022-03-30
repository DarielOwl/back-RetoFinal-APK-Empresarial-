package co.com.sofka.back.Repository;

import co.com.sofka.back.Model.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClienteRepository extends ReactiveMongoRepository<Cliente,String> {

}
