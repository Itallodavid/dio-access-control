package itallodavid.github.accesscontrol.mappers;

import itallodavid.github.accesscontrol.dto.ResponseExceptionDTO;
import itallodavid.github.accesscontrol.exceptions.ResponseException;
import org.springframework.stereotype.Component;

@Component
public class ResponseExceptionMapper {

    public ResponseExceptionDTO toDTO(final ResponseException exception) {
        return ResponseExceptionDTO.builder()
            .error(exception.getError())
            .description(exception.getDescription())
            .statusCode(exception.getHttpStatus().value())
            .statusReason(exception.getHttpStatus().getReasonPhrase())
            .statusSeries(exception.getHttpStatus().series().value())
            .build();
    }
}
