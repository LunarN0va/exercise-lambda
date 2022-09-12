package nl.han.ica.oose.dea.exerciselambda.person;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class ListMakerCheck {
    int volwassenLeeftijd = 18;


    public boolean checkGeslacht(Person person, Gender gender) {
        return (person.getGender().equals(gender));
    }

    public boolean checkLeeftijd(Person person) {
        var now = LocalDate.now();
        var age = Period.between(person.getBirthDate(), now);

        return (age.getYears() >= volwassenLeeftijd);
    }

    public List<Person> createAdultList(List<Person> allPersons, Gender gender) {
        if (allPersons == null) {
            return new ArrayList<>();
        }

        List<Person> filteredAdults = new ArrayList<>();

        allPersons.stream().forEach(); {
            if (checkGeslacht(person, gender)) {
                if (checkLeeftijd(person)) {
                    filteredAdults.add(person);
                }
            }
        }
        return filteredAdults;
    }
}
