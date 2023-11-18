import java.util.*;
public class Ushtrimi5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Trego sa fjali do te shtypen(se paku 7):");
		int nr = sc.nextInt();
		
		while (nr < 7){
			System.out.print("Shtypeni nje numer se paku 7:");
			nr = sc.nextInt();
		}
		String fjaliaepar = "";
		sc.nextLine();
		for (int i = 0;i < nr; i++){
			System.out.print("Shkruani nje fjali:");
			String fjalia = sc.nextLine();
				
				if (i == 0){
				fjaliaepar = fjalia;
			}
				
			}
			System.out.print("Fjalia e par e shtypur eshte:"+fjaliaepar);
		}
		
		

	}
