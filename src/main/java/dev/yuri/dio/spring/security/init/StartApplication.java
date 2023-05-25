package dev.yuri.dio.spring.security.init;


import dev.yuri.dio.spring.security.model.User;
import dev.yuri.dio.spring.security.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class StartApplication implements CommandLineRunner {
    private final UserRepository repository;

    public StartApplication(UserRepository repository) {
        this.repository = repository;
    }

    @Transactional
    @Override
    public void run(String... args) {
        User user = repository.findByUsername("admin");
        if(user == null){
            user = new User();
            user.setName("ADMIN");
            user.setUsername("admin");
            user.setPassword("master123");
            user.getRoles().add("MANAGERS");
            repository.save(user);
        }

        user = repository.findByUsername("user");
        if(user == null){
            user = new User();
            user.setName("USER");
            user.setUsername("user");
            user.setPassword("user123");
            user.getRoles().add("USERS");
            repository.save(user);
        }
    }
}
