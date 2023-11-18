public class Pajisja{
	public int numriSerik;
	public String prodhuesi;
	public double voltazhi;
	public char kategoriaShpenzuese;
	
	public Pajisja(int A, String O, double U, char I){
		numriSerik = A;
		prodhuesi = O;
		voltazhi = U;
		kategoriaShpenzuese = I;
	}
	
	public int getNumriSerik(){
		return numriSerik;
	}
	public void setProdhuesi(String K){
		prodhuesi = K;
	}
	public void setVoltazhi(double U){
		voltazhi = U;
	}
	public void setKategoriaShpenzuese(char newValue){
		kategoriaShpenzuese = newValue;
	}
	
		public String getProdhuesi(){
			return prodhuesi;
		}
		public double getVoltazhi(){
			return voltazhi;
		}
		public char getKategoriaShpenzuese(){
			return kategoriaShpenzuese;
		}
		
		
		public String toString(){
			return numriSerik+" : "+prodhuesi+" "+ voltazhi+" - "+kategoriaShpenzuese;
		}
		
		public boolean equals(Object obj){
			if(obj instanceof Pajisja){
			Pajisja A = (Pajisja) obj;
			
			if(A.getNumriSerik() == numriSerik){
				return true;
			}
			
			}
			return false;
		}
}