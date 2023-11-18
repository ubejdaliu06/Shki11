import java.util.*;
public class Ushtrimi1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
			
			int nr;
			int countAll = 0;
			int countKushti = 0;
			do{
				System.out.print("Trego sa numra do te shtypen (tek > 3):");
				nr = sc.nextInt();
			}while(nr < 3 && nr % 2 == 0);
			
			for (int i= 0; i < nr; i++){
				System.out.print("shtypeni nje numer tjeter:");
				int numri = sc.nextInt();
				countAll++;
				if(numri % 4 == 0){
					countKushti++;
				}
				
			}
			double rez = (double)countKushti*100/nr;
			
			System.out.println("Jane shtypur gjithsej:"+countAll+ "numra dhe "+countKushti+ "% e tyre e jane numra të plotpjestueshëm me 4.");
			}
				
		
	}



