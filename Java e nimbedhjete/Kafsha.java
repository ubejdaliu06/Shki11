public class Kafsha{
	public String lloj;
	public String emri;
	public int mosha;
	
	
	public Kafsha(String A, String O, int U){
		lloj = A;
		emri = O;
		mosha = U;
	}
	
	public String getLloj(){
		return lloj;
	}
	public void setEmri(String K){
		emri = K;
	}
	public void setMosha(int U){
		mosha = U;
	}
	
	
		public String getEmri(){
			return emri;
		}
		public int getMosha(){
			return mosha;
		}
		
		
		
		public String toString(){
			return lloj+" - "+emri+" ka moshen "+mosha;

		}
		
		public boolean equals(Object obj){
			if(obj instanceof Kafsha){
			Kafsha Ali = (Kafsha) obj;
			
			if(Ali.getEmri().equals(emri) && Ali.getLloj().equals(lloj) && Ali.getMosha() == mosha){
				return true;
			}
			
			}
			return false;
		}
}