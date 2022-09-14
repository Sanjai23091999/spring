package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class Controller
{
    public static void main( String[] args ) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        Employee employee1 = (Employee)applicationContext.getBean("employee");
        Employee employee2 = (Employee)applicationContext.getBean("employee1");
        Employee employee3 = (Employee)applicationContext.getBean("employee2");
        Trainee trainee = applicationContext.getBean(Trainee.class);
        Trainer trainer = applicationContext.getBean( Trainer.class);
        Director director = applicationContext.getBean( Director.class);
        Architect architect = applicationContext.getBean(Architect.class);

        employee1.setId(1);
        employee1.setName("jubair");
        trainer.setExperience(5);
        employee1.getTrainerInfo();

        employee2.setId(2);
        employee2.setName("king");
        trainee.setYearOfPassOut(2021);
        employee2.getTraineeInfo();

        employee3.setId(2);
        employee3.setName("dhanesh");
        director.setSpecialization("java");
        employee3.getDirectorInfo();

        employee1.setId(2);
        employee1.setName("yuviraj");
        architect.setArchitectType("security");
        employee1.getArchitectInfo();



    }
}
