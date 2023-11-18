public class MP3Player extends PaisjaElektrike{
private int memoria;
public MP3Player(int nrSerik,String prodhuesi,double voltazha,char kategoriaShpenzuese,int memoria){
super(nrSerik,prodhuesi,voltazha,kategoriaShpenzuese);
    this.memoria=memoria;

}
public boolean kaBateri(){
    return true;
}

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
public String toString(){
return"MP3Player"+super.toString()+":"+memoria+"GB";
}



}
