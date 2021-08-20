package itallodavid.github.accesscontrol.services;

import itallodavid.github.accesscontrol.dto.CompanyCreationDTO;
import itallodavid.github.accesscontrol.exceptions.EntityAlreadyExistsException;
import itallodavid.github.accesscontrol.exceptions.EntityNotFoundException;
import itallodavid.github.accesscontrol.mappers.CompanyMapper;
import itallodavid.github.accesscontrol.models.Company;
import itallodavid.github.accesscontrol.repositories.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CompanyService {

    private final CompanyRepository repository;
    private final CompanyMapper mapper;

    @Transactional(readOnly = true)
    public Page<Company> companyPage(final Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Company getCompany(final String cnpj) throws EntityNotFoundException {
        Optional<Company> company = repository.findById(cnpj);

        if(company.isEmpty()){
            throw new EntityNotFoundException();
        }

        return company.get();
    }

    @Transactional
    public Company createCompany(final CompanyCreationDTO companyCreationDTO) throws EntityAlreadyExistsException {
        Optional<Company> existingCompany = repository.findById(companyCreationDTO.getCnpj());

        if(existingCompany.isPresent()){
            throw new EntityAlreadyExistsException();
        }

        Company company = mapper.toEntity(companyCreationDTO);
        return repository.save(company);
    }
}
