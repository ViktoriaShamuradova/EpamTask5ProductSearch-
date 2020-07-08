package by.epamtc.shamuradova.good_search.dao.exception;

public class WriterException extends RuntimeException {
    public WriterException(String message){
        super(message);
    }
    public WriterException(Throwable cause){
        super(cause);
    }
    public WriterException(){}
    public WriterException(String message, Throwable cause){
        super(message, cause);
    }
}
