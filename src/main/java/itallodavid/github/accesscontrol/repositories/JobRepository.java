package itallodavid.github.accesscontrol.repositories;

import itallodavid.github.accesscontrol.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
