import java.util.*;
public class Ushtrimi3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Shtypeni nje numer me se paku 10");
		int numri = sc.nextInt();
		
		int countfunddhecse = 0;
		
		while(numri < 10){
			System.out.print("Shtypeni nje numer me se paku 10");
			numri = sc.nextInt();
		}
		sc.nextLine();
			for(int i = 0;i < numri; i++){
				System.out.println("shtypeni nje tjtr fjali:");
				String fjalia = sc.nextLine();

				if (fjalia.endsWith("fund") && fjalia.contains("CSE")){
					countfunddhecse++;
				}
				
				
			}
		
		System.out.println("Jane shtypur gjithsej "+numri+" fjale/fjali dhe :"+countfunddhecse+" prej tyre mbarojnë me fund dhe permbajne string-un CSE");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}