package transactions;

public class TMException extends Exception {
    private static final long serialVersionUID = 1L;
    public TMException() {}
    public TMException(String msg) {
        super(msg);
    }
}
