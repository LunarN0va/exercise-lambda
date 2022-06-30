package nl.han.ica.oose.dea.exerciselambda;

import nl.han.ica.oose.dea.exerciselambda.person.Gender;
import nl.han.ica.oose.dea.exerciselambda.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListMaker {

    private static final int ADULT_AGE = 18;

    private final Predicate<Person> isAdult = (person) -> person.isAdult(ADULT_AGE);
    private final Predicate<Person> isMale = (person) -> person.isOfGender(Gender.MALE);
    private final Predicate<Person> isFemale = (person) -> person.isOfGender(Gender.FEMALE);
    private final Predicate<Person> isOtherwise = (person) -> person.isOfGender(Gender.OTHERWISE);

    /**
     * Create a {@link List} containing only the Persons that have gender {@link Gender#MALE} and are adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only instance of {@code Person} that have gender {@link Gender#MALE} and are adult
     */
    public List<Person> createMaleAdultList(List<Person> allPersons) {
        return createAdultList(allPersons, isMale);
    }

    /**
     * Create a {@link List} containing only the Persons that have gender {@link Gender#FEMALE} and are adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only instance of {@code Person} that have gender {@link Gender#FEMALE} and are adult
     */
    public List<Person> createFemaleAdultList(List<Person> allPersons) {
        return createAdultList(allPersons, isFemale);
    }

    /**
     * Create a {@link List} containing only the Persons that have gender {@link Gender#OTHERWISE} and are adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only instance of {@code Person} that have gender {@link Gender#OTHERWISE} and are adult
     */
    public List<Person> createOtherwiseAdultList(List<Person> allPersons) {
        return createAdultList(allPersons, isOtherwise);
    }

    private List<Person> createAdultList(List<Person> allPersons, Predicate<Person> byGender) {
        if (allPersons == null) {
            return new ArrayList<>();
        }

        return allPersons.stream().filter(isAdult).filter(byGender).collect(Collectors.toList());
    }
}
