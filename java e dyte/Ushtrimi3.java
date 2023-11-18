import java.util.*;
public class Ushtrimi3{
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
			
			if (nr >= 10 && nr <= 20 || nr >= 45 && nr <= 55){
				countkushti1++;
			}
			
			
		}while(nr != SENTINEL);
		
		System.out.print("Shuma e numrav te shtypur:" +countALL+ "shuma e numrav qe jane nga 10 deri 20 apo nga 45 deri 55:"+countkushti1 );
		
		
		
	}



}