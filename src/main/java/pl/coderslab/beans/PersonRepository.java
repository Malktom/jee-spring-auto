package pl.coderslab.beans;


import org.springframework.stereotype.Component;

@Component
public class PersonRepository {
    private String name = "name";

    public String getName() {
        return name;
    }
}
