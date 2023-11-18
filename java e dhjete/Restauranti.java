public class Restauranti{
	
	public String emri;
	
	Kamarieri [] vargu;
	int index = 0;
	
	public Restauranti(String A, int O){
		emri = A;
		
		vargu = new Kamarieri[O];
		
	}
	
	public boolean ekziston(Kamarieri V){
		
		for(int i = 0; i<index;i++){
			if(vargu[i].equals(V)){
				return true;
			}
		}
			return false;
	}
	
	public void shtoKamarierin(Kamarieri Y){
		if(Y == null){banes me qira ne dardanilakrishte
			System.out.println("Nuk ekziston ndonje Kamarier!"+Y);
			return;
		}
		if(index == vargu.length){
			System.out.println("Nuk kem vend!");
			return;
		}
		if(ekziston(Y)){
			System.out.println("Kafsha ekziston ne Restaurant!"+Y);
			return;
		}
		vargu[index++] = Y;
	}
		
		
		public Kamarieri kamarieriMeIRi(double Paga){
				Kamarieri K1 = vargu[0];
				for(int i = 0; i<index;i++){
					if(vargu[i].getPagamujore() == Paga){
						
						if(vargu[i].getVitilindjes() > K1.getVitilindjes()){
						K1 = vargu[i];
						}
					}
				
				}
				return K1;
		}
		public Kamarieri [] kamarieretOrari(String Orari){
				int count = 0;
				for(int i = 0;i<index;i++){
					if(vargu[i].getOrariPunes().equals(Orari)){
						count++;
					}
				}
					Kamarieri [] rez = new Kamarieri[count];
					int pointer = 0;
					for(int i = 0;i<index;i++){
					if(vargu[i].getOrariPunes().equals(Orari)){
						rez[pointer++]= vargu[i];
					}
				}
				return rez;
		}
		
		public Kamarieri [] shtypKamarieretMeE(){
			int counter= 0;
			for(int i=0;i<index;i++){
				if(vargu[i].getEmri().charAt(0) == 'E'){
					counter++;
				}
			}
			
			
			Kamarieri [] rez = new Kamarieri[counter];
			int pointer = 0;
		
			for(int i=0;i<index;i++){
				if(vargu[i].getEmri().charAt(0) == 'E'){
					rez[pointer++] = vargu[i];
				}
			}
			return rez;
		}
	
	

	public static void main(String []args){
		
			Restauranti R = new Restauranti("Gresa", 4);
			// id,emri,vitilindjes,orari,paga double
			Kamarieri K1 = new Kamarieri(112,"Meriton",2001,"diten",300.0);
			Kamarieri K2 = new Kamarieri(111,"Ilmi",2003,"naten",20.0);
			Kamarieri K3 = new Kamarieri(110,"bllek",2006,"diten",300.0);
			Kamarieri K4 = new Kamarieri(115,"Eight",2002,"diten",300.0);
			
			
			R.shtoKamarierin(K1);
			R.shtoKamarierin(K2);
			R.shtoKamarierin(K3);
			R.shtoKamarierin(K4);
			
			R.kamarieriMeIRi(300.0);
			System.out.println(K1);
			
			Kamarieri [] totali = R.kamarieretOrari("naten");
			for(Kamarieri K: totali){
				System.out.println(K);
			}
			
			Kamarieri[] ilmi = R.shtypKamarieretMeE();
			for(Kamarieri A: ilmi){
				System.out.println(A);
			}
			
	
	}






	}