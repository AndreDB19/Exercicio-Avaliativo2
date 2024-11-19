package Funcionalidade;

public class Twitter extends RedeSocial implements Compartilhamento {

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Funcionalidade.Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Funcionalidade.Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no Funcionalidade.Twitter!");
    }

    @Override
    public void curtirPublicacao()
    {
        System.out.println("curtiu uma publicação no Funcionalidade.Twitter!");
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou uma publicação no Funcionalidade.Twitter!");
    }

}
