package gb.oop.hw;

import gb.oop.hw.controller.PhoneNoteController;

public class Main {
    public static void main(String[] args) {
        PhoneNoteController controller = new PhoneNoteController();

        controller.createPhoneNote(10);

        controller.showPhones();

        controller.saveToFile("Phones.json", "json");
        controller.saveToFile("Phones.txt", "txt");

        controller.showPhones("Мария");



    }
}