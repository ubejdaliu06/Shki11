import java.util.*;
public class Ushtrimi6{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Shtypeni nje numer se paku 5:");
	int nr = sc.nextInt();
		while(nr < 5){
			System.out.print("shtypeni nje numer se paku 5!");
			nr = sc.nextInt();
			
		}
		
		int[] vargu = new int[nr];
			
			for(int i = 0;i<vargu.length;i++){
				System.out.print("Shtypeni nje Numer:");
				vargu[i] = sc.nextInt();
			}
			int rez = totalNumbers(vargu);
			double rez1 = averageNumbers(vargu);
			System.out.print("Jane shtypur gjithsej:"+nr+"numra, shuma e numrave të"+"shtypur ishte:"+rez+", ndersa mesatarja:"+rez1);
		}

		public static int totalNumbers(int [] v){
			int countKushti = 0;
			for(int i = 0;i<v.length;i++){
				countKushti += v[i];
				}
			return countKushti;
			}
				
		
		public static double averageNumbers(int []v){
			int ALL = 0;
			int mesatarja = 0;
			for(int i = 0;i<v.length;i++){
				ALL++;
				mesatarja += v[i];
			}
		double R1 = (double)mesatarja/ALL;
		return R1;
		}
}
