package itallodavid.github.accesscontrol.dto;

import javax.validation.constraints.Size;
import java.io.Serializable;

public class JobDTO implements Serializable {

    @Size(min = 3, max = 150)
    private String name;

    @Size(min = 5, max = 255)
    private String description;
}
