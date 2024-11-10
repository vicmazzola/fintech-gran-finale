package br.com.fiap.fintechfinplus.trabalho_fintech.Model;

import java.util.Date;

public class Cartao {

    private int idCartao;
    private int idConta; // Link to Conta
    private String numeroCartao;
    private Date dataValidade;
    private int limiteCredito; // For credit cards


    // Constructors
    public Cartao() {
    }

    public Cartao(int idCartao, int idConta, String numeroCartao, Date dataValidade,  int limiteCredito) {
        this.idCartao = idCartao;
        this.idConta = idConta;
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.limiteCredito = limiteCredito;
    }

    // Getters and Setters
    public int getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(int idCartao) {
        this.idCartao = idCartao;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }


    @Override
    public String toString() { // Added toString() method for debugging and logging
        return "Cartao{" +
                "idCartao=" + idCartao +
                ", idConta=" + idConta +
                ", numeroCartao='" + numeroCartao + '\'' +
                ", dataValidade=" + dataValidade +
                ", limiteCredito=" + limiteCredito +
                '}';
    }
}