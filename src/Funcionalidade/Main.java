package Funcionalidade;

import excecoes.ContaNaoAchadaException;
import excecoes.FaltaNomeException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, RedeSocial> redesSociais = new HashMap<>();
        RedeSocial Facebook = new Facebook();
        RedeSocial Instagram = new Instagram();
        redesSociais.put(2,Facebook);
        redesSociais.put(1,Instagram);

        Usuario user = new Usuario(redesSociais);

        try{
            user.usa();
        }
        catch (ContaNaoAchadaException e)
        {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(user.getNome());
        }catch (FaltaNomeException e)
        {
            System.out.println(e.getMessage());
        }

    }
}