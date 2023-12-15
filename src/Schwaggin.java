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





}
