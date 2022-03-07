package xyz.qzwl.exception;

public class NotEnoughException extends RuntimeException{
    public NotEnoughException() {
        super();
    }
    public NotEnoughException(String msg) {
        super(msg);
    }
}
