import java.util.Scanner;

public class Ushtrimi4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Shtypni nje numer te plote numri -5555 eshte sentinel dhe nuk perfshihet ne kalkulim:");
		int nr = sc.nextInt();

		final int SENTINEL = -5555;
		int countTotali = 0;
		int countKushti = 0;

		while(nr != SENTINEL && nr >= 100 && nr <= 999){
			countTotali++;
				if(nr % 2 == 0 && nr > 0){
					countKushti++;
				System.out.print("Shtypeni nje numer tjter:");
				nr = sc.nextInt();
				}
					
			}	
				if (nr == SENTINEL){
						System.out.print("Nuk eshte shtypur asnje numer!");
					}	
						System.out.print("Jane shtypur gjithsej"+countTotali +"numra dhe" +countKushti+ "prej tyre e plotesojne kushtin. ");
				
				
		
		
}
}