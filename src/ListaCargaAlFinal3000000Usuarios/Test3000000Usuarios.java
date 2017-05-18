package ListaCargaAlFinal3000000Usuarios;

import ListaCargaAlFinal500000Usuarios.LoadListFinal;

public class Test3000000Usuarios {

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
