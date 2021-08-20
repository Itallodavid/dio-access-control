package itallodavid.github.accesscontrol.controllers;

import itallodavid.github.accesscontrol.dto.CompanyCreationDTO;
import itallodavid.github.accesscontrol.models.Company;
import itallodavid.github.accesscontrol.services.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController @RequestMapping("/companies")
@AllArgsConstructor
public class CompanyController {

    private final CompanyService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<Company> companyPage(final Pageable pageable){
        return service.companyPage(pageable);
    }

    @GetMapping(path = "/{cnpj}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Company getCompany(final @PathVariable String cnpj) {
        return service.getCompany(cnpj);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Company createCompany(@Valid @RequestBody final CompanyCreationDTO dto){
        return service.createCompany(dto);
    }
}
