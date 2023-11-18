public class Kafsha{
	
	public String lloji;
	public String emri;
	public int mosha;
	
	public Kafsha(String A, String O, int SS){
	lloji = A;
	emri = O;
	mosha = SS;
	
	}
	
	public String getLloj(){
		return lloji;
	}
		public void setEmri(String AS){
			emri = AS;
		}
		public String getEmri(){
			return emri;
		}
			public void setMosha(int Als){
				mosha = Als;
			}
			public int getMosha(){
				return mosha;
			}
	
	public String toString(){
		return lloji+" - "+emri+"ka moshen "+mosha;
	}
	public boolean equals(Object obj){
		if(obj instanceof Kafsha){
			Kafsha XX = (Kafsha) obj;
			
			if(XX.getEmri().equals(emri) && XX.getLloj().equals(lloji) && XX.getMosha() == mosha){
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
}