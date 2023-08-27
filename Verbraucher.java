
public class Verbraucher extends Thread
{
    private Liste list;
    private int anzahlVerbraucht = 0;
    public Verbraucher(Liste cue)
    {
        list = cue;
    }

    public void run(){
        for (int i = 0; i < 30; i++){
            verbrauchen();
            try{
                Thread.sleep((int) (Math.random()*80));
            }
            catch(Exception ex){}
        }
        System.out.println("**** Verbraucht: " + anzahlVerbraucht); 
    }

    public void verbrauchen()
    {
        Datenelement dati = list.entfernenVorne();
        if (dati != null){
            // System.out.println("*** Entnehme!");
            System.out.println(list.listeGet());
            anzahlVerbraucht++;
        }
        else {
            System.out.println("*** Liste ist leer!");
        }
    }

}