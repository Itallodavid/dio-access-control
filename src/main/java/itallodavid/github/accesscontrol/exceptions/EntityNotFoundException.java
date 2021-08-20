package itallodavid.github.accesscontrol.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class EntityNotFoundException extends ResponseException {
    private final String error = "entity not found";
    private final String description = "the requested entity was not found in the database";
    private final HttpStatus httpStatus = HttpStatus.NOT_FOUND;
}
