
package repository;

import model.Cliente;

import java.sql.SQLException;
import java.util.List;

/**
 * REPOSITORY PATTERN: contrato (interface) com as operações de banco de Cliente.
 *
 * Quem usa (o Service) depende só desta interface, não da implementação.
 * Assim poderíamos trocar JDBC por outra tecnologia sem mexer no Service.
 */
public interface ClienteRepositoryInterface {

    void salvar(Cliente cliente) throws SQLException;

    List<Cliente> listar() throws SQLException;

    /** Retorna true se excluiu, false se o id não existia. */
    boolean deletar(int id) throws SQLException;
}
