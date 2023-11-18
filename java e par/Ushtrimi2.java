import java.util.Scanner;

public class Ushtrimi2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Shtypni nje numer te plote (numri -9999 eshte sentinel dhe nuk perfshihet ne kalkulim):");
		int nr = sc.nextInt();

		final int SENTINEL = -9999;
		int countCift = 0, countTek = 0, count0 = 0;

		while(nr != SENTINEL){
		
			if(nr % 2 == 0 && nr != 0){
				countCift++;
			}else if(nr == 0){
				count0++;
			}else{
				countTek++;
			}

			System.out.println("Shtypni nje numer te plote (numri -9999 eshte sentinel dhe nuk perfshihet ne kalkulim):");
			nr = sc.nextInt();
				
		}

		System.out.println("Gjithsej jane shtypur " + countCift + " numra cift, " + countTek
			+ " numra tek dhe " + count0 + " zero!");

	}
}