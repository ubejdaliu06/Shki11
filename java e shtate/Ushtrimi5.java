import java.util.*;
public class Ushtrimi5{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
	System.out.print("shtypeni nje vler se paku 10:");
	int nr = sc.nextInt();
	while (nr<10){
		System.out.print("shtypeni nje numer tjeter:");
		nr = sc.nextInt();
	}
		
		String [] vargu = new String [nr];
		sc.nextLine();
			
			for (int i = 0; i<vargu.length; i++){
				System.out.print("Shtypeni nje fjale/fjali:");
				vargu [i] = sc.nextLine();
			}
			 int [] rez = findTextLengths(vargu);
			System.out.print("Jane shtypur gjithsej"+nr+"fjale/fjali dhe ishin të zbrazëta,"+rez[2]+
			"kishin gjatësinë tek dhe "+rez[1]+" kishin gjatësinë çift"+rez[0]);
	}
		public static int [] findTextLengths(String [] v){
			int countSPACE = 0;
			int TEK = 0;
			int Qift = 0;
			
			for (int i= 0;i<v.length;i++){
				if(v[i].contains("")){
				countSPACE++;
				}
				if(v[i].length() % 2 != 0){
					TEK++;
				}
				if(v[i].length() % 2 == 0){
					Qift++;
				}
				
				
					
			}
			
			
			int [] testo = new int [3];
			testo [0] = Qift;
			testo [1] = TEK;
			testo[2] = countSPACE;
			return  testo;
}
}