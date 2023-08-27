public class Erzeuger extends Thread
{
    private Liste list;
    private int anzahlErzeugt = 0;
    public Erzeuger(Liste cue){
        list = cue;
    }

    public void run()
    {
        // erzeugt 100 Patienten
        for (int i = 0; i < 30; i++){
            erzeugen();
        }
        System.out.println("**** erzeugte Anzahl: " + anzahlErzeugt);
    }

    public void erzeugen()
    {
        Patient pati = new Patient();
        try {
            Thread.sleep((int) (Math.random()*100));
            }
        catch(Exception ex) {}
        // System.out.println("+++ Erzeugt!");
        list.einfuegenHinten(pati);
        anzahlErzeugt++;
        // System.out.println("+++ und in die Warteschlange eingefügt");
        System.out.println(list.listeGet());
        //System.out.println("Länge: " + ws.laenge());
    }
}