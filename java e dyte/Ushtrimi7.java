import java.util.*;
public class Ushtrimi7{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		
		
		
		String fjalia;
		
		String SENTINEL = "EXIT";
		int countALL = 0;
		int countkushti = 0;
		
			do{
				System.out.print("Shtypni nje fjal apo fjali :");
				fjalia = sc.nextLine();
				if(!(fjalia.contains(SENTINEL))){
					countALL++;
				}
				if ((fjalia.endsWith("A") || fjalia.endsWith("I") || fjalia.endsWith("a") ||
				fjalia.endsWith("i") || fjalia.endsWith("O") || fjalia.endsWith("o")) || fjalia.endsWith("E") || fjalia.endsWith("E") || fjalia.endsWith("U")
				|| fjalia.endsWith("U") || fjalia.endsWith("u") || fjalia.endsWith("y") || fjalia.endsWith("Y")){
					countkushti++;
				}
			}while(!(fjalia.contains(SENTINEL)));
			
			System.out.println("Shuma e fjalive te shtypur:" +countALL+ "fjalit qe plotesojn kushtin:" +countkushti);
			}
				
		
	}



