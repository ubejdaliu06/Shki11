public class Dyqani{
	public String emri;
	Pajisja [] vargu;
	int index;
	
	public Dyqani(String A, int L){
		emri = A;
		vargu = new Pajisja[L];
		
	}
	
	public boolean ekziston(Pajisja A){
		for(int i = 0;i<index;i++){
			if(vargu[i].equals(A)){
				return true;
			}
		}
		return false;
	}
	
	public void shtoPajisjen(Pajisja Z){
		if(Z == null){
			System.out.println("Nuk ekziston asnje bilet!!");
			return;
		}
		if(index >= vargu.length){
			System.out.println("Nuk kem vend per mashum Pajisje ne Dyqan!!");
			return;
		}
		if(ekziston(Z)){
			System.out.println("Pajisjen e kem ne Dyqan!!"+Z);
			return;
		}
		vargu[index ++ ]= Z;
		
	}
			public Pajisja [] kthePajisjetMeVoltazh120 (){
				int countK = 0;
				for(int i = 0;i<index;i++){
					if(vargu[i].getVoltazhi() == 120D){
						countK++;
						
					}
				}
				Pajisja  [] rez = new Pajisja[countK];
				int pointer = 0;
				for(int i = 0;i<index;i++){
					if(vargu[i].getVoltazhi() == 120D){
						rez [pointer ++] = vargu [i];
						
					}
				}
				return rez;
				
			}
			
			
			public double perqindjaProdhuesi(String I){
				int countK = 0;
				for(int i = 0;i<index;i++){
					if(vargu[i].getProdhuesi().equals(I)){
						countK++;
						
					}
				}
				double avg = (100/(double)index)*countK;
				return avg;
			}
			
			
			public void fshijPajisjet(char O){
				for(int i= 0; i<index;i++){
					if(vargu[i].getKategoriaShpenzuese() == O){
						
						for(int j = i;j<index -1 ; j++){
							vargu[j] = vargu [j+1];
						}
						vargu[--index] = null;
						i--;
					}
				}
			}
				
			
		
						public static void main(String[]args){
							
							
							Dyqani I = new Dyqani("Neptun",6);
							/* public int numriSerik;
								public String prodhuesi;
								public double voltazhi;
								public char kategoriaShpenzuese;*/
							
							Pajisja A1 = new Pajisja(123,"Apple",150.0D,'A');
							Pajisja A2 = new Pajisja(121,"Samsung",160.0D,'B');
							Pajisja A3 = new Pajisja(120,"IQ",120.0D,'A');
							Pajisja A4 = new Pajisja(124,"link tree",125.0D,'C');
							Pajisja A5 = new Pajisja(125,"Apple",170.0D,'A');
							Pajisja A6 = new Pajisja(126,"Samsung",120.0D,'A');
							
							I.shtoPajisjen(A1);
							I.shtoPajisjen(A2);
							I.shtoPajisjen(A3);
							I.shtoPajisjen(A4);
							I.shtoPajisjen(A5);
							I.shtoPajisjen(A6);
							
							
							Pajisja [] total = I.kthePajisjetMeVoltazh120();
							System.out.println("Pajisjet me voltazh 120");
							for(Pajisja K: total){
								System.out.println(K);
							}
							System.out.println(" ");
							double IK = I.perqindjaProdhuesi("Apple");
							System.out.println("Perqindja e pajisjeve nga firma apple:"+IK);
							System.out.println(" ");
							
							I.fshijPajisjet('A');

							
							
							
						}
	}