package Arreglo500000Usuarios;

public class ArrayString {
	private String[] array;
	private int size;
	
	public ArrayString() {
		array = new String[10000];
	}
	public ArrayString(int size){
		array = new String[size];
		
	}
	/**
	 * 
	 * agrega un elemento al final del arreglo.
	 */
	public void add(String s){
		if(size == array.length){
			/**
			 * verifica si el arreglo essta lleno, si es asi, duplico el tamaño.
			 */
			String[] arrayTmp = new String[array.length*2];
			for(int i=0; i<array.length; i++){
				arrayTmp[i] = array[i];
			}
			array = arrayTmp;
		}
		array[size] = s;
		size++;
	}
	/**
	 * verifica que el elemento @param s este contenido en el arreglo.
	 * 
	 */
	public boolean contains(String s){
		for (int i = 0; i < array.length; i++) {
			if(s.equals(array[i]))
				return true;
		}
		return false;
	}
	/**
	 * imprime el arreglo por pantalla.
	 */
	public void imprimirArreglo(){
		for(int i=0;i<array.length; i++){
			System.out.println(array[i]);
		}
	}
	/**
	 * agrega un elemento @param s en la posicion @param i .
	 *
	 */
	public void addAt(int i,String s){
		String aux = "";
		for(int j=i; j<array.length-1; j++){
			aux = array[j+1];
			array[j+1] = array[j];
			array[j]=s ;
		}
	}
	/**
	 * devuelve la cantidad de elementos que tiene el arreglo.
	 * @return
	 */
	public int getSize(){
		return size;
	}
}
