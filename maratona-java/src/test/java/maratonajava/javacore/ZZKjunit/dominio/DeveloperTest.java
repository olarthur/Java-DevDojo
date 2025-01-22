package maratonajava.javacore.ZZKjunit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeveloperTest {

    @Test
    public void instanceOf_ExecuteChildClassMethod_WhenObjectIsOfChildType() {
        Employee employeeDeveloper = new Developer("1", "Java");

        if (employeeDeveloper instanceof Developer) {
            Developer developer = (Developer) employeeDeveloper;
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }

        if (employeeDeveloper instanceof Developer developer) {
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
    }
}