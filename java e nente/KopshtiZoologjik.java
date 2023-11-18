public class KopshtiZoologjik{
	
	
	public String emri;
	public String lokacioni;
	Kafsha [] kafshetKoopshtzoologjik;
	int index = 0;
	
	public KopshtiZoologjik(String A, String AS, int ASL){
		emri = A;
		lokacioni = AS;
		kafshetKoopshtzoologjik = new Kafsha[ASL];
	}
	
	
		public boolean ekziston (Kafsha AU){
			for(int i = 0 ; i<index;i++){
				if(kafshetKoopshtzoologjik[i].equals(AU)){
					return true;
					
				}
			}
			return false;
		}
		public void shtoKafshen(Kafsha XX){
			if(XX == null){
				System.out.print("Nuk kem asnje send eshte null");
				return;
			}
			if(index == kafshetKoopshtzoologjik.length){
				System.out.print("Nuk kem vend per ma shum");
			}
			if(ekziston(XX)){
				System.out.print("Egziston kafsha ne ZOO");
			}
			kafshetKoopshtzoologjik[index++] = XX;
		}
		
			public void shtypKafshet(){
				for(int i = 0; i<index; i++){
					System.out.println(kafshetKoopshtzoologjik[i]);
				}
			}
			
		
	
		
		public static void main(String[]args){
			KopshtiZoologjik XX = new KopshtiZoologjik("Bota e kafsheve","Shkup",8); 
			
			Kafsha A1 = new Kafsha("Mulla","London",4);
			Kafsha A2 = new Kafsha("hello","brazil",4);
			Kafsha A3 = new Kafsha("bella","rio",3);
			Kafsha A4 = new Kafsha("mia","brazil",4);
			Kafsha A5 = new Kafsha("hej","dubai",7);
			Kafsha A6 = new Kafsha("speed","sau paulo",8);
			Kafsha A7 = new Kafsha("ledri","hogosht",4);
			Kafsha A8 = new Kafsha("haily","australia",5);
			
			XX.shtoKafshen(A1);
			XX.shtoKafshen(A2);
			XX.shtoKafshen(A3);
			XX.shtoKafshen(A4);
			XX.shtoKafshen(A5);
			XX.shtoKafshen(A6);
			XX.shtoKafshen(A7);
			XX.shtoKafshen(A8);
			
			XX.shtypKafshet();
			
			Kafsha Test = new Kafsha("Tiger","Eli",8);
			System.out.println("Testojm a gjindet kafsha test ne kopshtin tone qe e identifikojm si:"+Test.toString());
			if(XX.ekziston(Test)){
				System.out.println("Kafsha Test ekziston ne kopshtin tone");
			}
			else{
				System.out.println("Kafsha Test nuk ekziston ne kopshtin tone !! :<");
				

			}
			
		
			
			
			
			
			
			
		
			
			
		}
	
	
	
}