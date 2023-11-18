import java.util.*;
public class Ushtrimi1{
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Shkruani nje numer se paku 5:");
	int nr = sc.nextInt();
	
	while (nr < 5){
			System.out.print("Shkruani nje numer se paku 5:");
			nr = sc.nextInt();
	}

		int[] vargu = new int[nr]; // [_,_,_,_,_] sa percaktohet shuma e numrave
		
		for(int i= 0; i<vargu.length;i++){
			System.out.print("Shtyp nje numer:");
			vargu [i] = sc.nextInt();
			}
			double rez = calcutlateNumbers(vargu);
			System.out.print("Jane shtypur gjithsej"+nr+"numra:"+rez+"% e cilave ishin numra tek");
}
 			public static double calcutlateNumbers(int [] v){
				int countKushti = 0;
				for (int i = 0; i<v.length;i++){// 2, 4 = 50%
					if(v[i] % 2 != 0){
						countKushti++;
					}
				}
			double perqindja = (double)v.length / countKushti * 100;
			return perqindja;
			}
}