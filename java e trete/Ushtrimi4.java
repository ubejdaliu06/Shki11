import java.util.*;
public class Ushtrimi4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Shtypeni nje numer me se paku 7:");
		int numri = sc.nextInt();
		
		while(numri < 7){
			System.out.print("Shtypeni nje numer me se paku 7:");
			numri = sc.nextInt();
		}
		int countDysh = 0;
		int countTresh = 0;
		
			for(int i = 0;i < numri; i++){
				System.out.println("Shtypeni nje numer me presje dhjetore:");
				double nr = sc.nextDouble();
				
				
				if(nr >= 100 && numri <= 999){
					countTresh++;
				}
				else if (nr >= 10 && numri <= 99){
					countDysh++;	
				}
			}
		
			if(countDysh == 0){
				System.out.print("Nuk eshte shtypur asnje numer dyshifror! ");
			}
			
			if(countTresh == 0){
					System.out.print("Nuk eshte shtypur asnje numer treshifror! ");
			}
			else if (countDysh != 0 && countTresh != 0){
				System.out.println("Jane shtypur gjithsej"+numri+","+countDysh+"ishin numra dyshifror dhe" +countTresh+ "ishin numra treshifror. ");
			}
				
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}