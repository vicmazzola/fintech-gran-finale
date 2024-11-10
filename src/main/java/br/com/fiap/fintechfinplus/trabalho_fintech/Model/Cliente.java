package br.com.fiap.fintechfinplus.trabalho_fintech.Model;

public class Cliente {

    private int idCliente;
    private String nome;
    private String date_nascimento; // Mantido como String
    private String telefone;
    private String endereco;
    private String email;

    // Construtor com todos os atributos
    public Cliente(int idCliente, String nome, String date_nascimento, String telefone, String email, String endereco) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.date_nascimento = date_nascimento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    // Construtor padrão
    public Cliente() {
    }

    // Getters e Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDate_nascimento() { // Mantido como String
        return date_nascimento;
    }

    public void setDate_nascimento(String date_nascimento) { // Mantido como String
        this.date_nascimento = date_nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
