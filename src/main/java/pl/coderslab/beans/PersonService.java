package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {

    private PersonRepository personRepo;
// wstrzyknac teraz obiekt klasy PersonRepo

    @Autowired
    public PersonService (PersonRepository personRepository) {
        this.personRepo = personRepository;
    }

    public PersonRepository getPersonRepo() {
        return personRepo;
    }
}
