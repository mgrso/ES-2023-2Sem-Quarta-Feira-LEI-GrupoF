package Quarta_Feira_LEI_GrupoF.scheduleManagement;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.CSVWriterBuilder;
import com.opencsv.exceptions.CsvException;

public class csvFile {
	
	private List<String[]> ficheiro;

	public csvFile(String filename) {
		// TODO Auto-generated constructor stub
		CSVReader reader;
		try {
			reader = new CSVReaderBuilder(new FileReader(filename)).build();
			 List<String[]> myEntries = reader.readAll();
			 this.ficheiro = myEntries;
		} catch (IOException | CsvException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public csvFile(List<String[]> stringList) {
		// TODO Auto-generated constructor stub
		this.ficheiro = stringList;
	}
	
	
	public List<String[]> getList() {
		return this.ficheiro;
	}
	
	public void saveFile(String newFileName) {
		 CSVWriter writer;
		try {
			writer = (CSVWriter) new CSVWriterBuilder(new FileWriter("yourfile.csv")).withSeparator('\t').build();
			 // feed in your array (or convert your data to an array)
			for (String[] vector: this.ficheiro) {
				writer.writeNext(vector);
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
