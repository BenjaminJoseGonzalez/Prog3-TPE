package ListaCargaAlFinal500000Usuarios;

public class LoadListFinal {
	private UserNodo first;
	private int size;
	
	public LoadListFinal(){
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
	public void add(UserNodo un){
		if(first == null)
			first = un;
		else{
			UserNodo unTmp = first;
			while(unTmp.getNext() != null){
				unTmp = unTmp.getNext();
			}
			unTmp.setNext(un);
		}
		size++;
	}
}
