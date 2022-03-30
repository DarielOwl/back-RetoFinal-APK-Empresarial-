package co.com.sofka.back.Service.Impl;

import co.com.sofka.back.Repository.FacturaRepository;
import co.com.sofka.back.Service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;

public class FacturaServiceImpl implements FacturaService {

    @Autowired
    FacturaRepository facturaRepository;

}
