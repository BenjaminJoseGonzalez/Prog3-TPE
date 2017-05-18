package ListaCargaAlFinal500000Usuarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	private LoadListFinal users;
	private String csvFile;
	private String line;
	private String csvSplitBy = ";";
	
	public Reader(){
		users = new LoadListFinal();
		csvFile = "dataset_500000.csv";
		line = ";";
		csvSplitBy = ";";
	}
	public LoadListFinal reader(){
		
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			br.readLine();
			while ((line = br.readLine()) != null) {

				String[] items = line.split(csvSplitBy);
				UserNodo user = new UserNodo(items);
				users.add(user);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return users;
	}
}
