package gb.oop.hw.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import gb.oop.hw.data.PhoneNote;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class WritePhoneBookImpl implements WritePnoneBook {
    @Override
    public void writeToFile(List phones, String fileName, String format) {
        format = format.toLowerCase();
        Logger logger = Logger.getAnonymousLogger();
        List<String> data = new ArrayList<>();
        Gson gson = new GsonBuilder().serializeNulls().create();

        for (var s : phones) {
            if (format.equals("json")) {
                data.add(gson.toJson(s, PhoneNote.class));
            }
            if (format.equals("txt")) {
                data.add(s.toString());
            }
        }

        if (data.size() > 0) {
            try {
                Files.write(Paths.get(fileName), data, StandardOpenOption.CREATE);
                logger.info("Сохранен " + fileName);
            } catch (Exception ex) {
                logger.info(ex.getMessage());
            }
        }

    }

}
