package itallodavid.github.accesscontrol.services;

import itallodavid.github.accesscontrol.repositories.JobRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JobService {

    private final JobRepository repository;
}
