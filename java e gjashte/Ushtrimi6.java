import java.util.*;
public class Ushtrimi6{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
			int nr;
			do{
				System.out.print("Shtyp nje numer se paku 10:");
				 nr = sc.nextInt();
			}while(nr < 10);
			
		
		String [] vargu = new String[nr];
	
		sc.nextLine();
		
			for (int i = 0; i<vargu.length; i++){
				System.out.println("Shtypeni nje fjale/fjali:");
				vargu [i] = sc.nextLine();
			}
			 
				String [] rez = findText(vargu);
			System.out.print("Jane shtypur gjithsej"+nr+"Fjale/Fjali dhe fjalia me e gjate eshte:"+rez[0]);
	}
	
		public static String [] findText(String[]v){
			int count1 = 0;
			String fjalia1 = "";
			int count2 = 0;
			String fjalia2 = "";
			int count3 = 0;
			String fjalia3 = "";
			String fjalia = "";
				for(int i = 0; i<v.length;i++){
					
					if (i == v[i].length() -1) {
						count1 += v[i].length();
						fjalia1 = v[i];
					}
					if (i == v[i].length() -2) {
						count2 += v[i].length();
						fjalia2 = v[i];
					}
					if (i == v[i].length() -3) {
						count3 += v[i].length();
						fjalia3 = v[i];
					}
				}
				if(count1 < count2 && count1 < count3){
					fjalia = fjalia1;
				}
					if(count3 < count2 && count3 < count1){
					fjalia = fjalia2;
				}
						if(count2 < count3 && count2 < count1){
					fjalia = fjalia3;
				}
					
					
					
					
			
			
			
			
			
			
			String [] testo = new String [1];
			testo [0] = fjalia;
			
			
			
		
			return  testo;
		}
}
				
