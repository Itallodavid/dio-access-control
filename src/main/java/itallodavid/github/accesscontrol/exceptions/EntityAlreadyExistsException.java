package itallodavid.github.accesscontrol.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class EntityAlreadyExistsException extends ResponseException {
    private final String error = "entity already existis";
    private final String description = "there is already an entity with this information";
    private final HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
}
