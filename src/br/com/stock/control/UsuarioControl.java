package br.com.stock.control;

import br.com.stock.dao.UsuarioDao;
import br.com.stock.daoimpl.UsuarioDaoImpl;
import br.com.stock.model.Usuario;
import br.com.stock.view.PainelLogin;
import br.com.stock.view.usuario.PainelUsuarioBusca;
import br.com.stock.view.usuario.PainelUsuarioCadastro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alunos
 */
public class UsuarioControl {

    private UsuarioControl USUARIO_CONTROL;

    public static UsuarioDao USUARIO_DAO = new UsuarioDaoImpl();

    public UsuarioControl() {
    }

    public Boolean adicionar() {
        Usuario user = new Usuario();
        user.setId(1);
        user.setAtualizado(null);
        user.setLogin(PainelUsuarioCadastro.campoLogin.getText());
        user.setSenha(PainelUsuarioCadastro.campoSenha.getText());
        if (PainelUsuarioCadastro.checkAtivo.isSelected()) {
            user.setAtivo(true);
        } else {
            user.setAtivo(false);
        }
        if (PainelUsuarioCadastro.checkTrocarSenha.isSelected()) {
            user.setPrimeiroLogin(true);
        } else {
            user.setPrimeiroLogin(false);
        }

        try {
            Boolean inserido = USUARIO_DAO.inserir(user);
            if (inserido == true) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Não consegui gravar.");
                return false;
            }
        } catch (Exception exception) {
            System.out.println("Deu ruim na hora de inserir");
            return false;
        }
    }

    public List<Usuario> pesquisar(String termo) {
        List<Usuario> retorno = new ArrayList<>();

        try {
            List<?> objs = USUARIO_DAO.pesquisarTodos();
            List<Usuario> USUARIOS = (List<Usuario>) (Object) objs;
            for (Usuario u : USUARIOS) {
                if (u.getLogin().toLowerCase().contains(termo.toLowerCase())) {
                    retorno.add(u);
                }
            }

        } catch (Exception exception) {
        }
        return retorno;
    }

    public void mostrandoUsuariosNaTabelaAction() {
        List<Usuario> usuarios = pesquisar("");
        adicionarListaUsuariosTabela(usuarios);

    }

    public static void adicionarListaUsuariosTabela(List<Usuario> usuarios) {
        String[] colunas = {"ID", "USUARIO", "ATIVO", "ATUALIZADO"};
        String[][] dados = new String[usuarios.size()][colunas.length];
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario user = usuarios.get(i);
            dados[i][0] = user.getId().toString();
            dados[i][1] = user.getLogin();
            if (user.getAtivo() == true) {
                dados[i][2] = "Sim";
            } else {
                dados[i][2] = "Não";
            }
            dados[i][3] = String.valueOf(user.getAtualizado());
        }
        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
        PainelUsuarioBusca.tabelaUsuario.setModel(modelo);
    }

    public void buscandoUsuariosNaTabelaAction() {
        List<Usuario> usuarios = null;
        try {
            usuarios = pesquisar(PainelUsuarioBusca.campoPesquisar.getText());
        } catch (Exception exception) {
        }
        adicionarListaUsuariosTabela(usuarios);
    }

    public Boolean pesquisarLogin(String termo) {
        List<Usuario> retorno = new ArrayList<>();

        try {
            List<?> objs = USUARIO_DAO.pesquisarTodos();
            List<Usuario> USUARIOS = (List<Usuario>) (Object) objs;
            for (Usuario u : USUARIOS) {
                if (u.getLogin().toLowerCase().equals(termo.toLowerCase())) {
                    return true;
                }
            }

        } catch (Exception exception) {
        }
        return false;
    }

    public Boolean pesquisarSenha(String termo) {
        List<Usuario> retorno = new ArrayList<>();

        try {
            List<?> objs = USUARIO_DAO.pesquisarTodos();
            List<Usuario> USUARIOS = (List<Usuario>) (Object) objs;
            for (Usuario u : USUARIOS) {
                if (u.getSenha().toLowerCase().equals(termo.toLowerCase())) {
                    return true;
                }
            }

        } catch (Exception exception) {
        }
        return false;
    }

    public Boolean verificandoLoginAction() {
        Boolean loginOk = pesquisarLogin(PainelLogin.campoLogin.getText());
        Boolean senhaOk = pesquisarSenha(PainelLogin.campoSenha.getText());
        if (loginOk && senhaOk) {
            return true;
        } else {
            return false;
        }
    }

}
