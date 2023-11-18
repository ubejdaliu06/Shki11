public class Biblioteka{
	public String emri;
	Libri [] vargu;
	int index;
	
	public Libri(String A, int L){
		emri = A;
		vargu = new Libri[L];
		
	}
	
	public boolean ekziston( A){
		for(int i = 0;i<index;i++){
			if(vargu[i].equals(A)){
				return true;
			}
		}
		return false;
	}
	
	public void shtoLibrin(Libri Z){
		if(Z == null){
			System.out.println("Nuk ekziston asnje liber!!");
			return;
		}
		if(index >= vargu.length){
			System.out.println("nuk ka mashum vend ne librari");
			return;
		}
		if(ekziston(Z)){
			System.out.println("Libra ekziston"+Z);
			return;
		}
		vargu[index ++ ]= Z;
		
	}
		public void shtypFiktivet(){
			for(int i = 0;i<index;i++){
				if(Libri[i].getEshteFiktiv() == false){
					System.out.println(Libri[i]);
				}
			}
		}
		
		public void LibriMeIRi(){
			Libri O = null;
			for(int i = 0;i<index;i++){
				if(O == null || Libri[i].getVitiPublikimit()< O.getVitiPublikimit()){
					O= Libri[i];
				}
			}
			return O;
		}
			
			public Libri []ktheSipasTitullit{
				
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