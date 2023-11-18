import java.util.*;
public class Ushtrimi4{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Shtyp nje numer tek:");
			int nr = sc.nextInt();
			while(nr % 2 == 0){
				
				System.out.print("Shtyp nje numer tek:");
					nr = sc.nextInt();
			}
		
		String [] vargu = new String [nr];
		sc.nextLine();
		
			for (int i = 0; i<vargu.length; i++){
				System.out.println("Shtypeni nje fjale/fjali:");
				vargu [i] = sc.nextLine();
			}
			 String [] rez = findLastEnd(vargu);
			System.out.print("Jane shtypur gjithsej"+nr+" fjale/fjali dhe fjalia me kusht:"+rez[0]);
	}
	
		public static String [] findLastEnd(String[]v){
			
			String Fjali = "";
				
				
			for(int i = 0; i<v.length;i++){
				if (v[i].toLowerCase().endsWith("end")){
					Fjali = v[i];
				}
				
			}
			String [] testo = new String [1];
			testo [0] = Fjali ;
			
			
		
			return  testo;
		}
}
