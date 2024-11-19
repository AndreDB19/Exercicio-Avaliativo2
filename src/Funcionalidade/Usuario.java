package Funcionalidade;
import excecoes.ContaNaoAchadaException;
import excecoes.FaltaNomeException;

import java.util.Map;

public class Usuario {
    private String nome;
    private String email;
    private Map<Integer, RedeSocial> redesSociais;

    public Usuario(Map<Integer,RedeSocial> redesSociais) {
        this.redesSociais = redesSociais;
    }

    public void usa() throws ContaNaoAchadaException {


        if (redesSociais.get(1) != null || redesSociais.get(2) != null){

            redesSociais.get(1).postarComentario();
            redesSociais.get(1).postarFoto();
            redesSociais.get(1).postarVideo();
            redesSociais.get(2).curtirPublicacao();
            ((Facebook) redesSociais.get(2)).fazStreaming();
            ((Facebook) redesSociais.get(2)).compartilhar();
        }
        else {
            throw new ContaNaoAchadaException("Conta não achada");
        }

    }

    public String getNome() {
        if (nome!= null)
        {return nome;}
        else {
            throw new FaltaNomeException("Sem Nome");
        }
    }
}
