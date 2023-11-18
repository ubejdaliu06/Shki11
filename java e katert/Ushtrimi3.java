import java.util.*;

public class Ushtrimi3{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		
		int	nr ;
			
			do{
				System.out.println("Shtypeni nje numer se paku 10:");
					nr = sc.nextInt();
			}while(nr < 10);
			
			sc.nextLine();
			int countKushti = 0;
			
				for(int i = 0; i < nr; i++){
					System.out.print("Shkruani nje fjale/fjali:");
					String fjali = sc.nextLine();
					if(findWord(fjali)){
						countKushti++;
					}

			}
			System.out.print(" Jane shtypur gjithsej:"+nr+"fjale/fjali dhe-"+ countKushti +"-prej tyre plotësojnë kushtin.");

	}
		public static boolean findWord(String DANGER){
			if(DANGER.startsWith("ubt") && (DANGER.toLowerCase().endsWith("shkenca") || DANGER.toLowerCase().endsWith("java"))){
			return true;
			}
			else {
				return false;
			}
			

		}

		
}