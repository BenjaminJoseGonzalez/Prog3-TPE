package ListaCargaAlPrincipio500000Usuarios;

import ListaCargaAlFinal500000Usuarios.UserNodo;

public class LoadListBeginning {
	private UserNodo first;
	private int size;
	
	public LoadListBeginning(){
		first = null;
		size = 0;
	}
	public UserNodo getFirst(){
		return first;
	}
	public void setFirst(UserNodo un){
		first = un;
	}
	public boolean isEmpity(){
		return first == null;
	}
	public boolean contains(String s){
		UserNodo unAux = first;
		for(int i=0; i<size;i++){
			if(unAux.getDNI().equals(s))
				return true;
			else 
				unAux = unAux.getNext();
		}
		return false;
	}
	public void add(UserNodo user){
		if(size == 0){
			first = user;
		}else{
			UserNodo tmp = user;
			tmp.setNext(first);
			first = tmp;
		}
		size++;
	}
}
