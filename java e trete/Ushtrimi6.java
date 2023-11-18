import java.util.*;
public class Ushtrimi6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Trego sa fjali do te shtypen (se paku 17):");
		int nr = sc.nextInt();
		
		while(nr < 17){
			System.out.println("Shtyp nje numer tjtr se paku 17!:");
			nr = sc.nextInt();
		}
		
		int countKushti = 0;
		sc.nextLine();
		for (int i = 0; i < nr; i++){
			System.out.print("Shtypeni nje fjali:");
			String fjalia = sc.nextLine();
			
			if (Character.isDigit(fjalia.charAt(0)) && Character.isUpperCase(fjalia.charAt(fjalia.length()-1)) && fjalia.contains("ubt")){
				countKushti++;
			}
			
			
		}
		
		System.out.print("Jane shtypur gjithsej:"+nr+ "fjale/fjali dhe" +countKushti+ " prej tyre e plotesojne kushtin. ");
		
	}
}