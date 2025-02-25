package com.fiap.cp1_spring_lombok.controller;

import com.fiap.cp1_spring_lombok.model.ClienteModel;
import com.fiap.cp1_spring_lombok.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
@AllArgsConstructor
public class ClienteController {

    private final ClienteService clienteService = new ClienteService();

    @GetMapping
    public List<ClienteModel> listarTodos () {
        return clienteService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteModel> buscarPorId (@PathVariable Long id) {
        Optional<ClienteModel> cliente = clienteService.buscar(id);
        return cliente.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ClienteModel adicionarCliente (@RequestBody ClienteModel cliente) {
        return clienteService.adicionar(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarCliente (@PathVariable Long id) {
        boolean removido = clienteService.remover(id);
        if (removido) {
            return ResponseEntity.ok("Excluido.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
