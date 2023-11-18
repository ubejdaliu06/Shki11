import java.util.Scanner;

public class Ushtrimi6{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Shtypni nje fjali fjala EXIT e perfundon programin:");
		String fjalia = sc.nextLine();

		final String SENTINEL = "EXIT";
		int countCSE = 0;
		
	
		while(!fjalia.equals(SENTINEL)){

			if(fjalia.contains("CSE")){
				countCSE++;
			}
			
			System.out.println("Shtypni nje fjali fjala EXIT e perfundon loop:");
		    fjalia = sc.nextLine();
		}

		System.out.println("shuma e fjaleve qe permbajn eshte : "+countCSE);

	}
}