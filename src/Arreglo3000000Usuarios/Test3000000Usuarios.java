package Arreglo3000000Usuarios;
import Arreglo500000Usuarios.ArrayString;

public abstract class Test3000000Usuarios {
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


