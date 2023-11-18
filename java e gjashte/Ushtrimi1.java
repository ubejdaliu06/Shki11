import java.util.*;
public class Ushtrimi1{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Shkruje nje numer qift dhe me te madh se 4:");
		int numri = sc.nextInt();
		while (numri % 2 == 0 || numri <= 4){
			System.out.print("Shtypeni nje numer qift dhe me te madhe se 4:");
			numri = sc.nextInt();
		}
		
		int [] vargu = new int [numri];
		
			for (int i = 0; i<vargu.length; i++){
				System.out.print("Shtypeni nje vlere:");
				vargu [i] = sc.nextInt();
			}
			 int [] rez = findBiggestOdd(vargu);
			System.out.print("Jane shtypur gjithsej:"+rez[0]+"numra dhe numri me i madh tek eshte:"+rez[1]);
	}
	
		public static int [] findBiggestOdd(int[] v){
			int count = 0;
				
			for(int i = 0; i<v.length;i++){
				if(v[i] % 2 != 0){
					count = v[i];
					if(v[i] > count){
						count = v[i];
					}
				}
			}
		
			
				int [] testo = new int[2];
			testo [0] =  v.length;
			testo [1] =	count;
			
		
			return  testo;
		}
}
