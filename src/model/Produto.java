package model;

/**
 * Representa um produto.
 */
public class Produto {
    // ENCAPSULAMENTO: tudo private. Se fosse public, qualquer classe
    // poderia colocar, por exemplo, um preço negativo.
    private Integer id;
    private String nome;
    private double preco;

    public Produto(Integer id, String nome, double preco) {
        // Usamos os setters no construtor para reaproveitar as validações
        this.id = id;
        this.setNome(nome);
        this.setPreco(preco);
    }

    /** Retorna uma linha com os dados do produto. */
    public String exibirDetalhes() {
        return String.format("[%d] %-20s | R$ %8.2f", id, nome, preco);
    }

    // ---------------- Getters e Setters (com validação) ----------------

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
            throw new IllegalArgumentException("O nome do produto é obrigatório.");
        }
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }
}
