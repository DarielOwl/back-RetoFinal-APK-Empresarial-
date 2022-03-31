package co.com.sofka.back.Repository;

import co.com.sofka.back.Model.Inventario;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface InventarioRepository extends ReactiveMongoRepository<Inventario,String> {

}
