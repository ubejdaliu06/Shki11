public class Kinema{
	public String emri;
	public String lokacioni;
	Bileta [] vargu;
	int index;
	
	public Kinema(String A, String K, int L){
		emri = A;
		lokacioni = K;
		vargu = new Bileta[L];
		
	}
	
	public int shtoBileten(Bileta Z){
		if(Z == null){
			System.out.println("Nuk ekziston asnje bilet!!");
			return index;
		}
		if(index >= vargu.length){
			System.out.println("Nuk kem vend per mashum tiketa ne Kinema!!");
			return index;
		}
		for(int i = 0;i<index;i++){
			if(vargu[i].equals(Z)){
				System.out.println("Bileta ekziston");
				return index;
			}
		}
		vargu[index ++ ]= Z;
		return index;
	}
			public int fshijBileten(){
				int countK = 0;
				for(int i= 0;i<index;i++){
					
					if(vargu[i].getKaZbritje() == true){
						
						for(int j = i;j<index -1;j++){
							vargu[j] = vargu[j+1];
							
						}
						vargu[--index] = null;
						i--;
						countK++;
					}
				}
				int Fshirja = countK;
				return Fshirja;
			}
			
			public double kalkuloFitimin(String K){
				double Shuma = 0;
				for(int i= 0;i<index;i++){
					if(vargu[i].getFilmi().equals(K)){
						Shuma += vargu[i].getCmimi();
					}
				}
				return Shuma;
			}
			
			public Bileta [] filmatSipasOrarit (String or){
				int countk= 0;
				for(int i = 0;i<index;i++){
					if(vargu[i].getOrari().equals(or)){
						countk++;
					}
				} 
				
				Bileta [] rez = new Bileta [countk];
				int pozita = 0;
				
				for(int i = 0;i<index;i++){
					if(vargu[i].getOrari().equals(or)){
						rez[pozita++] = vargu[i];
						
					}
				} 
				return rez;
			}
			
			public void shtypSipasUleseve(String K,String O){
				for(int i = 0;i<index;i++){
					if(vargu[i].getUlesja().startsWith(K) && vargu[i].getFilmi().equals(O)){
						System.out.println(vargu[i]);
					}
				}
			}
						public static void main(String[]args){
							
							
							Kinema I = new Kinema("Hollywood","Beverly Hills",6);
							
							
							Bileta A1 = new Bileta(123,"Casa de papel","2 A", 20.0D,"nata",true);
							Bileta A2 = new Bileta(121,"Dinosaurs","2 A", 25.0D,"nata",false);
							Bileta A3 = new Bileta(120,"Cars","2 A", 30.0D,"paradite",true);
							Bileta A4 = new Bileta(124,"Casa de papel","2 A", 15.0D,"nata",true);
							Bileta A5 = new Bileta(125,"Cars","2 A", 27.0D,"paradite",false);
							Bileta A6 = new Bileta(126,"Cars","3 A", 20.0D,"nata",true);
							
							I.shtoBileten(A1);
							I.shtoBileten(A2);
							I.shtoBileten(A3);
							I.shtoBileten(A4);
							I.shtoBileten(A5);
							I.shtoBileten(A6);
							
							
							
							double Fitimi = I.kalkuloFitimin("Cars");
							System.out.println("Fitimi per filmi Cars:"+Fitimi);
							
							
							Bileta [] filmat = I.filmatSipasOrarit("paradite");
							System.out.println("Filmat sipas orarit paradite: ");
							for(Bileta K : filmat){
								System.out.println(K);
							}
							System.out.println(" ");
							int Fshirje = I.fshijBileten();
							System.out.println("Shuma e biletave qe jan fshi:"+Fshirje);
							
							
							I.shtypSipasUleseve("2","Casa de papel");
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
						}
	}