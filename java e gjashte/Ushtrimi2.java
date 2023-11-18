import java.util.*;
public class Ushtrimi2{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Shkruje nje numer se paku 10:");
		int numri = sc.nextInt();
		
		while (numri < 10){
			System.out.print("Shkruje nje numer se paku 10:");
			numri = sc.nextInt();
		}
		
		String [] vargu = new String [numri];
		sc.nextLine();
		
			for (int i = 0; i<vargu.length; i++){
				System.out.println("Shtypeni nje fjale/fjali:");
				vargu [i] = sc.nextLine();
			}
			 double [] rez = findSymbols(vargu);
			System.out.print("Jane shtypur gjithsej"+(int)rez[0]+"fjale/fjali dhe gjatesia mesatare e"+
				"fjaleve/fjalive qe permbajne 3 simbole aritmeDke:"+rez[1] );
	}
	
		public static double[] findSymbols(String [] v){
			int count = 0;
				int shuma = 0;
				
			for(int i = 0; i<v.length;i++){
				for(int j = 0; j<v[j].length();j++){
					if(v[i].charAt(j) == '*'||v[i].charAt(j) == '-' || v[i].charAt(j) == '+'||v[i].charAt(j) == '/'||v[i].charAt(j) == '%'){
						count++;
						
					}
					
				}
				if(count == 3){
							shuma += v[i].length();
							count = 0;
						}
						else if (count != 3){
							count = 0;
						}
			}
			
			
			double avg = (double)shuma / v.length;
			
				double [] testo = new double[2];
			testo [0] =  v.length;
			testo [1] =	avg;
			
		
			return  testo;
		}
}
