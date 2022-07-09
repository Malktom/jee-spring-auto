package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.PersonService;

public class SpringDiApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PersonService person = context.getBean(PersonService.class);
        System.out.println(person.getPersonRepo().getClass().getName());

        System.out.println((person.getPersonRepo().getName()));
        context.close();
    }
}
