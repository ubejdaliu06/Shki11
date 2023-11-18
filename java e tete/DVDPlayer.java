public class DVDPlayer{
	
	private int nrSerik;
	public String marka;
	public boolean eshteHD;
	
	public  DVDPlayer(int A, String U, boolean K){
		nrSerik = A;
		marka = U;
		eshteHD = K;
		
	}
	
	public int getnrSerik (){
		return nrSerik;
	}
	
		public void setMarka(String AU){
			marka = AU;
		}
		public String getMarka(){
			return marka;
		}
		
			public void setEshteHD(boolean Als){
				eshteHD = Als;
			}
			public boolean getEshteHD(){
					return eshteHD;
				}
			@Override
			public String toString(){
				return nrSerik+":"+marka+"-"+(eshteHD == true ? "eshteHD" : "nuk eshte HD");
			}
			public boolean equals(Object obj){
				if(obj instanceof DVDPlayer){
				DVDPlayer G1 = (DVDPlayer) obj;
				
				if(G1.getnrSerik() == this.getnrSerik()){
					return true;
					
				}
			}
				// if(obj instanceof DVDPlayer);
				
				return false;
			}
		
		public static void main(String[]args){
			DVDPlayer A1 = new DVDPlayer(1010,"APPLE",true);
			DVDPlayer A2 = new DVDPlayer(1010,"apple",false);
			DVDPlayer A3 = new DVDPlayer(1102,"Microsoft",true);
			
		
			
			System.out.println(A1.toString());
			System.out.println(A2.toString());
			System.out.println(A3.toString());
			
			System.out.println("-------------------------------------------------------------");
			System.out.println(" Testimi i Dy DVD Player janë të njejtë nëse kanë numrin serik të njejtë.");
			System.out.println("DVDPlayer i pari me te dyten:"+A1.equals(A2));
			System.out.println("DVDPlayer i dyti me te treten:"+A2.equals(A3));
			
			if(A1.equals(A2)){
				System.out.print("");
			}
			else{
				System.out.println("");
			}
		
			
			
		}
	
	
	
}