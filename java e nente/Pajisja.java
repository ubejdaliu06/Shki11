public class Pajisja{
	
	private int numriSerik;
	public String prodhuesi;
	public double voltazhi;
	public String kategoriaShpenzuese;
	
	public Pajisja(int A, String U, double K , String KS){
		numriSerik = A;
		prodhuesi = U;
		voltazhi = K;
		kategoriaShpenzuese = KS;
	}
	
	public int getNumriSerik (){
		return numriSerik;
	}
	
		public void setProdhuesi(String AU){
			prodhuesi = AU;
		}
		public String getProdhuesi(){
			return prodhuesi;
		}
		
			public void setVoltazhi(double Als){
				voltazhi = Als;
			}
			public double getVoltazhi(){
				return voltazhi;
			}
			
				public void setKategoriaShpenzuese(String AL){
				kategoriaShpenzuese = AL;
			}
				public String getKategoriaShpenzuese(){
					return kategoriaShpenzuese;
				}
				
				@Override
				public String toString(){
					return numriSerik+":"+prodhuesi+" "+voltazhi+"-"+kategoriaShpenzuese;
				}
				private boolean equals(Object obj){
					if(obj instanceof Pajisja) {
					Pajisja G1 = (Pajisja) obj;
					
					if(!(this.getNumriSerik() == G1.getNumriSerik())){
						return false;
					}
				
			}
				
				
				return true;
			}
		
		public static void main(String[]args){
			Pajisja A1 = new Pajisja(10023,"apple",2.2,"A");
			Pajisja A2 = new Pajisja(70345,"Samsung",3.5,"B");
			Pajisja A3 = new Pajisja(70345,"Mi org",3.45,"B");
			
			
		
			
			System.out.println(A1.toString());
			System.out.println(A2.toString());
			System.out.println(A3.toString());
			
			System.out.println("-------------------------------------------------------------");
			System.out.println(" Testimi i Dy pajisje janë të njëjtë nëse e kanë numrin serik të njëjtë.");
			System.out.println("Pajisja i par me te dyten:"+A1.equals(A2));
			System.out.println("Pajisja i dyte me te treten:"+A2.equals(A3));
			
			
			
			
			
			
			
		
			
			
		}
	
	
	
}