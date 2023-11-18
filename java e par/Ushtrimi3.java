import java.util.Scanner;

public class Ushtrimi3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Shtypni nje numer te plote numri -5555 eshte sentinel dhe nuk perfshihet ne kalkulim:");
		int nr = sc.nextInt();

		final int SENTINEL = -5555;
		int countTotali = 0;
		int countKushti = 0;

		while(nr != SENTINEL){
			countTotali++;
			if(nr % 2 == 0 && nr % 4 != 0){
				countKushti++;
			}
			System.out.print("Shtypeni nje numer tjter:");
			nr = sc.nextInt();
		}

		System.out.println("Jane shtypur gjithsej"+countTotali+ "numra dhe :" +countKushti+" prej tyre e plotesojne kushtin." );

	}
}