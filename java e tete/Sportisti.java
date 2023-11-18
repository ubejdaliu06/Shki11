public class Sportisti{
	
	private int id;
	public String emri;
	public int mosha;
	public String gjinia;
	
	public  Sportisti(int A, String U, int K , String KS){
		id = A;
		emri = U;
		mosha = K;
		gjinia = KS;
	}
	
	public int getId (){
		return id;
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
			
				public void setGjinia(String AL){
				gjinia = AL;
			}
				public String getGjinia(){
					return gjinia;
				}
				
				@Override
				public String toString(){
					return id+":"+emri+"/"+gjinia+" "+mosha;
				}
				public boolean equals(Object obj){
					if(obj instanceof Sportisti){
					Sportisti G1 = (Sportisti) obj;
					
					if(this.getId() == G1.getId()){
						return true;
						
					}
			}
				
				
				return false;
			}
		
		public static void main(String[]args){
			Sportisti A1 = new Sportisti(1000,"Blerim Zylfiu",20,"M");
			Sportisti A2 = new Sportisti(1001,"Lavdim ",21,"M");
			Sportisti A3 = new Sportisti(1000,"mia",19,"F");
			
			
		
			
			System.out.println(A1.toString());
			System.out.println(A2.toString());
			System.out.println(A3.toString());
			
			System.out.println("-------------------------------------------------------------");
			System.out.println(" Testimi : Dy sportistë janë të njëjtë nëse kanë id dhe moshën e njëjtë.");
			System.out.println("Sportisit i par me te dyten:"+A1.equals(A2));
			System.out.println("Sportisit i par me te treten:"+A1.equals(A3));
			
			
			
			
			
			
		
			
			
		}
	
	
	
}