package co.com.sofka.back.Repository;

import co.com.sofka.back.Model.VolanteProveedor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VolanteProveedorRepository extends ReactiveMongoRepository<VolanteProveedor,String> {

}
