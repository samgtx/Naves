package Nave;

public class Piloto {
    //Atributos
    private int id = 1;
    private static int idA = 1;
    private Nave nave;
    private int numBases = 0;

    //Constructor
    public Piloto() {
        this.id=idA;
        idA++;
        nave = new Nave(id,this);
    }


    //Getters
    public int getId() {
        return id;
    }

    public int getNumBases() {
        return numBases;
    }

    public Nave getNave() {
        return nave;
    }

    //Setters

    protected void setId(int id) {
        this.id = id;
    }

    protected void setNumBases(int numBases) {
        this.numBases = numBases;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }
}
