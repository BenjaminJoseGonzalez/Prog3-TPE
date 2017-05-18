package Arreglo500000Usuarios;

public class User {
	private String DNI;
	private ArrayString pleasures;
	
	public User(String[] items){
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
	public ArrayString getPleasures(){
		return pleasures;
	}
	public String getDNI(){
		return DNI;
	}
	
}
