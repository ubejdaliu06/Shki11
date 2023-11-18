import java.util.*;
public class Ushtrimi8{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		String fjalia;
		
		String SENTINEL = "END";
		int countALL = 0;
		int countkushti = 0;
		int nr = 1-99;
			do{
				System.out.print("Shtypni nje fjal apo fjali :");
				fjalia = sc.nextLine();
				if(!(fjalia.contains(SENTINEL))){
					countALL++;
					if (Character.isDigit(fjalia.charAt(0)) && Character.isDigit(fjalia.charAt(fjalia.length() -1 ))){
					countkushti++;
				}
				}
			}while(!(fjalia.contains(SENTINEL)));
			
			System.out.println("Shuma e fjalive te shtypur:" +countALL+ "fjalit qe plotesojn kushtin:" +countkushti);
			}
				
		
	}



