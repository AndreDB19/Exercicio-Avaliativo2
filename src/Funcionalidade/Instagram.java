package Funcionalidade;

public class Instagram extends RedeSocial {
    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Funcionalidade.Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Funcionalidade.Instagram!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no Funcionalidade.Instagram!");
    }

    @Override
    public void curtirPublicacao()
    {
        System.out.println("curtiu uma publicação no Funcionalidade.Instagram!");
    }
}
