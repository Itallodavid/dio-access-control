package itallodavid.github.accesscontrol.repositories;

import itallodavid.github.accesscontrol.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {
}
