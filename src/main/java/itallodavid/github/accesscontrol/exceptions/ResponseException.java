package itallodavid.github.accesscontrol.exceptions;

import org.springframework.http.HttpStatus;

public abstract class ResponseException extends Throwable {
    abstract public String getError();
    abstract public String getDescription();
    abstract public HttpStatus getHttpStatus();
}
