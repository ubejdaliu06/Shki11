import java.util.*;
public class Ushtrimi5{
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
			 
				int [] rez = countWords(vargu);
			System.out.print("Jane shtypur gjithsej:"+nr+" fjale/fjali dhe"+rez[0]+"fjale ishin gjithsej");
	}
	
		public static int [] countWords(String[]v){
			
				int countSpace= 0;
			int countWords = 0;
			for(int i = 0; i<v.length;i++){
				
				String[] words = v[i].split("\\s+");
				countWords = words.length;
							
						if (countWords > 0) {
					countSpace += countWords;
				}
				}
				
			
			
			
			
			
			int [] testo = new int [1];
			testo [0] = countSpace;
			
			
			
		
			return  testo;
		}
}

