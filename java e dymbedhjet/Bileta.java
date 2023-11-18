public class Bileta{
	public int id;
	public String filmi;
	public String ulesja;
	public double cmimi;
	public String orari;
	public boolean kaZbritje;
	
	public Bileta(int A,String B, String C,double K, String Z, boolean G){
		id  = A;
		filmi = B;
		ulesja = C;
		cmimi = K;
		orari = Z;
		kaZbritje = G;
	}
	
	public int getId(){
		return id;
	}
	public void setFilmi(String K){
		filmi = K;
	}
	public void setUlesja(String U){
		ulesja = U;
	}
	public void setCmimi(double newValue){
		cmimi = newValue;
	}
	public void setOrari(String O){
		orari = O;
	}
	public void setKaZbritje(boolean B){
		kaZbritje = B;
	}
		public String getFilmi(){
			return filmi;
		}
		public String getUlesja(){
			
			return ulesja;
		}
		public double getCmimi(){
			if(kaZbritje == true){
				cmimi = cmimi - (cmimi/100*15);
			}
			return cmimi;
		}
		public String getOrari(){
			return orari;
		}
		public boolean getKaZbritje(){
			return kaZbritje;
		}
		
		public String toString(){
			return "Bileta -"+id+" : "+filmi+" ne oren "+orari+" Ulesja: "+ulesja+" Cmimi"+ (kaZbritje?" me "+cmimi :" pa "+cmimi);
		}
		
		public boolean equals(Object obj){
			if(obj instanceof Bileta){
			Bileta A = (Bileta) obj;
			
			if(A.getId() == id && A.getFilmi().equals(filmi) && A.getUlesja().equals(ulesja) && A.getOrari().equals(orari)){
				return true;
			}
			
			}
			return false;
		}
}