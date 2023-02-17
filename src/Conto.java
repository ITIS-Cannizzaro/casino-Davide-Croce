public abstract class Conto 
{
	double ContoCorrente;
	Conto(double contocorrente)
	{
		ContoCorrente=contocorrente;
	}
	abstract void Trasferimento(int num,double somma, ContoGiocatore A, ContoCasino B);
}
