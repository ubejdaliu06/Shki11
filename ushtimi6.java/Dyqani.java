public class Dyqani {
    private String emri;
    private Paisja [] paisjet;
    private int index=0;
    private static int nrs;
    public Dyqani(String emri){
        this.emri=emri;
    }
    
    
private class Turiela extends Paisja{
private int gjatesia;
public Turiela(int nrSerik,String prodhuesi,int gjatesia){
super(nrSerik,prodhuesi);
this.gjatesia=gjatesia;
}
public int getGjatesia(){
return gjatesia;
}
public void setGjatesia(int gjatesia){
this.gjatesia=gjatesia;
}
public String toString(){
return "Turiela"+super.toString()+"me shpim"+gjatesia+"m";
}
}

public static class TV extends PaisjaElektrike{
private boolean eshteHd;
public TV(int nrSerik,String prodhuesi,double voltazha,char kategoriaShpenzuese,boolean eshteHd){
super(nrSerik,prodhuesi,voltazha,kategoriaShpenzuese);
  this.eshteHd=eshteHd;
}

        public boolean getEshteHd(){
            return eshteHd;
        }

        public void setEshteHd(boolean eshteHd) {
            this.eshteHd = eshteHd;
        }

public boolean kaBateri(){
    return false;
}
public String toString(){
return"TV"+(eshteHd==true?" ":"jo")+"HD"+";"+super.toString();
        }
    }
static{
nrs=25;
}

{
paisjet=new Paisja[nrs];
Dyqani.TV T=new Dyqani.TV(11111,"Beko",22.5,'A',true);
        shtoPaisjen(T);
}
public void printAll(){
for(int i=0;i<index;i++){
    System.out.println(paisjet[i]);
}
}

public void shtoPaisjen(Paisja p){
for(int i=0;i<index;i++){
if(paisjet[i].equals(p)){
System.out.println("Paisja egziston ne varg"+p);
return;
}
    }
if(index==paisjet.length){
System.out.println("Nuk ka vend ne varg"+p);
return;
}
paisjet[index++]=p;
}
public void shtypHd(boolean kushti){
for(int i=0;i<index;i++){
    if(paisjet[i] instanceof TV){
       TV t=(TV)paisjet[i]; 
    if(t.getEshteHd()==kushti){
    System.out.println(t.toString());
    }   
    }
}
}

public Turiela [] turielaGjatesia(int kushti){
 int count=0;
for(int i=0;i<index;i++){
    if(paisjet[i]instanceof Turiela){
        Turiela t=(Turiela)paisjet[i];
     if(t.getGjatesia()==kushti){
     count++;
     }
    }
}
int pozita=0;
Turiela [] rez=new Turiela[count];

for(int i=0;i<index;i++){
    if(paisjet[i]instanceof Turiela){
        Turiela t=(Turiela)paisjet[i];
     if(t.getGjatesia()==kushti){
     rez[pozita++]=t;
     }
    }
}
return rez;
} 

public static void main(String[]args){
Dyqani d=new Dyqani("ETC");
Enelarsja e1=new Enelarsja(112222,"Beko",22.2,'A',2);
Enelarsja e2=new Enelarsja(112233,"Samsung",22.4,'C',4);
Enelarsja e3=new Enelarsja(112244,"Alfa",22.8,'B',1);


MP3Player m1=new MP3Player(111111,"LG",22.2,'D',24);
MP3Player m2=new MP3Player(112222,"Aqua",21.0,'A',16);
MP3Player m3=new MP3Player(113333,"Iphone",18.9,'B',32);


MulliriKafes mK1=new MulliriKafes(111222,"Alfa","Qelik");
MulliriKafes mK2=new MulliriKafes(111444,"Beko","Alumin");
MulliriKafes mK3=new MulliriKafes(111666,"Samsung","Inox");

Paisja t1=d.new Turiela(111111,"Samsung",23);
Paisja t2=d.new Turiela(111222,"Beko",17);
Dyqani.TV tv1=new Dyqani.TV(11111222,"Alfa",22.2,'A',true);

d.shtoPaisjen(e1);
d.shtoPaisjen(e2);
d.shtoPaisjen(e3);
d.shtoPaisjen(m1);
d.shtoPaisjen(m2);   
d.shtoPaisjen(m3);      
d.shtoPaisjen(mK1);
d.shtoPaisjen(mK2);
d.shtoPaisjen(mK3);
d.shtoPaisjen(t1);
d.shtoPaisjen(t2);
d.shtoPaisjen(tv1);

d.printAll();
System.out.println("---------");
d.shtypHd(true);
System.out.println("---------");
Turiela [] rez1=(d.turielaGjatesia(23));
for(int i=0;i<rez1.length;i++){
    System.out.println(rez1[i]);
}
}
}