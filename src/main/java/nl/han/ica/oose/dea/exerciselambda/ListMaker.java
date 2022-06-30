package nl.han.ica.oose.dea.exerciselambda;

import nl.han.ica.oose.dea.exerciselambda.person.Gender;
import nl.han.ica.oose.dea.exerciselambda.person.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class ListMaker {

    /**
     * Create a {@link List} containing only the Persons that have gender {@link Gender#MALE} and are adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only instance of {@code Person} that have gender {@link Gender#MALE} and are adult
     */
    public List<Person> createMaleAdultList(List<Person> allPersons) {

        if (allPersons == null) {
            return new ArrayList<>();
        }

        List<Person> filteredMaleAdults = new ArrayList<>();

        for (Person person : allPersons) {
            if (person.getGender().equals(Gender.MALE)) {
                var now = LocalDate.now();
                var age = Period.between(person.getBirthDate(), now);

                if (age.getYears() >= 18) {
                    filteredMaleAdults.add(person);
                }

            }
        }

        return filteredMaleAdults;
    }

    /**
     * Create a {@link List} containing only the Persons that have gender {@link Gender#FEMALE} and are adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only instance of {@code Person} that have gender {@link Gender#FEMALE} and are adult
     */
    public List<Person> createFemaleAdultList(List<Person> allPersons) {

        if (allPersons == null) {
            return new ArrayList<>();
        }

        List<Person> filteredFemaleAdults = new ArrayList<>();

        for (Person person : allPersons) {
            if (person.getGender().equals(Gender.FEMALE)) {
                var now = LocalDate.now();
                var age = Period.between(person.getBirthDate(), now);

                if (age.getYears() >= 18) {
                    filteredFemaleAdults.add(person);
                }
            }
        }

        return filteredFemaleAdults;
    }

    /**
     * Create a {@link List} containing only the Persons that have gender {@link Gender#OTHERWISE} and are adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only instance of {@code Person} that have gender {@link Gender#OTHERWISE} and are adult
     */
    public List<Person> createOtherwiseAdultList(List<Person> allPersons) {

        if (allPersons == null) {
            return new ArrayList<>();
        }

        List<Person> filteredOtherwiseAdults = new ArrayList<>();

        for (Person person : allPersons) {
            if (person.getGender().equals(Gender.OTHERWISE)) {
                var now = LocalDate.now();
                var age = Period.between(person.getBirthDate(), now);

                if (age.getYears() >= 18) {
                    filteredOtherwiseAdults.add(person);
                }

            }
        }

        return filteredOtherwiseAdults;
    }
}
