import java.util.*;
public class Ushtrimi4{
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
			 String [] rez = findWord(vargu);
			System.out.print("Jane shtypur gjithsejfjale/fjalia dhe falia e pare(start)"+rez[0]+
			", falia e dyte (end) "+rez[1]);
	}
		public static String [] findWord(String [] v){
			String END = "";
			String start = "";
			
			for (int i= 0;i<v.length;i++){
				if(v[i].toLowerCase().endsWith("end")){
				END = v[i];
				}
				if(v[i].startsWith("start")){
					start = v[i];
				}
				
				
					
			}
			
			
			String [] testo = new String [2];
			testo [0] = start;
			testo [1] = END;
			return  testo;
}
}