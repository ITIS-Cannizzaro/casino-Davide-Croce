import java.util.Scanner;
public class Main 
{
	static void Dado(ContoGiocatore A, ContoCasino B,int cont)
	{
		
		Scanner Numl=new Scanner(System.in);
		System.out.println("inserisci il numero che secondo te uscirà ");
		int num = Numl.nextInt();
		System.out.println("inserisci la somma che vuoi scommettere");
		int somma = Numl.nextInt();
		if(B.ContoCorrente/5>somma && A.ContoCorrente>=somma) 
		{
			int ris=(int)(1+Math.random()*((6-1)+1));
			System.out.println("il risultato del dado Ã¨: " + ris);
			if (ris==num)
			{
				A.Trasferimento(num,somma,A,B);
			}
			else
			{
				B.Trasferimento(num,somma,A,B);
			}
			System.out.println("il conto del giocatore è¨: " + A.ContoCorrente);
			System.out.println("il conto del casino è¨: " + B.ContoCorrente);
			if(cont<3)
			System.out.println("vuoi continuare?");
			else if(cont>3)
			System.out.println("sei diventato panont...");
			else
			System.out.println("vuoi continuare? ricorda il gioco fa male non essere come panont");
			Scanner s2=new Scanner(System.in);
			String risposta =s2.nextLine();
			if(risposta.equals("si") && A.ContoCorrente>0)
			{
				cont++;
				Dado(A, B, cont);
			}
			else if(A.ContoCorrente<=0)
			{
				System.out.println("hai finito soldi");
			}
		}
		else
		{
			System.out.println("non puoi scommettere questa somma");
		}
	}
	public static void main(String[]args)
	{
		int cont=0;
		ContoGiocatore Panont=new ContoGiocatore(0);
		ContoCasino MonteCarlo=new ContoCasino(0);
		Dado(Panont,MonteCarlo,cont);
		System.out.println("il conto del giocatore è¨: " + Panont.ContoCorrente);
		System.out.println("il conto del casino è: " + MonteCarlo.ContoCorrente);
	}
}
