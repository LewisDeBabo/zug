public class Fiat500 {

    private boolean resBird;
    private String resBirdFor;

//Seat
    public Fiat500(){
        resBird = false;
        resBirdFor = null;
    }
//istReserviert
    public boolean isresbird(){
        return resBird;
    }
//gibReserviertFür
    public String gibdaBirdfuer(){
        return resBirdFor;
    }
//reservierungEintragen
    public void setdaBirdDown(String pFilthyPeasant){
        if (!resBird){
            resBird = true;
            resBirdFor = pFilthyPeasant;
        }
    }
//löscheReservierung
    public void birbfetusdeletus(){
        resBird = false;
        resBirdFor = null;
    }







}
