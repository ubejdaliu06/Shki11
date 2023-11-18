public class Banesa{
	public int id;
	public int nrKateve;
	public String ngjyra;
	public String stiliArkitektonik;
	public int vitiNdertimit;
	
	public Banesa(int A, int O, String U,String I,int L){
		id = A;
		nrKateve = O;
		ngjyra = U;
		stiliArkitektonik = I;
		vitiNdertimit = L;
	}
	
	public int getId(){
		return id;
	}
	public void setNrKateve(int K){
		nrKateve = K;
	}
	public void setNgjyra(String U){
		ngjyra = U;
	}
	public void setStiliArkitektonik(String P){
		stiliArkitektonik = P;
	}
	public void setVitiNdertimit(int Z){
		vitiNdertimit = Z;
	}
	
	
		public int getNrKateve(){
			return nrKateve;
		}
		public String getNgjyrave(){
			return ngjyra;
		}	
		public String getStiliArkitektonik(){
			return stiliArkitektonik;
		}	
		public int getVitiNdertimit(){
			return vitiNdertimit;
		}
		
		
		
		public String toString(){
			return "Banes "+ngjyra+" - "+id+" e ndertuar ne vitin "+vitiNdertimit+" ka "+nrKateve+" kate dhe stil arkitektonik "+stiliArkitektonik;

		}
		
		public boolean equals(Object obj){
			if(obj instanceof Banesa){
			Banesa hood = (Banesa) obj;
			
			if(hood.getId() == id && hood.getVitiNdertimit() == vitiNdertimit){
				return true;
			}
			
			}
			return false;
		}
}