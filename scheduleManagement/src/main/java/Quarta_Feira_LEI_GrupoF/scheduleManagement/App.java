package Quarta_Feira_LEI_GrupoF.scheduleManagement;

import java.io.IOException;

import com.opencsv.exceptions.CsvValidationException;

/**
 * Hell world!
 
 */
public class App 
{		
	
    public static void main( String[] args ) throws CsvValidationException, IOException
    {
    	csvFile csv = new csvFile("/Users/miguelreis/Downloads/horario_exemplo.csv");
    	CsvToJsonConverter.convert(csv.getList(), "/Users/miguelreis/Downloads/horario_exemplo.json");
    }
}
