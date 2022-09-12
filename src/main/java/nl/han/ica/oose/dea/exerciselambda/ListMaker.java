package nl.han.ica.oose.dea.exerciselambda;

import nl.han.ica.oose.dea.exerciselambda.person.Gender;
import nl.han.ica.oose.dea.exerciselambda.person.ListMakerCheck;
import nl.han.ica.oose.dea.exerciselambda.person.Person;

import java.util.List;

public class ListMaker {
    ListMakerCheck listMakerCheck = new ListMakerCheck();
    /**
     * Create a {@link List} containing only the Persons that have gender {@link Gender#MALE} and are adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only instance of {@code Person} that have gender {@link Gender#MALE} and are adult
     */
    public List<Person> createMaleAdultList(List<Person> allPersons) {
        return listMakerCheck.createAdultList(allPersons, Gender.MALE);
    }

    /**
     * Create a {@link List} containing only the Persons that have gender {@link Gender#FEMALE} and are adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only instance of {@code Person} that have gender {@link Gender#FEMALE} and are adult
     */
    public List<Person> createFemaleAdultList(List<Person> allPersons) {
        return listMakerCheck.createAdultList(allPersons, Gender.FEMALE);
    }

    /**
     * Create a {@link List} containing only the Persons that have gender {@link Gender#OTHERWISE} and are adult.
     *
     * @param allPersons A {@link List} of {@link Person} Objects
     * @return A {@link List} containing only instance of {@code Person} that have gender {@link Gender#OTHERWISE} and are adult
     */
    public List<Person> createOtherwiseAdultList(List<Person> allPersons) {
        return listMakerCheck.createAdultList(allPersons, Gender.OTHERWISE);
    }
}
