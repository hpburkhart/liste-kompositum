class Main {

    public static void main(String [] args){
        //test von Patient
        Patient pata = new Patient("Albert");
        Patient patb = new Patient("Berta");
        Patient patc = new Patient("Carlos");
        Patient patd = new Patient("Doris");
        // System.out.println(pata.informationGet());
        // pata.nachfolgerSet(patb);
        // System.out.println(pata.nachfolgerGet());
        // System.out.println(pata.nachfolgerGet().informationGet());

        //test von Warteschlange
        System.out.println(">>>neu>>>");
        Liste l =new Liste();
        System.out.println(l.listeGet());
        l.entfernenHinten();
        System.out.println(l.listeGet());
        l.einfuegenVorne(pata);
        System.out.println(l.listeGet());
        l.einfuegenVorne(patb);
        System.out.println(l.listeGet());
        l.einfuegenVorne(patc);
        System.out.println(l.listeGet());
        l.einfuegenHinten(patd);
        System.out.println(l.listeGet());
        System.out.println("Entmommen wurde vorne: "+ l.entfernenVorne().informationGet());
        System.out.println(l.listeGet());
        System.out.println("Entmommen wurde hinten: "+ l.entfernenHinten().informationGet());
        System.out.println(l.listeGet());
        if (l.istenthalten("Albert")==true){
            System.out.println("gefunden!");
        }
        else{System.out.println("nicht gefunden!");
        };
        System.out.println(l.istenthalten("Doris"));
        System.out.println(l.suchen("Doris").informationGet());

        //test mit Erzeuger
        // System.out.println("----------------");
        // Warteschlange w =new Warteschlange();
        // Erzeuger erzeuger = new Erzeuger(w);
        // Verbraucher verbraucher = new Verbraucher(w);
        // erzeuger.start();
        //w.istenthalten("110");

        // try {
        // Thread.sleep(4000);
        // }catch(Exception ex){}
        //System.out.println(w.listeGet());
        //verbraucher.start();

        // try {
        // Thread.sleep(11000);
        // }catch(Exception ex){}
        //System.out.println(w.listeGet());
    }
}

