public class Vetura{
	
	private int nrTargave;
	public String modeli;
	public int vitiProdhimit;
	
	public  Vetura(int A, String U, int K){
		nrTargave = A;
		modeli = U;
		vitiProdhimit = K;
		
	}
	
	public int getNrTargave (){
		return nrTargave;
	}
	
		public void setModeli(String AU){
			modeli = AU;
		}
		public String getModeli(){
			return modeli;
		}
		
			public void setVitiProdhimit(int Als){
				vitiProdhimit = Als;
			}
			public int getVitiProdhimit(){
				return vitiProdhimit;
			}
				
				@Override
				public String toString(){
					return modeli+"-"+vitiProdhimit+":"+nrTargave;
				}
				public boolean equals(Object obj){
					
					if(obj instanceof Vetura ){
						Vetura G1 = (Vetura) obj;
					if(this.getNrTargave() == G1.getNrTargave()){
						return true;
					}
				
			}
				
				
				return false;
			}
		
		public static void main(String[]args){
			Vetura A1 = new Vetura(6060,"C class",2015);
			Vetura A2 = new Vetura(1010,"Audi A7",2018);
			Vetura A3 = new Vetura(6060,"G-class",2022);
			
		
			
			System.out.println(A1.toString());
			System.out.println(A2.toString());
			System.out.println(A3.toString());
			
			System.out.println("-------------------------------------------------------------");
			System.out.println(" Testimi i Dy vetura janë të njëjta nëse kanë numrin e targave të njëjtë.");
			System.out.println("Vetura par me te treten:"+A1.equals(A3));
			if(A1.equals(A3)){
				System.out.println("Vetura par i ka NrSerik te njejt si Vetura e dyte");
			}
			else{
				System.out.print("Nr Serik jan te ndryshem nga vetura e par me te dyten")
			}
			System.out.println("Vetura dyt  me te paren:"+A2.equals(A1));
			
			
			
			
			
		
			
			
		}
	
	
	
}