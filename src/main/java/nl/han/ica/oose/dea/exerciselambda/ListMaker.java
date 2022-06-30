package nl.han.ica.oose.dea.exerciselambda;

import nl.han.ica.oose.dea.exerciselambda.person.Gender;
import nl.han.ica.oose.dea.exerciselambda.person.Person;

import java.util.ArrayList;
import java.util.List;

public class ListMaker {

    private static final int ADULT_AGE = 18;

    /**
     * Create a {@link List} containing only the Persons that have gender {@link Gender#MALE} and are adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only instance of {@code Person} that have gender {@link Gender#MALE} and are adult
     */
    public List<Person> createMaleAdultList(List<Person> allPersons) {
        return createAdultList(allPersons, Gender.MALE);
    }

    /**
     * Create a {@link List} containing only the Persons that have gender {@link Gender#FEMALE} and are adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only instance of {@code Person} that have gender {@link Gender#FEMALE} and are adult
     */
    public List<Person> createFemaleAdultList(List<Person> allPersons) {
        return createAdultList(allPersons, Gender.FEMALE);
    }

    /**
     * Create a {@link List} containing only the Persons that have gender {@link Gender#OTHERWISE} and are adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only instance of {@code Person} that have gender {@link Gender#OTHERWISE} and are adult
     */
    public List<Person> createOtherwiseAdultList(List<Person> allPersons) {
        return createAdultList(allPersons, Gender.OTHERWISE);
    }

    private List<Person> createAdultList(List<Person> allPersons, Gender gender) {

        if (allPersons == null) {
            return new ArrayList<>();
        }

        List<Person> filteredAdults = new ArrayList<>();

        allPersons.forEach(person -> {
            if (person.isOfGender(gender) && person.isAdult(ADULT_AGE)) {
                filteredAdults.add(person);
            }
        });

        return filteredAdults;
    }
}
