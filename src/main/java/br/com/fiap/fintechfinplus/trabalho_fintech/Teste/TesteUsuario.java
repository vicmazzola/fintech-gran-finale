package br.com.fiap.fintechfinplus.trabalho_fintech.Teste;

import br.com.fiap.fintechfinplus.trabalho_fintech.Dao.Impl.UsuarioDaoImpl;
import br.com.fiap.fintechfinplus.trabalho_fintech.Model.Usuario;

import java.util.List;

public class TesteUsuario {
            public static void main(String[] args) {
                UsuarioDaoImpl usuarioDao = new UsuarioDaoImpl();

                try {
                    Usuario usuario1 = new Usuario();
                    usuario1.setIdCliente(1);
                    usuario1.setUsername("hugos2"); // Definindo um valor não nulo
                    usuario1.setSenha("senha123"); // Lembre-se de hashear a senha!

                    // Debug: Verificando os valores antes de cadastrar
                    System.out.println("ID Cliente: " + usuario1.getIdCliente());
                    System.out.println("Username: " + usuario1.getUsername());
                    System.out.println("Senha: " + usuario1.getSenha());

                    usuarioDao.cadastrarUsuario(usuario1); // Cadastrar o usuário
                    Usuario usuario2 = new Usuario();
                    usuario2.setIdCliente(2); // Defina o ID do cliente
                    usuario2.setUsername("user2");
                    usuario2.setSenha("password2"); // Lembre-se de hashear a senha antes de armazená-la!
                    usuarioDao.cadastrarUsuario(usuario2);


            // Listar todos os usuários cadastrados
            System.out.println("Lista de Usuários Cadastrados:");
            List<Usuario> usuarios = usuarioDao.listarUsuarios();
            for (Usuario usuario : usuarios) {
                System.out.println(usuario); // Assumindo que a classe Usuario possui um método toString adequado
            }

            // Excluir um usuário (opção de exclusão com cuidado!)
            // Exemplo: se você quiser excluir o usuário1
            usuarioDao.excluirUsuario(usuario1);

            // Listar novamente para verificar remoção
            System.out.println("Lista de Usuários Após Exclusão:");
            usuarios = usuarioDao.listarUsuarios();
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}

