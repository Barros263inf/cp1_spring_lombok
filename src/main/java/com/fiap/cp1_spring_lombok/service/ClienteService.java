package com.fiap.cp1_spring_lombok.service;

import com.fiap.cp1_spring_lombok.model.ClienteModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClienteService {

    private Long contadorId = 1L;
    private final List<ClienteModel> clientes = new ArrayList<>();

    // Metodo para listar todos os clientes
    public List<ClienteModel> listar () {
        return clientes;
    }

    // Metodo para buscar um cliente por ID
    public Optional<ClienteModel> buscar (Long id) {
        return clientes.stream().filter(
                c -> c.getId().equals(id)
        ).findFirst();
    }

    // Metodo para adicionar um cliente
    public ClienteModel adicionar (ClienteModel cliente) {
        cliente.setId(contadorId++);
        clientes.add(cliente);
        return cliente;
    }

    // Metodo para remover um cliente por ID
    public boolean remover (Long id) {
        return clientes.removeIf(
                c -> c.getId().equals(id)
        );
    }

}
