package kamata;
import java.util.Scanner;
public class Zadaca_2 {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.println("Da se ispecatat broevi koi ne se delivo so 4 i so 7");
		System.out.println("Vnesi broj na clenovi vo nizata");
		int n = input.nextInt();
		int niza[]=new int [n];
		System.out.print ("Vnesi gi clenovite vo nizata:");
		for (int i=0 ; i<niza.length ; i++) {
			System.out.print(i + "-->");
			niza[i] = input.nextInt();
		}
		for (int i = 0 ; i<niza.length ; i++) {
			if(niza[i]%3==0);
			System.out.println("niza[" + i + "]=");
		}

	}

}
