public class Dyqani{
	
	public String emri;
	Pajisja [] vargu;
	int index = 0;
	
	public Dyqani(String A, int O){
		emri = A;
		vargu = new Pajisja[O];
	}
	
	public boolean ekziston(Pajisja K){
		
		for(int i = 0; i<index;i++){
			if(vargu[i].equals(K)){
				return true;
			}
		}
			return false;
	}
	
	public void shtoPajisjen(Pajisja K){
		if(K == null){
			System.out.println("Nuk ekziston send!");
			return;
		}
		if(index == vargu.length){
			System.out.println("Nuk kem vend ne varg!");
			return;
		}
		if(ekziston(K)){
			System.out.println("Pajisja ekziston ne Dyqan!");
			return;
		}
		vargu[index++] = K;
	}
		
		public void shtypPajisjetSipasProdhuesit(String Prodhuesi){
			
			for(int i = 0; i<index; i++){
				if(vargu[i].getProdhuesi().equals(Prodhuesi)){
					System.out.println(vargu[i]);
				}
			}
		}
		
				public Pajisja avgMaxVoltazhi(){
					Pajisja K1 = null;
					double MesatarjaV = 0.0;
					int countV= 0;
					
					for(int i = 0;i<index;i++){
						MesatarjaV = vargu[i].getVoltazhi();
						countV++;
					}
					double avg = MesatarjaV/countV;
					for(int j = 0;j<index;j++){
						if(K1 == null || vargu[j].getVoltazhi() >= avg){
							K1 = vargu[j];
						}
					}
					return K1;
				}
	
	

	public static void main(String []args){
		
			Dyqani XX = new Dyqani ("Neptun",5);
			//numriSerik,prodhuesi,voltazhi,kategoriaShpenzuese
			Pajisja A = new Pajisja(1122,"Samsung",20.2,'A');
			Pajisja B = new Pajisja(1123,"Apple",15.4,'B');
			Pajisja C = new Pajisja(3432,"Xiomo",14.3,'A');
			Pajisja D = new Pajisja(8783,"IQ",25.2,'C');
			Pajisja E = new Pajisja(9090,"linktree",25.2,'E');
		
			XX.shtoPajisjen(A);
			XX.shtoPajisjen(B);
			XX.shtoPajisjen(C);
			XX.shtoPajisjen(D);
			XX.shtoPajisjen(E);
		
			if(A.equals(B)){
				System.out.println(A+"-Kja paisje eshte e barabart me pajisejn:"+B);
			}
			else{
				System.out.println(A+" -Kja pajisje nuk eshte barabart me paisjen: "+B);
			}
			XX.avgMaxVoltazhi();
			
			XX.shtypPajisjetSipasProdhuesit("Samsung");
	}






	}