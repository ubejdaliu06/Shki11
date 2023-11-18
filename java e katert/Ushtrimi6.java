import java.util.*;

public class Ushtrimi6{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		
			int nr;
			do{
				System.out.print("Shtypeni nje numer se paku 9:");
				nr = sc.nextInt();
			}while(nr < 9);
		
			sc.nextLine();
			int countKushti = 0;;
			for(int i = 0; i < nr; i++){
				System.out.print("Shkruani nje fjale/fjali:");
				 String Fjalia = sc.nextLine();
				if(checkStringType(Fjalia)){
					countKushti++;
				}
			}
						System.out.print("Jane shtypur gjithsej:"+ nr+"fjale/fjali dhe~"+countKushti+"prej tyre e plotesojne kushtin. ");

				
	}
			public static boolean checkStringType(String Test){
				if(Test.contains("?") || Test.contains("!")){
					return true;
				}
				else{
					return false;
				}
			}

		}

		
