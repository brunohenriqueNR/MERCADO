
package model;

/**
 * Representa um cliente.
 */
public class Cliente {

    // Atributos privados (encapsulamento)
    private Integer id;
    private String nome;
    private String telefone;
    private String email;

    // Construtor
    public Cliente(Integer id, String nome, String telefone, String email) {
        this.id = id;
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setEmail(email);
    }

    // Retorna os dados do cliente
    public String exibirDetalhes() {
        return String.format(
            "[%d] %-20s | Telefone: %-15s | Email: %s",
            id, nome, telefone, email
        );
    }

    // ---------------- Getters e Setters ----------------

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do cliente é obrigatório.");
        }
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isBlank()) {
            throw new IllegalArgumentException("O telefone do cliente é obrigatório.");
        }
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank() || !email.contains("@")) {
            throw new IllegalArgumentException("Informe um email válido.");
        }
        this.email = email;
    }
}
