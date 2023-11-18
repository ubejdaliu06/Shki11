import java.util.*;
public class Ushtrimi4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Shtypni nje numer te plote por numri -9999 perfundon programin:");
		int nr = sc.nextInt();
		
		int SENTINEL = -9999;
		int countkushti1 = 0;
		int countALL = 0;
		
		do{
			if(nr != SENTINEL){
				countALL++;
				System.out.print("Shtypeni nje numer tjeter:");
				nr = sc.nextInt();
				
			}
			
			if (countkushti1 < nr){
				countkushti1 = nr;
			}
			
			
		}while(nr != SENTINEL);
		
		System.out.print("Shuma e numrav te shtypur:" +countALL+ "Numri me i madhi nga te shtypurit:" +countkushti1 );
		
		
		
	}



}