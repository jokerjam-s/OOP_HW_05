package gb.oop.hw.services;

import gb.oop.hw.data.Person;

import java.util.Random;

public class PersonServiceImpl implements PersonService{
    private final String[] personNames = {
            "Иван",
            "Семен",
            "Дарья",
            "Николай",
            "Александр",
            "Мария",
            "Ольга",
            "Никодим",
            "Татьяна",
            "Тимофей",
            "Юрий",
            "Наталья"
    };

    private final String[] personNotes = {
            "автосервис",
            "работа",
            "",
            "друзья",
            "поликлинника",
            "",
            "",
            "хобби",
            ""
    };


    @Override
    public Person generatePerson() {
        Random random =new Random();

        return new Person(personNames[random.nextInt(personNames.length)], personNames[random.nextInt(personNotes.length)]);
    }
}
