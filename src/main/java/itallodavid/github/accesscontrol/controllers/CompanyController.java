package itallodavid.github.accesscontrol.controllers;

import itallodavid.github.accesscontrol.models.Company;
import itallodavid.github.accesscontrol.repositories.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("/companies")
@AllArgsConstructor
public class CompanyController {

    private final CompanyRepository repository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Company> companies(){
        return repository.findAll();
    }
}
