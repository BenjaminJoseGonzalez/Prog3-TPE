package Arreglo500000Usuarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritterSearch {
	private String csvFile;
	private String line;
	private String csvSplitBy;
	private BufferedWriter bw;
	
	public WritterSearch(){
		csvFile  = "dataset_busqueda_10000.csv";
		line = ";";
		csvSplitBy = ";";
		bw = null;
	}
	
	public void writterSearch(ArrayString users){
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			File file = new File("saildaBusqueda.csv");
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			long time_start, time_end;

			String firstLine = "User;Time;esta/no esta?";
			bw.write(firstLine);
			bw.newLine();

			while ((line = br.readLine()) != null) {
				time_start = System.nanoTime();
				String[] items = line.split(csvSplitBy);
				boolean exist = users.contains(items[0]);
				time_end = System.nanoTime();
				
				String contentLine="";
				if(exist){
					contentLine = items[0]+";"+(( time_end - time_start ))+";esta";
				}else{
					contentLine = items[0]+";"+(( time_end - time_start ))+";no esta";
				}

				bw.write(contentLine);
				bw.newLine();
			}
		}catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				System.out.println("Error de BufferedWriter" + ex);
			}
		}
	}
	
}
