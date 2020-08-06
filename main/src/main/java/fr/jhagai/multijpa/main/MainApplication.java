package fr.jhagai.multijpa.main;

import fr.jhagai.multijpa.main.services.MainService;
import fr.jhagai.multijpa.shared.SharedConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@Slf4j
@SpringBootApplication
@Import(SharedConfig.class)
@EnableJpaRepositories("fr.jhagai.multijpa.main")
@EntityScan("fr.jhagai.multijpa.main")
public class MainApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(MainService mainService) {
        return args -> {
            log.debug("SAVE MAIN");
            mainService.saveMain();
            log.debug("LOAD MAIN");
            List<Object> objects = mainService.loadMain();
            objects.forEach(System.out::println);
        };
    }
}
