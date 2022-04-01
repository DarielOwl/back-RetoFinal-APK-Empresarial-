package co.com.sofka.back.Service.Impl;

import co.com.sofka.back.DTO.ProveedorDTO;
import co.com.sofka.back.Model.Proveedor;
import co.com.sofka.back.Repository.ProveedorRepository;
import co.com.sofka.back.Service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    ProveedorRepository proveedorRepository;

    //Guardar un Proveedor
    @Override
    public Mono<Proveedor> save(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    //Mostrar Todos los Proveedores
    @Override
    public Flux<Proveedor> findAll() {
        return this.proveedorRepository.findAll();
    }

    //Actualizar Proveedor
    @Override
    public Mono<Proveedor> update(String id, Proveedor proveedor) {
        return this.proveedorRepository.findById(id)
                .flatMap(proveedorUpdate -> {
                    proveedor.setId(id);
                    return save(proveedor);
                })
                .switchIfEmpty(Mono.empty());
    }

    //Eliminar Proveedor
    @Override
    public Mono<Proveedor> delete(String id) {
        return this.proveedorRepository
                .findById(id)
                .flatMap(proveedorDelete -> this.proveedorRepository.deleteById(proveedorDelete.getId()).thenReturn(proveedorDelete));
    }

}
