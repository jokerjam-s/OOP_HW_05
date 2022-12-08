package gb.oop.hw;

import gb.oop.hw.controller.PhoneNoteController;

public class Main {
    public static void main(String[] args) {
        PhoneNoteController controller = new PhoneNoteController();

        controller.createPhoneNote(10);

        controller.saveToFile("Phones.json", "json");
    }
}