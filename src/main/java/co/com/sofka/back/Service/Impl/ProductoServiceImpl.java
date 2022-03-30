package co.com.sofka.back.Service.Impl;

import co.com.sofka.back.Repository.ProductoRepository;
import co.com.sofka.back.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

}
