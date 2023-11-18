import java.util.*;
public class Ushtrimi2{
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
			 double [] rez = findWord(vargu);
			System.out.print("Jane shtypur gjithsej"+nr+"fjalë/fjali dhe gjatesia mesatare e pare(Prishtine)"+rez[0]+ "gjatesia mesatare e dyte(Prizren)"+rez[1]);
	}
		public static double [] findWord(String [] v){
			int nrPZ= 0;
			int countPrizeren=0;
			int countPrishtin=0;
			int nrPR= 0;
			for (int i= 0;i<v.length;i++){
				if(v[i].toLowerCase().contains("prishtine")){
				nrPR++;
				countPrishtin += v[i].length;
				}
				if(v[i].toLowerCase().contains("prizren")){
					nrPZ++;
					countPrizeren += v[i].length;
				}
				
				
					
			}
			double mesatarjaPZ= (double)countPrizeren/nrPZ;
			double mesatarjaPR = (double)countPrishtin/nrPR;
			
			double [] testo = new double [2];
			testo [0] = mesatarjaPR;
			testo [1] = mesatarjaPZ;
			return  testo;
}
}