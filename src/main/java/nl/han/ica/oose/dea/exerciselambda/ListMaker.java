package nl.han.ica.oose.dea.exerciselambda;

import nl.han.ica.oose.dea.exerciselambda.person.Gender;
import nl.han.ica.oose.dea.exerciselambda.person.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class ListMaker {

    public static final int ADULT_AGE = 18;

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

        for (var person : allPersons) {
            if (person.isOfGender(Gender.MALE) && person.isAdult(ADULT_AGE)) {
                filteredMaleAdults.add(person);
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

        List<Person> filteredFemmaleAdults = new ArrayList<>();

        for (var person : allPersons) {
            if (person.isOfGender(Gender.FEMALE) && person.isAdult(ADULT_AGE)) {

                filteredFemmaleAdults.add(person);
            }
        }

        return filteredFemmaleAdults;
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
            if (person.isOfGender(Gender.OTHERWISE) && person.isAdult(ADULT_AGE)) {

                filteredOtherwiseAdults.add(person);
            }
        }

        return filteredOtherwiseAdults;
    }
}
