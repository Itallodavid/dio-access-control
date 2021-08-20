package itallodavid.github.accesscontrol.controllers;

import itallodavid.github.accesscontrol.dto.ResponseExceptionDTO;
import itallodavid.github.accesscontrol.exceptions.ResponseException;
import itallodavid.github.accesscontrol.mappers.ResponseExceptionMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@AllArgsConstructor
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {

    private final ResponseExceptionMapper mapper;

    @ExceptionHandler(ResponseException.class)
    protected ResponseEntity<ResponseExceptionDTO> handlerResponseException(final ResponseException exception) {
        return ResponseEntity.status(exception.getHttpStatus()).body(mapper.toDTO(exception));
    }
}
