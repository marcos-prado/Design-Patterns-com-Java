package one.digitalinovation.gof.service;

import one.digitalinovation.gof.model.Cliente;

public class ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void cadastrar(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
