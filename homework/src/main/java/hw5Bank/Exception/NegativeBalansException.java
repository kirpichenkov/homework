package hw5Bank.Exception;

public class NegativeBalansException extends RuntimeException {
    public NegativeBalansException(String message) {
        super(message);
    }
}
