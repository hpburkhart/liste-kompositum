class Patient implements Datenelement {
    private String name;
    private int patid;
    private static int id=100;

    public Patient(String n) {
        this.name=n;
    }

    public Patient() {
        this.patid = id;
        this.name = Integer.toString(patid);
        id++;
    }

    public String informationGet(){
        return name;
    }
}