import java.util.*;
public class Ushtrimi1{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.print("shtypeni nje numer se paku5:");
	int nr = sc.nextInt();
	
	while(nr < 5){
		System.out.print("shtypeni nje numer tjeter:");
		nr = sc.nextInt();
	}
	int [] vargu = new int [nr];
	
	for(int = 0;i<vargu.length;i++){
		System.out.print("shtype nje numer:");
		vargu[i] = sc.nextInt();
		
	}
	int [] rezultati = findNumbers(vargu);
	System.out.print("Jane shtypur gjithsej"+nr+"numra, numri i"+ "pare"+rez[0]+", numri i trete"+rez[1]+", numri i fundit "+rez[2]);
	}
	public static int [] findNumbers(int [] v){
		int Numri1 = 0;
		int Numri2= 0;
		int Numri3= 0;
		for(int i= 0;i<v.length;i++){
			if(i == 0){
				Numri1 = v[i];
				
			}
			if(i == 2){
				Numri2 = v[i];
				
			}
			if(i == v.length-1){
				Numri3= v[i];
			}
		int [] rez = new int[3];
		rez [0] = Numri1;
		rez [1] = Numri2;
		rez [2] = Numri3;
		return rez;
		}
		
	}


}