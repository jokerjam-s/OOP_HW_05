package gb.oop.hw.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import gb.oop.hw.data.PhoneNote;

import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ReadWritePhoneBookImpl implements ReadWritePnoneBook{
    @Override
    public void writeToFile(List phones, String fileName, String format) {
        format = format.toLowerCase();

        if(format.equals("json")){
            WriteToJson(phones, fileName);
        }

        if(format.equals("xml")){
            WriteToXml(phones, fileName);
        }
    }

    @Override
    public List readFromFile(String fileName, String format) {
        return null;
    }

    private void WriteToJson(List phones, String fileName){
        Type typeOfMap = new TypeToken<PhoneNote>() { }.getType();
        Gson gson = new GsonBuilder().create();

        Logger logger = Logger.getAnonymousLogger();
        List<String> json = new ArrayList<>();

        for (var s: phones){
            json.add(gson.toJson(s, typeOfMap));
        }

        try {
            Files.write(Paths.get(fileName), json, StandardOpenOption.CREATE);
            logger.info("Сохранен " + fileName);
        }
        catch (Exception ex){
            logger.info(ex.getMessage());
        }
    }

    private void WriteToXml(List phones, String fileName){

    }

    public List readFromJson(){
       return null;
    }

    public List readFromXml(){
        return null;
    }
}
