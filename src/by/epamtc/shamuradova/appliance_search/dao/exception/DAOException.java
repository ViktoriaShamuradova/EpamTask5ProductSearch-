package by.epamtc.shamuradova.appliance_search.dao.exception;

public class DAOException extends Exception {
    public DAOException(String message) {
        super(message);
    }

    public DAOException(Throwable cause) {
        super(cause);
    }

    public DAOException() {
    }

    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }
}

