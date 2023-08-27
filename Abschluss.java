public class Abschluss extends Listenelement{
      
     
    
    public Abschluss(){
    }
      
     
     
     
     
    
    public Listenelement nachfolgerGet(){
        return null;
    }
     
    public Datenelement datenelementGet(){
        return null;
    }
      
     
     
     
     
    public String namenGet(){
        return "";
    }
    
    public int laenge(){
        return 0;
    }

    public boolean istenthalten(String s){
        return false;
    }
     
     
     
    
    public Datenelement suchen(String s){
        return null;
    }
     
     
    
     
    public Listenelement einfuegenHinten(Datenelement neuDat){
        Knoten neuerKnoten = new Knoten(neuDat);
        neuerKnoten.nachfolgerSet(this);
        return neuerKnoten;
    }

     
    
    public Datenelement entfernenVorne(){
        return null;
    }
      
     
     
    
    public Listenelement entfernenHinten(Datenelement d){
        return null;
    } 


     
     
     
     
    
    public Datenelement letzteDatenGet(Datenelement dat){
        return dat;
    }
}