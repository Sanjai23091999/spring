package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {

    @Bean
    public Employee employee() {
        return new Employee(trainerBean());
    }

    @Bean
    public Employee employee1() {
        return new Employee(traineeBean());
    }

    @Bean
    public Employee employee2(Director directorBean) {
        return new Employee(directorBean);
    }

    @Bean
    public Trainee traineeBean() {
        return new Trainee();
    }
    @Bean
    public Trainer trainerBean() {
        return new Trainer();
    }

    @Bean
    public Director directorBean() {
        return new Director();
    }
}
