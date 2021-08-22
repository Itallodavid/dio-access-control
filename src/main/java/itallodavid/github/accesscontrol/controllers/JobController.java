package itallodavid.github.accesscontrol.controllers;

import itallodavid.github.accesscontrol.services.JobService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/jobs")
@AllArgsConstructor
public class JobController {

    private final JobService service;
}
