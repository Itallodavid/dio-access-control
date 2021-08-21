package itallodavid.github.accesscontrol.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter @Setter
public class CompanyCreationDTO implements Serializable {

    @NotEmpty @Size(min = 14, max = 14) @Pattern(regexp = "\\d{14}")
    private String cnpj;

    @Valid @NotNull
    protected AddressDTO address;

    @Size(min = 12, max = 13)
    protected String telephone;
}
