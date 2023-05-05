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
    	jsonFile json = new jsonFile(csvData);
    	json.saveFile(jsonFilePath);
    }
}