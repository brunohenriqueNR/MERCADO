
package service;

import model.Cliente;
import repository.ClienteRepositoryInterface;

import java.sql.SQLException;
import java.util.List;

/**
 * Camada de SERVIÇO: guarda as REGRAS DE NEGÓCIO.
 *
 * O CLI (tela) não fala direto com o banco: ele chama o Service,
 * que valida as regras e depois usa o Repository para persistir.
 */
public class ClienteService {

    private final ClienteRepositoryInterface clienteRepository;

    // Recebe o repositório pelo construtor
    public ClienteService(ClienteRepositoryInterface clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void cadastrar(Cliente cliente) throws SQLException {
        clienteRepository.salvar(cliente);
    }

    public List<Cliente> listar() throws SQLException {
        return clienteRepository.listar();
    }

    public void excluir(int id) throws SQLException {
        if (!clienteRepository.deletar(id)) {
            throw new IllegalArgumentException(
                "Cliente com ID " + id + " não encontrado."
            );
        }
    }
}
