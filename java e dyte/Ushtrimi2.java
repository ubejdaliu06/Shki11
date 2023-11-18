import java.util.*;
public class Ushtrimi2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Shtypni nje numer te plote por numri -9999 perfundon programin:");
		int nr = sc.nextInt();
		
		int SENTINEL = -9999;
		int countkushti = 0;
		int countALL = 0;
		
		do{
			if(nr != SENTINEL){
				countALL++;
				System.out.print("Shtypeni nje numer tjeter:");
				nr = sc.nextInt();
				
			}
			
			if (nr < 10 && nr % 2 != 0){
				countkushti++;
			}
			
			
		}while(nr != SENTINEL);
		
		System.out.print("Shuma e numrave te shtypur:" +countALL+ "shuma e numrav tek dhe me te vogel se 10:" +countkushti);
		
		
		
	}



}