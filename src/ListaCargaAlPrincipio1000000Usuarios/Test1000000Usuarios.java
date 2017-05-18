package ListaCargaAlPrincipio1000000Usuarios;

import ListaCargaAlPrincipio500000Usuarios.LoadListBeginning;

public class Test1000000Usuarios {

	public static void main(String[] args) {
		LoadListBeginning users = new LoadListBeginning();
		WritterSearch ws = new WritterSearch();
		WritterRegister wr = new WritterRegister();
		Reader r = new Reader();
		users = r.reader();
		wr.writterRegister(users);
		ws.writterSearch(users);
	}

}
