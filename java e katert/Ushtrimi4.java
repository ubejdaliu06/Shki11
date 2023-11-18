import java.util.*;

public class Ushtrimi4{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Shtypeni nje numer se paku 8:");
			int nr = sc.nextInt();
			while(nr < 8){
			System.out.print("Shtypeni nje numer tjeter se paku 8:");	
			nr = sc.nextInt();
			}
		
			
			double NrNegativQift = 0;
			for(int i = 0; i < nr; i++){
				System.out.print("Shkruani nje numer negativ dhe qift:");
				 double NUMRI = sc.nextDouble();
				if(NUMRI % 2 == 0 && NUMRI< 0 && NUMRI < NrNegativQift){
					NrNegativQift = NUMRI;
				}

			}
				if(!(NrNegativQift == 0)){
					System.out.print("Jane shtypur gjithsej:"+nr+"numra dhe-"+NrNegativQift+"-ishte numri me i vogel çift pozitiv.  ");
					}
					else{
						System.out.print("Nuk eshte shtypur asnje numër çift pozitiv!");
					}
	}
		

		}

		
