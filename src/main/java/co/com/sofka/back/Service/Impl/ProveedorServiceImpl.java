package co.com.sofka.back.Service.Impl;

import co.com.sofka.back.Repository.ProveedorRepository;
import co.com.sofka.back.Service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    ProveedorRepository proveedorRepository;

}
