package co.com.sofka.back.Service.Impl;

import co.com.sofka.back.Repository.VolanteProveedorRepository;
import co.com.sofka.back.Service.VolanteProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VolanteProveedorServiceImpl implements VolanteProveedorService {

    @Autowired
    VolanteProveedorRepository volanteProveedorRepository;

}
