import java.util.Scanner;

public class Ushtrimi1{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Shtypeni nje numer me te madhe se 4 dhe me te vogel se 10(4 - 10):");
		int	nr = sc.nextInt();
			
			while(!(nr > 4 && nr < 10)){
				System.out.println("Shtypeni nje numer me te madhe se 4 dhe me te vogel se 10:");
				nr = sc.nextInt();
			}
			
			int countKushti = 0;
			
			for(int i = 0; i < nr; i++){
				System.out.print("Shkruani nje numer:");
				int Numri = sc.nextInt();
				if(pozitiveInterval(Numri)){
					countKushti++;
				}

			}
			System.out.print("Jane shtypur gjithsej:"+nr +"numra dhe-"+countKushti +"-prej tyre e plotësojnë kushtin. ");

	}
		public static boolean pozitiveInterval(int Numrat){
			if(Numrat < 20 && 10 < Numrat || 40 < Numrat && Numrat < 50){
			return true;
			}
			else {
				return false;
			}
			

		}

		
}