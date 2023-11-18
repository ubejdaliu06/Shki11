import java.util.*;

public class Ushtrimi2{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		int nr;
		
		do{
			System.out.print("Shtypeni nje numer se paku 6:");
			nr = sc.nextInt();
			
		}while(nr < 6);
		
			
			sc.nextLine();
			String fjalia2 = "";
			String fjalia4 = "";
			String meIgjat = "";
			for(int i = 0; i < nr; i++){
				System.out.print("Shkruani nje fjale/fjali:");
				String fjale = sc.nextLine();
				if(i == 1){
					fjalia2 = fjale;
				}
				if (i == 3){
					fjalia4 = fjale;
				}
				if(krahasoFjalite(fjalia2,fjalia4)){
					meIgjat = fjalia2;
				}
					else{
						meIgjat = fjalia4;
					}

			}
				System.out.print("Jane shtypur gjithsej:"+nr +"dhe-"+meIgjat +"-fjalia me e gjate. ");

	}
		public static boolean krahasoFjalite(String hello, String hey){
			if(hello.length() > hey.length()){
				return true;
			}
			else {
				return false;
			}
			

		}

		
}