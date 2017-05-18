package Arreglo1000000Usuarios;

import Arreglo500000Usuarios.ArrayString;
import Arreglo500000Usuarios.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritterRegister {
	private String csvFile;
	private String line;
	private String csvSplitBy;
	private BufferedWriter bw;
	
	public WritterRegister(){
		csvFile = "dataset_insert_10000.csv";
		line = "";
		csvSplitBy = ";";
		bw = null;
	}
	
	public void writterAlta(ArrayString users){
		
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			File file = new File("salidaAlta2.csv");
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			long time_start, time_end;

			String firstLine = "User;Time";
			bw.write(firstLine);
			bw.newLine();

			while ((line = br.readLine()) != null) {
				time_start = System.nanoTime();
				String[] items = line.split(csvSplitBy);
				User usuario = new User(items);
				users.add(usuario.getDNI());

				time_end = System.nanoTime();

				String contentLine = items[0]+";"+(( time_end - time_start ));
				bw.write(contentLine);
				bw.newLine();
			}


		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				System.out.println("Error" + ex);
			}
		}
	}

}
