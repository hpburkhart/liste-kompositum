abstract class Listenelement
{
    abstract public Listenelement nachfolgerGet();

    abstract public String namenGet();

    abstract public Datenelement datenelementGet();

    abstract public Datenelement entfernenVorne();
    
    abstract public Listenelement entfernenHinten(Datenelement d);
    
    abstract public Datenelement letzteDatenGet(Datenelement d);

    abstract public int laenge();

    abstract public boolean istenthalten(String s);

    abstract public Datenelement suchen(String s);

    abstract public Listenelement einfuegenHinten(Datenelement neuDat);
}
