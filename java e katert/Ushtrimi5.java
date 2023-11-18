import java.util.*;

public class Ushtrimi5{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Shtypeni nje numer se paku 5:");
			int nr = sc.nextInt();
			while(nr < 5){
			System.out.print("Shtypeni nje numer tjeter se paku 5:");	
			nr = sc.nextInt();
			}
		
			sc.nextLine();
			int countKushti = 0;;
			for(int i = 0; i < nr; i++){
				System.out.print("Shkruani nje fjale/fjali:");
				 String Fjalia = sc.nextLine();
				if(checkString(Fjalia)){
					countKushti++;
				}
			}
						System.out.print("Jane shtypur gjithsej:"+ nr +"fjale/fjali dhe-"+countKushti+"-prej tyre e plotesojne kushtin. ");

				
	}
			public static boolean checkString(String parameter){
				if(parameter.length() % 5 == 0){
					return true;
				}
				else{
					return false;
				}
			}

		}

		
