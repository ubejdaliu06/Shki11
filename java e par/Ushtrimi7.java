import java.util.*;
public class Ushtrimi7{
	public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
		
			String variabel = "test";
			String SENTINEL = "END";
			int countKushti = 0;	
					
					System.out.print("Shtypni nje fjale/fjali:");
					String fjalia = sc.nextLine();
					
						while(!(fjalia.contains(SENTINEL))){
							
							if(fjalia.compareTo(SENTINEL) > 0){
								countKushti++;
							
							}
						System.out.print("shtypni nje fjali tjeter:");
						fjalia = sc.nextLine();
						}
					System.out.print("fjalit me te gjat se fjala TEST:" +countKushti);
	}
}