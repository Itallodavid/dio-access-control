package itallodavid.github.accesscontrol.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter @Setter
public class CompanyUpdateDTO implements Serializable {

    @Valid @NotNull
    protected AddressDTO address;

    @Size(min = 12, max = 13)
    protected String telephone;
}
