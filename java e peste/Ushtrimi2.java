import java.util.*;
public class Ushtrimi2{
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Shkruani nje numer se paku 10:");
	int nr = sc.nextInt();
	
	while (nr < 10){
			System.out.print("Shkruani nje numer se paku 10:");
			nr = sc.nextInt();
	}

		String [] vargu = new String[nr]; 
		sc.nextLine();
		
		for(int i= 0; i<vargu.length;i++){
			System.out.print("Shtyp nje fjale/fjali:");
			vargu [i] = sc.nextLine();
			}
			double rez = findWord (vargu);
			System.out.print("Jane shtypur gjithsej:"+nr+"fjale/fjali dhe gjatesia mesatare"+
			"e atyre që fillojnë me shkronjën A dhe mbarojnë me E:"+rez);
}
 			public static double findWord(String [] v){
				int countKushti = 0;
				int shuma = 0;
				for (int i = 0; i<v.length;i++){
					if(v[i].toLowerCase().startsWith("a") && v[i].toLowerCase().endsWith("e")){
						countKushti++;
						shuma += v[i].length();
					}
				}
			int mesatare= shuma / countKushti ;
			return mesatare;
			}
}