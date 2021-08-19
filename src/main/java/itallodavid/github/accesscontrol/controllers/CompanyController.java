package itallodavid.github.accesscontrol.controllers;

import itallodavid.github.accesscontrol.models.Company;
import itallodavid.github.accesscontrol.services.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/companies")
@AllArgsConstructor
public class CompanyController {

    private final CompanyService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<Company> companyPage(final Pageable pageable){
        return service.companyPage(pageable);
    }
}
