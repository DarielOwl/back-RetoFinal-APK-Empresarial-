package co.com.sofka.back.Repository;

import co.com.sofka.back.Model.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductoRepository extends ReactiveMongoRepository<Producto,String> {
}
