package Arreglo500000Usuarios;

public class Test500000Usuarios {

	

	public static void main(String[] args) {
		ArrayString users = new ArrayString();
		Reader r = new Reader();
		WritterRegister wr = new WritterRegister();
		WritterSearch ws = new WritterSearch();
		users = r.reader();
		
		wr.writterAlta(users);
		ws.writterSearch(users);

	}

}
