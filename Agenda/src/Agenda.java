import java.util.Arrays;

public class Agenda {
	
	private Contato[] contato;
	private int quantidade;
	
	private int ultimoIndice;
	public boolean inserir (Contato c){
		Arrays.sort(contato);
		if( Arrays.binarySearch(contato, c)>0){
			return false;
		}
		if (contato.length==quantidade){
			return false;
		}
		contato[quantidade++] = c;
		return true;
	}

}
