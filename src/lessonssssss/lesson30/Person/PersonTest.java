package lessonssssss.lesson30.Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersonTest {
    static Person person;
    static String startEmail = "john@test.com";
    String startPassword = "qwerty!Q$";

    @BeforeEach

        void setUp(){

        person = new Person(startEmail,startPassword);

    }

    /*
    1. Берем валидный email
    2. Устанавливает сеттером валидный email person-у
    3. Мы ожидаем: что у person в поле email будет валидный email, который мы установили на шаге 2
    4. Проверить равенство person.getEmail() c валидным email, который мы устанавливали
     */


    @Test
    void testValidEmailSet(){

        String validEmail = "valid@test.com";
        person.setEmail(validEmail);
        System.out.println("getEmail: " + person.getEmail());
        Assertions.assertEquals(validEmail, person.getEmail());

    }
     /*
    1. Берем не валидный email
    2. Устанавливаем сеттером не валидный email person-у
    3. Ожидаем результат: Email установлен не будет.
    1) Т.е. значение email у person не будет равно не валидному email
    2) Значение поля email у person останется прежним
    4.
     */



    @ParameterizedTest
    @MethodSource("invalidEmailData")

     void testInvalidEmailSet(String invalidEmail) {
        person.setEmail(invalidEmail);
        System.out.println("getEmail: " + person.getEmail());
        Assertions.assertNotEquals(invalidEmail,person.getEmail());
        Assertions.assertEquals(startEmail,person.getEmail());
    }
    static Stream<String>invalidEmailData(){
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "test@mai@l.net",
                "test@mailnet",
                "test@mail.ne.t",
                "test@mail.net.",
                "test@mailne.t",
                "test@ mail.net",
                "test@ma!il.net",
                "t#est@mail.net",
                "test@mail.?net",
                "@testmail.net",
                "1test@mail.net",
                "_test@mail.net",
                "-t@mail.net",
                ".est@mail.net",
                "test+1@mail.net"

        );
    }

}

