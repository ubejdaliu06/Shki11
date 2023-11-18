public class Kamarieri{
	
	public int id;
	public String emri;
	public int vitiLindjes;
	public String orariPunes;
	public double Pagamujore;
	
	public Kamarieri(int A, String O, int SS, String I, double SL){
	id = A;
	emri = O;
	vitiLindjes = SS;
	orariPunes = I;
	Pagamujore = SL;
	
	}
	
	public int getId(){
		return id;
	}
		public void setEmri(String AS){
			emri = AS;
		}
		public String getEmri(){
			return emri;
		}
			public void setVitilindjes(int Als){
				vitiLindjes = Als;
			}
			public int getVitilindjes(){
				return vitiLindjes;
			}
			public void setOrariPunes(String AS){
			orariPunes = AS;
		}
		public String getOrariPunes(){
			return orariPunes;
		}
					public void setPagamujore(double AS){
						Pagamujore = AS;
					}
					public double getPagamujore(){
						return Pagamujore;
					}
	
	public String toString(){
		return id+" : "+emri+" - "+vitiLindjes+" punon me orar "+orariPunes+" dhe ka pagen : "+Pagamujore;
	}
	public boolean equals(Object obj){
		if(obj instanceof Kamarieri){
			Kamarieri K = (Kamarieri) obj;
			
			if(K.getId() == id){
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
}