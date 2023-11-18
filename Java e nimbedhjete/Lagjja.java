public class Lagjja{
	public String emri;
	 Banesa[] vargu;
	int index;
	
	public Lagjja(String A, int L){
		emri = A;
		vargu = new Banesa[L];
		
	}
	
	
	public void shtoBanesen(Banesa I){
		if(I == null){
			System.out.println("Nuk ekziston asnje Banes!!");
			return;
		}
		if(index >= vargu.length){
			System.out.println("Nuk kem vend per mashum Banesa ne Lagjje!!");
			return;
		}
			for(int i= 0;i<index;i++){
				if(vargu[i].equals(I)){
					return;
				}
			}
		
		vargu[index ++] = I;
		
	}
	
	public Banesa banesaMeEVjeter(String stil){
		int vitishuma = 0;
		for(int i = 0;i<index ; i++){
			if(vargu[i].getStiliArkitektonik().equals(stil)){
				vitishuma += vargu[i].getVitiNdertimit();
			}
		}
		double avg = (double)vitishuma/index;
		Banesa K = null;
		
		for(int i = 0;i<index;i++){
			if(vargu[i].getStiliArkitektonik().equals(stil)){
				if(K == null || vargu[i].getVitiNdertimit() < avg){
					K = vargu[i];
				}
			}
		}
		return  K;
	}
	
	
			public Banesa [] banesatEGjelbra(){
				Banesa pakKat = vargu[0];
				Banesa mashumtiKat = vargu[0];
				
				for(int i = 0;i<index;i++){
					if(vargu[i].getNgjyrave().equals("Gjelbert") && vargu[i].getNrKateve() <= pakKat.getNrKateve()){
						pakKat = vargu[i];
					}
					if(vargu[i].getNgjyrave().equals("Gjelbert") && vargu[i].getNrKateve() >= mashumtiKat.getNrKateve()){
						mashumtiKat = vargu[i];
					}
				}
				Banesa [] T = new Banesa [2];
				T [0] = pakKat;
				T [1] = mashumtiKat;
				return T;
				
			}
						public void shtypBanesateVitit(int viti){
							for(int i = 0;i<index;i++){
								if(vargu[i].getVitiNdertimit() == viti){
									System.out.println(vargu[i]);
								}
							}
						}
			
			
			public void fshijBanesat(Banesa O){
				for(int i= 0; i<index;i++){
					if(vargu[i].equals(O)){
						for(int j = i;j<index-1 ;j++){
							vargu[j] = vargu[j + 1];
						}
						vargu[--index] = O;
						i--;
					}
				}
				
			}
			public void ALLIN(){
				for(int i = 0;i<index;i++){
					System.out.println(vargu[i]);
				}
			}
				
			

						public static void main(String[]args){
							
							
							Lagjja I = new Lagjja("Dardania",4);
							/*
							public int id;
							public int nrKateve;
							public String ngjyra;
							public String stiliArkitektonik;
							public int vitiNdertimit;
							*/
													
							Banesa A1 = new Banesa(111,10,"Gjelbert","Oldschool",2020);
							Banesa A2 = new Banesa(112,12,"Bardhe","Oldschool",2010);
							Banesa A3 = new Banesa(113,15,"Gjelbert","Oldschool",2020);
							Banesa A4 = new Banesa(114,22,"Gjelbert","Gotik",1999);
							
							I.shtoBanesen(A1);
							I.shtoBanesen(A2);
							I.shtoBanesen(A3);
							I.shtoBanesen(A4);
							
							I.shtypBanesateVitit(2020);
							System.out.println(" ");
							
							Banesa IM = I.banesaMeEVjeter("Oldschool");
							System.out.println("Banesa me e vjeter me stil Oldschool: "+IM);
							System.out.println(" ");
							
							Banesa [] O = I.banesatEGjelbra();
							System.out.println("Banesat e gjelbert me se paktu kat: "+O[0]+" , me me se shumti: "+O[1]);
							System.out.println(" ");
							
							I.fshijBanesat(A3);
							I.ALLIN();
							System.out.println(" ");
							
							
							
							
						
							
							
						}
	}