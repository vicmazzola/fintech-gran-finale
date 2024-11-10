package br.com.fiap.fintechfinplus.trabalho_fintech.Model;

import java.util.Date;

public class Emprestimo extends Cliente{
    private static int idEmprestimo;
    private static double valorEmprestimo;
    private static double tx_juros;
    private static double prazo;

    public Emprestimo(int id, String nome, String date_nascimento, String telefone, int idEmprestimo, double valorEmprestimo, double prazo, double tx_juros) {
        super(id, nome, date_nascimento, telefone, "default_email", "default_endereco"); // Adicione valores padrão para email e endereco
        this.idEmprestimo = idEmprestimo;
        this.valorEmprestimo = valorEmprestimo;
        this.prazo = prazo;
        this.tx_juros = tx_juros;
    }


    public static int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public static double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public static double getTx_juros() {
        return tx_juros;
    }

    public void setTx_juros(double tx_juros) {
        this.tx_juros = tx_juros;
    }

    public static double getPrazo() {
        return prazo;
    }

    public void setPrazo(double prazo) {
        this.prazo = prazo;
    }
}