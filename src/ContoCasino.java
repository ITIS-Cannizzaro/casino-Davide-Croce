public class ContoCasino extends Conto
{
	ContoCasino(double contocorrente)
	{
		super(contocorrente);
		ContoCorrente=100000;
	}
	void Trasferimento(int num,double somma, ContoGiocatore A, ContoCasino B)
	{
		System.out.println("il casinò ha vinto");
		System.out.println("il giocatore ha perso:");
		A.ContoCorrente-=somma;
		this.ContoCorrente+=somma;
	}
}

