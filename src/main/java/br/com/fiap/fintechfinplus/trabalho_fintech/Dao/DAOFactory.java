package br.com.fiap.fintechfinplus.trabalho_fintech.Dao;


import br.com.fiap.fintechfinplus.trabalho_fintech.Dao.Impl.ContaDaoImpl;

public class DAOFactory {
    public static ContaDao getContaDao() {
        return new ContaDaoImpl();
    }
}