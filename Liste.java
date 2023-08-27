class Liste {
    private Listenelement anfang;

    public Liste() {
        anfang = new Abschluss();
    }
    
    public void informationGet(){
        System.out.println("Liste, einfach verkettet");
    }

    public String listeGet(){
        return anfang.namenGet();
    }

    public int laenge(){
        return anfang.laenge();
    }
    
    public boolean istenthalten(String s){
        return anfang.istenthalten(s);
    }

    public Datenelement suchen(String s){
        return anfang.suchen(s);
    }
     
    public void einfuegenHinten(Datenelement neuDat){
        anfang.einfuegenHinten(neuDat);     
    }

     
    
    public Datenelement entfernenVorne(){
        Datenelement e = anfang.datenelementGet();
        Listenelement n = anfang.nachfolgerGet(); 
        if (n != null) {
            anfang = n;
        };
        return e;
    }
      
    

    public void einfuegenVorne(Datenelement neuDat){
        Knoten neuerKnoten = new Knoten(neuDat);
        neuerKnoten.nachfolgerSet(anfang);
        anfang = neuerKnoten;
    }
     
     
    
    public Datenelement entfernenHinten(){
        Datenelement letzteDat = anfang.letzteDatenGet(null);
        anfang.entfernenHinten(letzteDat);
        return letzteDat;
    }
     
     
    
    public Datenelement letzteDatenGet(Datenelement d){
        return anfang.letzteDatenGet(null);
    }

}
