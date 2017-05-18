package ListaCargaAlFinal500000Usuarios;

import Arreglo500000Usuarios.ArrayString;

public class UserNodo {
		private UserNodo next;
		private String DNI;
		private ArrayString pleasures;
		
		public UserNodo(String[] items){
			next = null;
			DNI = items[0];
			pleasures = generatePleasures(items);
		}
		private ArrayString generatePleasures(String[] items) {
			
			ArrayString arrayTemp  = new ArrayString(5);
			 
			for (int i = 1;i < items.length; i++){
				if((items[i] != "") && (!arrayTemp.contains(items[i]))) {
					arrayTemp.add(items[i]);
				}
			}
			
			return arrayTemp;
		}
		public UserNodo getNext(){
			return next;
		}
		public void setNext(UserNodo un){
			next = un;
		}
		public String getDNI(){
			return DNI;
		}
}
