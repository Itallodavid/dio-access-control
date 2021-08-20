package itallodavid.github.accesscontrol.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter @Setter
public class AddressDTO implements Serializable {

    @NotEmpty @Size(min = 10, max = 200)
    private String street;

    @NotEmpty @Size(min = 10, max = 150)
    private String district;

    @NotEmpty @Size(min = 2, max = 2)
    private String state;

    @NotEmpty @Size(min = 3, max = 50)
    private String country;

    @NotEmpty @Size(min = 8, max = 8)
    private String zipCode;
}
