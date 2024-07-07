package excessao.projeto.exceptions;

public class DomainException extends RuntimeException {
    @java.io.Serial
    private static final long serialVersionUID = 1L;

    public DomainException(String mensage) {
        super(mensage);
    }
}
