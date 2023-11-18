import java.util.Scanner;

public class Ushtrimi1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Shtypni nje numer te plote (numri -9999 eshte sentinel dhe nuk perfshihet ne kalkulim):");
		int nr = sc.nextInt();

		final int SENTINEL = -9999;
		int countTotali = 0, countKushti = 0;

		while(nr != SENTINEL){
			countTotali++;
			if(nr > 25 && nr < 30){
				countKushti++;
			}
			System.out.println("Shtypni nje numer te plote (numri -9999 eshte sentinel dhe nuk perfshihet ne kalkulim):");
			nr = sc.nextInt();
		}

		System.out.println("Gjithsej jane shtypur " + countTotali + " numra dhe " + countKushti
			+ " prej tyre ishin mes numrave 25-30!");

	}
}