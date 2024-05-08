package org.example.dockerdemo;

import org.example.dockerdemo.entity.DemoEntity;
import org.example.dockerdemo.repository.DemoRepository;
import org.example.dockerdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerDemoApplication implements CommandLineRunner {
    @Autowired
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        DemoEntity entity = new DemoEntity();
        entity.setName("Demo");
        entity.setDescription("Demo description");
        demoService.save(entity);
    }
}
