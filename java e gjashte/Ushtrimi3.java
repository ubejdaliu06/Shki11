import java.util.*;
public class Ushtrimi3{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		int nr ;
		do{
			System.out.print("Shtyp nje numer se paku 12:");
			nr = sc.nextInt();
		}while(nr < 12);
		
		byte [] vargu = new byte [nr];
		
			for (int i = 0; i<vargu.length; i++){
				System.out.println("Shtypeni nje vlere:");
				vargu [i] = sc.nextByte();
			}
			 double [] rez = findNumbers(vargu);
			System.out.print("Jane shtypur gjithsej"+(int)rez[0]+"numra dhe perqindja e numrave qift te"+ "plotpjesetueshem me 6: " +rez[1]);
	}
	
		public static double[] findNumbers(byte [] v){
			int count = 0;
				
				
			for(int i = 0; i<v.length;i++){
				if (v[i] % 6 == 0){
					count++;
				}
				
			}
			double perqindja = ((double)100/v.length) * count;		
		
			
				double [] testo = new double[2];
			testo [0] =  v.length;
			testo [1] =	perqindja;
			
		
			return  testo;
		}
}
