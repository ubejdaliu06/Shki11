import java.util.*;
public class Ushtrimi5{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int nr;
	do{
		System.out.println("Shtypeni nje numer se paku 10:");
		nr = sc.nextInt();
	}while(nr < 10);
		
		sc.nextLine();
		String [] vargu = new String[nr];
			
			for(int i = 0;i<vargu.length;i++){
				System.out.print("Shtypeni nje fjale/fjali:");
				vargu[i] = sc.nextLine();
			}
			int rez = numeroFjalen(vargu);
			System.out.print("Jane shtypur gjithsej:"+nr+"fjale/fjali dhe-"+rez+"prej tyre e plotesojne kushtin. ");
		}
		
		public static int numeroFjalen(String [] v){
			int countKushti = 0;
			for(int i = 0;i<v.length;i++){
				if(v[i].length() > 4 && v[i].length() < 8){
						if(!(v[i].contains("a") || v[i].contains("A")||v[i].contains("o")||v[i].contains("O")||v[i].contains("e")
						||v[i].contains("E")||v[i].contains("i")||v[i].contains("I")||v[i].contains("u")||v[i].contains("U"))){
					countKushti++;
				}
				}
			}
				return countKushti;
		
			
		
		}
}