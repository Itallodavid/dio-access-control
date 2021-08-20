package itallodavid.github.accesscontrol.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter @Builder
public class ResponseExceptionDTO implements Serializable {
    private String error;
    private String description;
    private int statusCode;
    private String statusReason;
    private int statusSeries;
}
