public class Libri
{
	
	private int isbn;
	public String titulli;
	public int vitiPublikimit;
	public boolean eshteFiktiv;
	
	public  Libri(int A, String U, int K , boolean KS){
		isbn = A;
		vitiPublikimit = U;
		vitiPublikimit = K;
		eshteFiktiv = KS;
	}
	
	public int getisbn (){
		return isbn;
	}
	
		public void setTitulli(String AU){
			titulli = AU;
		}
		public String getTitulli(){
			return titulli;
		}
		
			public void setVitiPublikimit(int Als){
				vitiPublikimit = Als;
			}
			public int getVitiPublikimit(){
				return vitiPublikimit;
			}
			
				public void setEshteFiktiv(boolean AL){
				eshteFiktiv = AL;
			}
				public boolean getEshteFiktiv(){
					return eshteFiktiv;
				}
				
				@Override
				public String toString(){
					return isbn+":"+titulli+"-"+vitiPublikimit+"-"+(eshteFiktiv ==true ? "eshteFiktiv":"(nuk)eshteFiktiv");
				}
				public boolean equals(Object obj){
					if(obj instanceof Libri){
					Libri G1 = (Libri) obj;
					
					if(this.getisbn() == G1.getisbn()){
						return true;
						
					}
			}
				
				
				return false;
			}
		
		
		
			
			
		}
	
	
	
