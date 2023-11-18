import java.util.*;
public class Ushtrimi3{
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	int nr ;
		do{
			System.out.print("Shtyp nje numer se paku 15:");
			nr = sc.nextInt();
		}while(nr < 15);

		int[] vargu = new int[nr]; 
		
		for(int i= 0; i<vargu.length;i++){
			System.out.print("Shtyp nje numer:");
			vargu [i] = sc.nextInt();
			}
			double rez = countNumbers(vargu);
			System.out.print("Jane shtypur gjithsej"+nr+
			"numra dhe mesatarja e numrave më të vegjël se 20 është:"+rez);
}
 			public static double countNumbers(int [] v){
				int countKushti = 0;
				int countnr = 0;
				for (int i = 0; i<v.length;i++){
					if(v[i] < 20){
						countKushti += v[i];
						countnr++;
					}
				}
			double perqindja = (double)countKushti / countnr;
			return perqindja;
			}
}