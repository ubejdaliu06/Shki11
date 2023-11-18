import java.util.*;
public class Ushtrimi3{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
	int nr;
	do{
		System.out.print("Shtyp nje numer se paku 15:");
		nr = sc.nextInt();
	}while(nr<15);
		
		int [] vargu = new int [nr];
		
			
			for (int i = 0; i<vargu.length; i++){
				System.out.print("Shtypeni nje vlere:");
				vargu [i] = sc.nextInt();
			}
			 int[] rez = findNumbers(vargu);
			System.out.print("Jane shtypur gjithsej"+nr+"numra dhe"+ "numri më i madh është:"+rez[1]+" ndërsa më i vogli:"+rez[0]);
	}
		public static int [] findNumbers(int [] v){
			int nrVogel=10;
			int nrMadh = 0;
			
			for (int i= 0;i<v.length;i++){
				if(v[i] < nrVogel){
				nrVogel = v[i];
				}
				if(v[i]> nrMadh){
					
					nrMadh = v[i];
				}
				
				
					
			}
			
			
			int [] testo = new int [2];
			testo [0] = nrVogel;
			testo [1] = nrMadh;
			return  testo;
}
}