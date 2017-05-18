package ListaCargaAlFinal500000Usuarios;

public class Test500000Usuarios {

	public static void main(String[] args) {
		
		LoadListFinal users = new LoadListFinal();
		WritterSearch ws = new WritterSearch();
		WritterRegister wr = new WritterRegister();
		Reader r = new Reader();
		users = r.reader();
		wr.writterRegister(users);
		ws.writterSearch(users);
	}

}
