public class KopshtiZoologjik{
	
	public String emri;
	public String lokacioni;
	Kafsha [] vargu;
	int index = 0;
	
	public KopshtiZoologjik(String A,String S, int O){
		emri = A;
		lokacioni = S;
		vargu = new Kafsha[O];
		
	}
	
	public boolean ekziston(Kafsha V){
		
		for(int i = 0; i<index;i++){
			if(vargu[i].equals(V)){
				return true;
			}
		}
			return false;
	}
	
	public void shtoKafshen(Kafsha Y){
		if(Y == null){
			System.out.println("Nuk ekziston ndonje kafsh!");
			return;
		}
		if(index == vargu.length){
			System.out.println("Nuk kem vend!");
			return;
		}
		if(ekziston(Y)){
			System.out.println("Kafsha ekziston ne Koopshtzoologjik!"+Y);
			return;
		}
		vargu[index++] = Y;
	}
		
		public Kafsha [] ktheKafshet(String lloji){
			int count= 0;
			for(int i = 0; i<index; i++){
				if(vargu[i].getLloj().equals(lloji)){
					count++;
				}
			}
			if(count == 0){
				return null;
			}
			Kafsha [] limit = new Kafsha[count];
			int pointer = 0;
			
			for(int i = 0; i<index; i++){
				if(vargu[i].getLloj().equals(lloji)){
					limit[pointer++] = vargu[i];
				}
				
				
		}
		return limit;
		}
		public void shtypKafshenMeTeVogel(){
				Kafsha KafshaV = vargu[0];
					for(int i = 0; i<index;i++){
						if( KafshaV.getMosha() > vargu[i].getMosha()){
							KafshaV = vargu[i];
						}
					}
					System.out.println(KafshaV);
		}
	
	

	public static void main(String []args){
		
			KopshtiZoologjik XX = new KopshtiZoologjik("Bota e kafsheve","Shkup",8);
			
			Kafsha A1 = new Kafsha ("snake","Meriton",10);
			Kafsha A2 = new Kafsha ("Giraf","ilmi",8);
			Kafsha A3 = new Kafsha ("leopard","Meriton",10);
			Kafsha A4 = new Kafsha ("leopard","Meriton",10);
			Kafsha A5 = new Kafsha ("krokodil","Meriton",15);
			Kafsha A6 = new Kafsha ("qen","Ilmi",11);
			Kafsha A7 = new Kafsha ("qen","Meriton",10);
			Kafsha A8 = new Kafsha ("dinosaur","Meriton",10);
	
		
		XX.shtoKafshen(A1);
		XX.shtoKafshen(A2);
		XX.shtoKafshen(A3);
		XX.shtoKafshen(A4);
		XX.shtoKafshen(A5);
		XX.shtoKafshen(A6);
		XX.shtoKafshen(A7);
		XX.shtoKafshen(A8);
	
	
		
	
		XX.shtypKafshenMeTeVogel();
		
		Kafsha [] rez = XX.ktheKafshet("qen");
		
		for (Kafsha K : rez){
			System.out.println(K);
		}
	
	}






	}