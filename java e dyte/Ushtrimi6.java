import java.util.*;
public class Ushtrimi6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Shtypni nje fjal apo fjali :");
	
		String fjalia;
		String SENTINEL = "END";
		int countALL = 0;
		int countkushti = 0;
		
			do{
				System.out.print("Shtypeni nje fjali tjeter:");
					fjalia = sc.nextLine();
					if(!(fjalia.equals(SENTINEL))){
					countALL++;

						if((fjalia.charAt(fjalia.length()-2)) == 'B' && fjalia.length() % 2 == 0)
						countkushti++;
						}

					
													
				
			}while(!(fjalia.contains(SENTINEL)));
			
			System.out.println("Shuma e fjalive te shtypur:" +countALL+ "fjalit qe plotesojn kushtin:" +countkushti);
				
	
		
	}
}


