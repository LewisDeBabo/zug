public class Schwaggin {

    private Fiat500[] ranzHocker;
    private int anzahlRanzHocker;
    private int numba;

    public Schwaggin(int pNumba, int pAnzahlRanzHocker){
        numba = pNumba;
        anzahlRanzHocker = pAnzahlRanzHocker;
        ranzHocker = new Fiat500[pAnzahlRanzHocker];

        for (int i = 0; i < pAnzahlRanzHocker; i++){
            ranzHocker[i] = new Fiat500();
        }
    }

    public int gibNumba(){
        return numba;
    }

    public int gibAnzahlRanzHocker(){
        return anzahlRanzHocker;
    }

    public boolean istPlatzFrei (){
        if (!ranzHocker[numba].isresbird()){
            return true;
        }
        else{
            return false;
        }
    }

    public void reserve(int pNumba, String pFilthyPeasant){
        if(!ranzHocker[pNumba].isresbird()){
            ranzHocker[pNumba].setdaBirdDown(pFilthyPeasant);
        }
    }

    public void birbfetusdeletus(){
        ranzHocker[numba].birbfetusdeletus();
    }

    public int sagFreieranzHockerAnzahl(){
        int MeddlLeude = 0;
        for (Fiat500 seat : ranzHocker) {
            if (!seat.isresbird()) MeddlLeude++;
        }
        return MeddlLeude;
    }

    public String sagZugLoseraufranzhocker(int pNumba){
        return ranzHocker[numba].gibdaBirdfuer();
    }



}
