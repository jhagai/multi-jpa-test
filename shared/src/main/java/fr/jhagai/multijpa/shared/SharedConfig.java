package fr.jhagai.multijpa.shared;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("fr.jhagai.multijpa.shared.entities")
@EnableJpaRepositories("fr.jhagai.multijpa.shared.repositories")
public class SharedConfig {
}
