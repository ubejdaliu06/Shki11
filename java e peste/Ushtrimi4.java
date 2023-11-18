import java.util.*;
public class Ushtrimi4{
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	int nr ;
		do{
			System.out.print("Shtyp nje numer se paku 10:");
			nr = sc.nextInt();
		}while(nr < 10);


		String [] vargu = new String[nr];
		sc.nextLine();
		
		for(int i= 0; i<vargu.length;i++){
			System.out.print("Shtyp nje fjale/fjali:");
			vargu [i] = sc.nextLine();
			}
			int rez = numeroNumrat(vargu);
			System.out.print("Jane shtypur gjithsej" +nr+ "fjale/fjali dhe:"+rez+"prej tyre kishin vetëm 2 numra. ");
			
}
 			public static int numeroNumrat(String [] v){
				int count2Numra = 0;
				for(int i = 0; i<v.length;i++){
					int countNumra = 0;
					
				for(int j= 0; j<v[i].length();j++){
					int count2 = 0;
					if(Character.isDigit(v[i].charAt(j))){
						countNumra++;
					}
				}
				if (countNumra == 2){
					count2Numra++;
				}
				}
				
				
			return count2Numra;
			}
}