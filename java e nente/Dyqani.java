public class Dyqani{
	
	
	private String emri;
	Pajisja [] emrat;
	int index = 0;
	
	public Dyqani(String A, int X){
		emri = A;
		emrat = new Pajisja[X];
	}
	
	
		public boolean ekziston (Pajisja AX){
			for(int i = 0 ; i<index;i++){
				if(emrat[i].equals(AX)){
					return true;
					
				}
			}
			return false;
		}
		public void shtoPajisjen(Pajisja AU){
			if(AU == null){
				System.out.println("Nuk kemi asgje ne Pajisje !!");
				return;
			}
			if(ekziston(AU)){
				System.out.println("Pajisja ekziston");
				return;
			}
			if(index == emrat.length){
				System.out.print("Ne varg nuk kem vend");
				return;
			}
			
			// nese asnjera ather e shtojm nje pajisje te re ne varg :>
			emrat[index++] = AU;
		}
		
			public void shtypPajisjet(){
				for(int i = 0;i<index;i++){
					System.out.println(emrat[i]);
				}
			}
			
		
	
		
		public static void main(String[]args){
			Dyqani A = new Dyqani("Neptun", 5); 
			
			Pajisja A1 = new Pajisja(10023,"apple",2.2,"A");
			Pajisja A2 = new Pajisja(7023,"Samsung",3.5,"B");
			Pajisja A3 = new Pajisja(70345,"Mi org",3.0,"B");
			Pajisja A4 = new Pajisja(1222,"helaljf",3.25,"B");
			Pajisja A5 = new Pajisja(12344,"okajj",3.45,"E");
			
			A.shtoPajisjen(A1);
			A.shtoPajisjen(A2);
			A.shtoPajisjen(A3);
			A.shtoPajisjen(A4);
			A.shtoPajisjen(A5);
		
			
		Pajisja Test = new Pajisja(1234,"Apple",120,"A");
		if(A.ekziston(Test)){
			System.out.println("Pajisja ekziston");
		}
		else{
			System.out.println("Pajisja nuk ekziston");
		}
			
		System.out.println("Te gjitha pajisjet ne dyqan:");
		A.shtypPajisjet();
			
			
			
			
			
			
		
			
			
		}
	
	
	
}