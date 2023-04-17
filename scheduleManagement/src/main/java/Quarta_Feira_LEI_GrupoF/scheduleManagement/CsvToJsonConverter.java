package Quarta_Feira_LEI_GrupoF.scheduleManagement;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;
import java.util.List;

public class CsvToJsonConverter {

    public static void convert(List <String[]> csvData, String jsonFilePath) throws IOException, CsvValidationException {
        // create a JSONArray object to store the converted data
        JSONArray jsonArray = new JSONArray();

        // read the CSV file line by line and convert each row to a JSON object
        for(String [] row : csvData) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("column1", row[0]);
            jsonObject.put("column2", row[1]);
            jsonObject.put("column3", row[2]);
            // add the JSON object to the array
            jsonArray.add(jsonObject);
        }

        // write the JSON array to a file
        FileWriter fileWriter = new FileWriter(jsonFilePath);
        fileWriter.write(jsonArray.toJSONString());
        fileWriter.close();
    }
}