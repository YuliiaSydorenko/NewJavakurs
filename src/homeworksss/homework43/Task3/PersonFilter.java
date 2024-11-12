package homeworksss.homework43.Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;


public class PersonFilter {
    public static List<Person> filterPersons(List<Person> persons, int minAge, String city) {
        if (persons == null) {
            return new ArrayList<>(); // Возвращаем пустой список, если входной список равен null
        }

        return persons.stream()
                .filter(person -> person.getAge() > minAge)        // Фильтрация по возрасту
                .filter(person -> person.getCity().equals(city))   // Фильтрация по городу
                .collect(Collectors.toList());                     // Сбор в новый список
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alisa", 25, "Berlin"));
        persons.add(new Person("John", 45, "Bonn"));
        persons.add(new Person("Hanna", 18, "Berlin"));
        persons.add(new Person("Julia", 23, "Munchen"));
        persons.add(new Person("Sebastian", 50, "Berlin"));
        persons.add(new Person("Alina", 35, "Dresden"));

        List<Person> filteredPersons = filterPersons(persons, 25, "Berlin");

        System.out.println("Люди старше 25 лет и проживающие в Берлине: " + filteredPersons);
    }

    }

