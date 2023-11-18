public class Kafsha{
	
	public String lloji;
	public String emri;
	public int mosha;
	
	
	public Kafsha(String U, String K , int KS){
		lloji= U;
		emri = K;
		mosha = KS;
		
	}
	
	public String getLloji (){
		return lloji;
	}
	
		public void setEmri(String AU){
			emri = AU;
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
			
			
				
				@Override
				public String toString(){
					return lloji+"-"+emri+" "+mosha;
				}
				public boolean equals(Object obj){
					if(obj instanceof Kafsha){
					Kafsha G1 = (Kafsha) obj;
					
					if((this.getLloji().equalsIgnoreCase(G1.getLloji())) && (this.getMosha() == G1.getMosha()) && (this.getEmri().equalsIgnoreCase(G1.getEmri()))){
						return true;
						
					}
			}
				
				
				return false;
			}
		
		public static void main(String[]args){
			Kafsha A1 = new Kafsha("mu","bela",3);
			Kafsha A2 = new Kafsha("org","ciao",3);
			Kafsha A3 = new Kafsha("bardh","malli",3);
			
			System.out.println(A1.toString());
			System.out.println(A2.toString());
			System.out.println(A3.toString());
			
			Kafsha test =  new Kafsha("mu","bela",3);
			System.out.println("E testojm kafshen :"+test.toString());
			
		if(A2.equals(test)){
			System.out.println("kafsha e 2 eshte e njejt si kafsha test");
		}
		else{
			System.out.println("kafsha e 2 eshte e ndryshme nga kafsha test!!");

		}
			
			
			
			
			
			
		
			
			
		}
	
	
	
}