package itallodavid.github.accesscontrol.models;

import itallodavid.github.accesscontrol.models.embedded.Address;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity @Audited
@Getter @Setter
public class Company {

    @Id @Column(length = 14, nullable = false, unique = true)
    private String cnpj;

    @Embedded
    private Address address;

    @Column(length = 13)
    private String telephone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Company company = (Company) o;

        return Objects.equals(cnpj, company.cnpj);
    }

    @Override
    public int hashCode() {
        return 56842787;
    }
}
