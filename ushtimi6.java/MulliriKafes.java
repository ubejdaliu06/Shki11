public class MulliriKafes extends Paisja {
private String materiali;
public MulliriKafes(int nrSerik,String prodhuesi,String materiali){
    super(nrSerik,prodhuesi);
this.materiali=materiali;
}

    public String getMateriali() {
        return materiali;
    }