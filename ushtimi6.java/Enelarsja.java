public class Enelarsja extends PaisjaElektrike {
    private int nrProgrameve;
    public Enelarsja(int nrSerik,String prodhuesi,double voltazha,char kategoriaShpenzuese,int nrProgrameve){
super(nrSerik,prodhuesi,voltazha,kategoriaShpenzuese);
    this.nrProgrameve=nrProgrameve;
    }

    public int getNrProgrameve() {
        return nrProgrameve;
    }

    public void setNrProgrameve(int nrProgrameve) {
        this.nrProgrameve = nrProgrameve;
    }
  public String toString(){
  return "Enelarsja me"+nrProgrameve+"programe"+super.toString();
  }
    public boolean kaBateri(){
    return false;
    }
    
}
