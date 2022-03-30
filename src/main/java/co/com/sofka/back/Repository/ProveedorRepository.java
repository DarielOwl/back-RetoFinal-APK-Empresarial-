package co.com.sofka.back.Repository;

import co.com.sofka.back.Model.Proveedor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProveedorRepository extends ReactiveMongoRepository<Proveedor,String> {
}
