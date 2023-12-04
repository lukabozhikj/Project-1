package kamata;
import java.util.Scanner ;
public class Kamata {
	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	int depozit;
	int kamata;
	int depozit_posle_kamata ;
	int depozit_edna_god;
	System.out.println("Vnesi depozit");
	Scanner tastatura=new Scanner(System.in);
	depozit=tastatura.nextInt();
	System.out.println("Vnesi kamata");
	kamata=tastatura.nextInt();
	depozit_posle_kamata((depozit/100)*kamata+depozit);
	System.out.println("Za 1 mesec");
		}
	private static void depozit_posle_kamata(int i) {	
	}
}