public class Kafsha{
	
	private String lloji;
	public String emri;
	public int mosha;

	
	public Kafsha(String A, String U, int K){
		lloji = A;
		emri = U;
		mosha = K;
		
	}
	
	public String getLloj(){
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
					return lloji+":"+emri+" "+mosha;
				}
				public boolean equals(Object obj){
					if (obj instanceof Kafsha){
					Kafsha G1 = (Kafsha) obj;
					
					if(this.getEmri().equalsIgnoreCase(G1.getEmri()) || this.getLloj().equalsIgnoreCase(G1.getLloj())){
						if(this.getMosha() == G1.getMosha()){
						return true;
						}
					}	
			}
				
				
				return false;
			}
		
		public static void main(String[]args){
			Kafsha A1 = new Kafsha("Gjiraf","Jasha",5);
			Kafsha A2 = new Kafsha("Tiger","Lata",6);
			Kafsha A3 = new Kafsha("Leopard","hamer",3);
			Kafsha A4 = new Kafsha("Tiger","Lata",6);
			
			
		
			
			System.out.println(A1.toString());
			System.out.println(A2.toString());
			System.out.println(A3.toString());
			System.out.println(A4.toString());
			
			System.out.println("-------------------------------------------------------------");
			System.out.println(" Testimi i Dy kafshë janë të njëjta nëse kanë lloj, emër dhe moshë të njëjtë..");
			System.out.println("Kafsha e par me te dyten:"+A1.equals(A2));
			System.out.println("Kafsha e par me te treten:"+A1.equals(A3));
			System.out.println("Kafsha e dyta me te kater:"+A2.equals(A4));
			System.out.println("Kafsha e katert me te paren:"+A4.equals(A1));
			
			
			
			
			
			
			
			
		
			
			
		}
	
	
	
}