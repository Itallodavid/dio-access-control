package itallodavid.github.accesscontrol.controllers;

import itallodavid.github.accesscontrol.dto.ResponseExceptionDTO;
import itallodavid.github.accesscontrol.exceptions.ResponseException;
import itallodavid.github.accesscontrol.mappers.ResponseExceptionMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
@AllArgsConstructor
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {

    private final ResponseExceptionMapper mapper;

    @ExceptionHandler(ResponseException.class)
    protected ResponseEntity<ResponseExceptionDTO> handlerResponseException(final ResponseException exception) {
        return ResponseEntity.status(exception.getHttpStatus()).body(mapper.toDTO(exception));
    }

    // temporary implementation
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(
        Exception ex, @Nullable Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), headers, status);
    }

}
