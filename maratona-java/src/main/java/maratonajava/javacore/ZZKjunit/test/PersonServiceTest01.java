package maratonajava.javacore.ZZKjunit.test;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZKjunit.dominio.Person;
import maratonajava.javacore.ZZKjunit.service.PersonService;

@Log4j2
public class PersonServiceTest01 {
    public static void main(String[] args) {
        Person person = new Person(16);
        PersonService personService = new PersonService();
        log.info("Is Adult? '{}'", personService.isAdult(person));
    }
}
