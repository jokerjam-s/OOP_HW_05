package gb.oop.hw.services;

import gb.oop.hw.data.Phone;

import java.util.Random;

public class PhoneServiceImpl implements PhoneService {

    private final String[] phoneNote = {
            "домашний",
            "рабочий",
            "мобильный",
            ""
    };


    @Override
    public Phone generateNumber() {
        Random random = new Random();

        String builder = "+7 (" + random.nextInt(10) +
                random.nextInt(10) +
                random.nextInt(10) +
                ")" +
                random.nextInt(10) +
                random.nextInt(10) +
                random.nextInt(10) +
                "-" +
                random.nextInt(10) +
                random.nextInt(10) +
                "-" +
                random.nextInt(10) +
                random.nextInt(10);

        return new Phone(phoneNote[random.nextInt(phoneNote.length)], builder);
    }
}
