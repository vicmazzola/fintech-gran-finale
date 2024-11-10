package br.com.fiap.fintechfinplus.trabalho_fintech.Model;

public class Conta {
    private int idConta;
    private int idCliente;
    private String tipoConta;
    private double saldo;


    public Conta(int idConta, int idCliente, String tipoConta, double saldo) {
        this.idConta = idConta;
        this.idCliente = idCliente;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public Conta() {
        this.saldo = 0.00;
    }

    public int getIdConta() {
        return idConta;
    }
    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        return "Conta{" +
                "idConta=" + idConta +
                ", idCliente=" + idCliente +
                ", tipoConta='" + tipoConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
