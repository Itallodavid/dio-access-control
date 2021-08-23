package itallodavid.github.accesscontrol.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity @Audited
@Getter @Setter
public class Employee {

    @Id
    private String cpf;

    private String name;

    private Date birthDate;

    private Date entryDate;

    @OneToOne(optional = false)
    private Company company;

    @OneToOne(optional = false)
    private Job job;

}
