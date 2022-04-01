package co.com.sofka.back.Service.Impl;

import co.com.sofka.back.Model.Factura;
import co.com.sofka.back.Repository.FacturaRepository;
import co.com.sofka.back.Service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    FacturaRepository facturaRepository;

    //Guardar un Factura
    @Override
    public Mono<Factura> save(Factura factura) {
        return facturaRepository.save(factura);
    }

    //Mostrar Todos los Factura
    @Override
    public Flux<Factura> findAll() {
        return this.facturaRepository.findAll();
    }

    //Actualizar Factura
    @Override
    public Mono<Factura> update(String id, Factura factura) {
        return this.facturaRepository.findById(id)
                .flatMap(facturaUpdate -> {
                    factura.setId(id);
                    return save(factura);
                })
                .switchIfEmpty(Mono.empty());
    }

    //Eliminar Factura
    @Override
    public Mono<Factura> delete(String id) {
        return this.facturaRepository
                .findById(id)
                .flatMap(facturaDelete -> this.facturaRepository
                                                .deleteById(facturaDelete.getId()).thenReturn(facturaDelete));
    }


}
