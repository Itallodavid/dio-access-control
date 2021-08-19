package itallodavid.github.accesscontrol.services;

import itallodavid.github.accesscontrol.models.Company;
import itallodavid.github.accesscontrol.repositories.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CompanyService {

    private final CompanyRepository repository;

    @Transactional(readOnly = true)
    public Page<Company> companyPage(final Pageable pageable) {
        return repository.findAll(pageable);
    }
}
