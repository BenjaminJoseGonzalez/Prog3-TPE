package Arreglo3000000Usuarios;

import Arreglo500000Usuarios.ArrayString;
import Arreglo500000Usuarios.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {
	private ArrayString usuarios;
	private String csvFile; 
	private String line;
	private String csvSplitBy;
	
	public Reader(){
		 usuarios = new ArrayString();
		 csvFile = "dataset_3000000.csv";
		 csvSplitBy = ";";
		 line = "";
	}
	
	public ArrayString reader (){
		
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			br.readLine();
			while ((line = br.readLine()) != null) {

				String[] items = line.split(csvSplitBy);
				User user = new User(items);
				usuarios.add(user.getDNI());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return usuarios;
	}
}
