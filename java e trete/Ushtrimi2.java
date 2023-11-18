import java.util.*;
public class Ushtrimi2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
			
			int nr;
			int countAll = 0;
			int gjatesiaMax = 0;
			String fjalimetegjat= "";
			do{
				System.out.print("Trego sa fjali do te shtypen (se paku 5):");
				nr = sc.nextInt();
			}while(!(nr >= 5));
			
			for (int i= 0; i < nr; i++){
				System.out.print("Shtyp nje fjali:");
				String fjali = sc.nextLine();
				countAll++;
				int gjatesia = fjali.length();
				if(gjatesia > gjatesiaMax){
					gjatesiaMax = gjatesia;
					fjalimetegjat = fjali;
				}
			}
			System.out.print("fjalia me e gjate e shtypur :"+fjalimetegjat);
			}
				
		
	}



