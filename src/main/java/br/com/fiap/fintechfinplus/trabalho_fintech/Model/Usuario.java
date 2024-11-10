package br.com.fiap.fintechfinplus.trabalho_fintech.Model;

public class Usuario {
    private int idUsuario;
    private int idCliente;
    private String ursername;
    private String senha;


    public Usuario(int idCliente, int idUsuario, String ursername, String senha) {
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
        this.ursername = ursername;
        this.senha = senha;
    }

    //Construtor padrao
    public Usuario() {

    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getUrsername() {
        return ursername;
    }

    public void setUrsername(String ursername) {
        this.ursername = ursername;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public void setUsername(String username) {
        this.ursername = username; // Corrigido para atribuir o valor corretamente
    }

    public String getUsername() {
        return "";
    }

}
