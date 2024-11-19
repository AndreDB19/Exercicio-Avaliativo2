package excecoes;

public class FaltaNomeException extends RuntimeException{
    public FaltaNomeException(String message) {
        super(message);
    }
}
