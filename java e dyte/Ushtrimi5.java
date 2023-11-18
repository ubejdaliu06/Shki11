import java.util.*;
public class Ushtrimi5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Shtypni nje fjal apo fjali :");
		String fjalia = sc.nextLine();
		
		String SENTINEL = "END";
		int countALL = 0;
		int countkushti = 0;
		
			do{
				if(!(fjalia.contains(SENTINEL))){
					countALL++;
					System.out.print("Shtypeni nje fjal apo fjali tjeter:");
					fjalia = sc.nextLine();
					}
					
					if (fjalia.charAt(0) == 'F' && fjalia.length() > 5){
						countkushti++;
						}
				}while(!(fjalia.contains(SENTINEL)));
							
							if (countkushti == 0 ){
								System.out.println("Asnjë nga fjalitë e shtypura nuk e plotësojnë kushtin. ");
							}
							else {
							System.out.print("Shuma e fjalive te shtypur:" +countALL+ "Shuma e fjalive qe ja nisin me shkronjen F dhe jane me te gjata se 5 karaktere:" +countkushti );
							}
			
			}
				
		
	}



