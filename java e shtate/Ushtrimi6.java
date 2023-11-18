import java.util.*;
public class Ushtrimi6{
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
			 int [] rez = findText(vargu);
			System.out.print("Jane shtypur gjithsej"+nr+" fjalë/fjali dhe "+rez[0]+" prej tyre kishin nga 5 ose më shumë"+
			" fjale/fjali");
	}
		public static int [] findText(String [] v){
			int countFjala = 0;
			int countALL = 0;
			for (int i= 0;i<v.length;i++){
				if(v[i].contains(" ")){
				countFjala++;
				}
				if(countFjala > 5){
					countALL++;
				}
				
					
			}
			
			
			int [] testo = new int [1];
			testo [0] = countALL;
			
			return  testo;
}
}