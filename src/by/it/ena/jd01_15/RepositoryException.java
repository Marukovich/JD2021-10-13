package by.it.ena.jd01_15;

import java.io.FileNotFoundException;

public class RepositoryException extends RuntimeException {
    public RepositoryException(){
    }

    public RepositoryException(String message) {
        super(message);
    }

    public RepositoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public RepositoryException(Throwable cause) {
        super(cause);
    }

}