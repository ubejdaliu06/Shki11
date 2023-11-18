import java.util.Scanner;

public class Ushtrimi5{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Shtypni nje fjali (fjala END e perfundon loop):");
		String fjalia = sc.nextLine();

		final String SENTINEL = "END";
		int countAD = 0;
		int countBE = 0;
	
		while(!fjalia.equals(SENTINEL)){

			//toUpperCase() na ndihmon me Case Sensitivity
			if(fjalia.toUpperCase().startsWith("A") || fjalia.toUpperCase().startsWith("D")){
				countAD++;
				}
			else if (fjalia.toUpperCase().endsWith("B") || fjalia.toUpperCase().endsWith("E")){
				countBE++;
			}
			
			System.out.println("Shtypni nje fjali (fjala END e perfundon loop):");
		    fjalia = sc.nextLine();
		}

		System.out.println(" fjalia qe fillon me A ose D:" +countAD+ "fjaliat qe mbarojn me B apo E:"+countBE);

	}
}