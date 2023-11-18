public class Pajisja{
	
	public int numriSerik;
	public String Prodhuesi;
	public double voltazhi;
	public char kategoriaShpenzuese;
	
	public Pajisja(int A,String B, double G, char AT){
		numriSerik = A;
		Prodhuesi = B;
		voltazhi = G;
		kategoriaShpenzuese = AT;
	}
	
	public int getNumriSerik(){
		return numriSerik;
	}
		public void setProdhuesi(String AS){
			Prodhuesi = AS;
		}
		public String getProdhuesi(){
			return Prodhuesi;
		}
			public void setVoltazhi(double Als){
				voltazhi = Als;
			}
			public double getVoltazhi(){
				return voltazhi;
			}
				public void setKategoriaShpenzuese(char AS){
				kategoriaShpenzuese = AS;
				}
				public char getKategoriaShpenzuese(){
					return kategoriaShpenzuese;
				}
			
	
	public String toString(){
		return numriSerik+" : "+Prodhuesi+" "+voltazhi+" - "+kategoriaShpenzuese;
	}
	public boolean equals(Object obj){
		if(obj instanceof Pajisja){
			Pajisja Z1 =(Pajisja) obj;
			
			if(Z1.getNumriSerik() == numriSerik){
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
}