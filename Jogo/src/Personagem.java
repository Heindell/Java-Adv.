
public abstract class Personagem implements ArmaIF{
	ArmaIF arma;
	public abstract void desenhar();
	public void falar(){
	     /*c�digo comum para falar*/
	  }

	public void setArma(ArmaIF a){
			     arma = a;
			  }
	public void arma(){
			     arma.UsaArma();
			  }


}

