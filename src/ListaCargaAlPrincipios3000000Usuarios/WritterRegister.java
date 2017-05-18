package ListaCargaAlPrincipios3000000Usuarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import ListaCargaAlFinal500000Usuarios.UserNodo;
import ListaCargaAlPrincipio500000Usuarios.LoadListBeginning;

public class WritterRegister {
	
	private String csvFile;
	private String line;
	private String csvSplitBy;
	private BufferedWriter bw;
	
	public WritterRegister() {
		csvFile = "dataset_insert_10000.csv";
		line = "";
		csvSplitBy = ";";
		bw = null;
	}
	public void writterRegister(LoadListBeginning users){
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			File file = new File("salidaAlta9.csv");
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
				UserNodo user = new UserNodo(items);
				users.add(user);

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
				System.out.println("Error in BufferedWriter" + ex);
			}
		}
	}

}
