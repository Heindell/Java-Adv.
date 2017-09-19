
public class Contato implements Comparable {

	@Override
	public int compareTo(Object obj) {
		Contato c = (Contato) obj;
		return this.nome.compareTo(c.nome);
		
		
	}
	
	public String nome;
	public int telefone;
	public String dataNascimento;
	
	public Contato(String nome, int telefone, String dataNascimento) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}

	
	
}
