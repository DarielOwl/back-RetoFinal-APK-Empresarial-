package co.com.sofka.back.Service.Impl;

import co.com.sofka.back.Repository.ClienteRepository;
import co.com.sofka.back.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

}
