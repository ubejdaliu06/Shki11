import java.util.*;
public class Ushtrimi1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Shtypni nje numer te plote por numri -9999 perfundon programin:");
		int nr = sc.nextInt();
		
		int SENTINEL = -9999;
		int countTek = 0;
		int countQift = 0;
		
		
		do{
			if(nr != SENTINEL){
				System.out.print("Shtypeni nje numer tjeter:");
				nr = sc.nextInt();
			}
			
			if (nr % 2 == 0){
				countQift++;
			}
			if (nr % 2 != 0){
				countTek++;
			}
			
		}while(nr != SENTINEL);
		
		System.out.print("Shuma e numrav qift:" +countQift+ "shuma e numrave tek:" +countTek);
		
		
		
	}



}