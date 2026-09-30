package com.nexacrm.nexa_java.service;

import com.nexacrm.nexa_java.model.Service;
import com.nexacrm.nexa_java.repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ServiceService {

    private final ServiceRepository repository;

    public Service salvar(Service service) {
        return repository.save(service);
    }

    public List<Service> listarTodos() {
        return repository.findAll();
    }
}