package itallodavid.github.accesscontrol.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity @Audited
@Getter @Setter
public class Job {

    @Id
    private Long id;

    @Column(length = 150)
    private String name;

    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Job job = (Job) o;

        return Objects.equals(id, job.id);
    }

    @Override
    public int hashCode() {
        return 615373742;
    }
}
