package by.epamtc.shamuradova.appliance_search.service.exception;

public class ServiceException extends Exception {
    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException() {
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
