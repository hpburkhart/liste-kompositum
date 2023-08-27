class Knoten extends Listenelement{
    private Listenelement nachfolger;
    private Datenelement dat;

    public Knoten(Datenelement d) {
        this.dat = d;
    }

    public void nachfolgerSet(Listenelement k){
        nachfolger = k;
    }

    public Listenelement nachfolgerGet(){
        return nachfolger;
    }

    public Datenelement datenelementGet(){
        return dat;
    }

    public String informationGet(){
        return dat.informationGet();
    }

    public String namenGet(){
        return dat.informationGet() + " " + nachfolger.namenGet();
    }

    public int laenge(){
        return nachfolger.laenge()+1;
    }

    public boolean istenthalten(String s){
        if (dat.informationGet().equals(s)){
            return true;} 
        else{
            return nachfolger.istenthalten(s);}
    }

    public Datenelement suchen(String s){
        if (dat.informationGet().equals(s)){
            return dat;} 
        else{
            return nachfolger.suchen(s);}
    }

    public Listenelement einfuegenHinten(Datenelement neuDat){
        Listenelement le= nachfolger.einfuegenHinten(neuDat);
        nachfolgerSet(le);
        return this;
    }

    
    
    public Datenelement entfernenVorne(){
        Datenelement d = datenelementGet();
        return d;
    }

    
    
    public Listenelement entfernenHinten(Datenelement d){
        if (dat == d) {
            return nachfolger;} 
        else {
            nachfolger = nachfolger.entfernenHinten(d);
            return this;}
    }

    
    
    public Datenelement letzteDatenGet(Datenelement d){
        return nachfolger.letzteDatenGet(dat);
    }
}