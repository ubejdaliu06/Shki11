public class KopshtiZoologjik{
	public String emri;
	public String lokacioni;
	Kafsha [] vargu;
	int index;
	
	public KopshtiZoologjik(String A, String K,int L){
		emri = A;
		lokacioni = K;
		vargu = new Kafsha[L];
		
	}
	
	public boolean ekziston(Kafsha P){
		for(int i = 0;i<index;i++){
			if(vargu[i].equals(P)){
				return true;
			}
		}
		return false;
	}
	
	public void shtoKafshen(Kafsha Z){
		if(Z == null){
			System.out.println("Nuk ekziston asnje Kafshe!!");
			return;
		}
		if(index >= vargu.length){
			System.out.println("Nuk kem vend per mashum Kafshe ne Koopshtzoologjik!!");
			return;
		}
		if(ekziston(Z)){
			System.out.println("Kafsha ekziston!!"+Z);
			return;
		}
		
		vargu [index ++]=Z;
		
	}
	
	public void shtypKafshet(){
		int count = 0;
		for(int i = 0;i<index;i++){
			count += vargu[i].getMosha();
		}
		double avg = (double)count / index;
		for(int i = 0;i<index;i++){
			if(vargu[i].getMosha() < avg){
			System.out.println(vargu[i]);
			}
		}
	}
	
	
			public Kafsha [] ktheKafshetLlojiMosha(){
				Kafsha V = null;
				Kafsha M = null;
				for(int i = 0;i<index;i++){
					if(V == null || vargu[i].getMosha() >= V.getMosha()){
						V = vargu[i];
					}
					if(M == null || vargu[i].getMosha() <= V.getMosha()){
						M = vargu[i];
					}
					if( V == null || M == null){
						return null;
					}
					
				}
				Kafsha [] G = new Kafsha[2];
					G [0] = V;// kafsha me mosh me te vogel
					G [1] = M;// kafsha me mosh me te madhe
					return G;
				
			}
			
			
			public void fshijKafshet(String O){
				for(int i= 0; i<index;i++){
					if(vargu[i].getEmri().toLowerCase().endsWith(O)){
						
						for(int j = i;j<index -1 ; j++){
							vargu[j] = vargu [j+1];
						}
						vargu[--index] = null;
						i--;
					}
				}
			}
				
			
		
						public static void main(String[]args){
							
							
							KopshtiZoologjik I = new KopshtiZoologjik("Bota e Kafsheve","Shkup",9);
							/* public String lloj;
							public String emri;
							public int mosha;
	*/
							
							Kafsha A1 = new Kafsha("Tiger","bela",3);
							Kafsha A2 = new Kafsha("Balen","rodrigo",4);
							Kafsha A3 = new Kafsha("Luan","RIO",5);
							Kafsha A4 = new Kafsha("Elefant","Rosa",6);
							Kafsha A5 = new Kafsha("Elefant","Hydra",5);
							Kafsha A6 = new Kafsha("Delfin","Jaro",3);
							Kafsha A7 = new Kafsha("Delfin","Jeremi",3);
							Kafsha A8 = new Kafsha("Majmun","Zotri ndjenja",6);
							Kafsha A9 = new Kafsha("Majmun","Zonja ndjenja",6);
							
							I.shtoKafshen(A1);
							I.shtoKafshen(A2);
							I.shtoKafshen(A3);
							I.shtoKafshen(A4);
							I.shtoKafshen(A5);
							I.shtoKafshen(A6);
							I.shtoKafshen(A7);
							I.shtoKafshen(A8);
							I.shtoKafshen(A9);
							
							System.out.println("Kafshet qe jane me te vogel se mesatarja:");
							I.shtypKafshet();
							System.out.println(" ");
							Kafsha [] U = I.ktheKafshetLlojiMosha();
							System.out.println("Kafsha me e vogel: "+U[0]+"Kafsha me e vogel: "+U[1]);
														System.out.println(" ");
														I.fshijKafshet("a");

						
							
							
						}
	}