package by.epamtc.shamuradova.appliance_search.dao.exception;

public class ReaderException extends DAOException {
    public ReaderException(String message) {
        super(message);
    }

    public ReaderException(Throwable cause) {
        super(cause);
    }

    public ReaderException() {
    }

    public ReaderException(String message, Throwable cause) {
        super(message, cause);
    }
}
