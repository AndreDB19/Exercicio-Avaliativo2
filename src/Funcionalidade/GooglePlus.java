package Funcionalidade;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Funcionalidade.GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no Funcionalidade.GooglePlus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no Funcionalidade.GooglePlus!");
    }

    @Override
    public void curtirPublicacao()
    {
        System.out.println("curtiu uma publicação no Funcionalidade.GooglePlus!");
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou uma publicação no Funcionalidade.GooglePlus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("realizou uma vídeo conferência no Funcionalidade.GooglePlus");
    }
}
