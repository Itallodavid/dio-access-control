package itallodavid.github.accesscontrol.models;

import itallodavid.github.accesscontrol.models.embedded.Address;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity @Audited
@Getter @Setter
public class Company {

    @Id @Column(length = 14, nullable = false, unique = true)
    private String cnpj;

    @Embedded
    private Address address;

    @Column(length = 13)
    private String telephone;
}
