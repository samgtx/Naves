package Nave;

public class Nave {
    //Atributos
    private int id = 0;
    private Piloto piloto;
    private int combustible, numImpacto;
    private boolean destruida = false;

    //Constructor
    public Nave(int id, Piloto piloto) {
        this.id = id;
        combustible = 20;
        numImpacto = 0;
        destruida = false;
        this.piloto = piloto;
    }

    //Metodo de avanze 1
    public void metodo1(){
        lluviaMeteoritos();
        gastoCombustible();
        piloto.setNumBases(piloto.getNumBases()+1);
    }

    //Metodo 2 de reparación
    public void metodo2(){
        for (int i = 0; i < 2; i++) {
            gastoCombustible();
        }
        repararImpactos();
    }

    //Metodo 3 de avance
    public void metodo3(){
        for (int i = 0; i < 2; i++) {
            lluviaMeteoritos();
            gastoCombustible();
        }
        int x = (int) ((Math.random()*3)+1);
        piloto.setNumBases(piloto.getNumBases()+x);
    }
    //Metodo para calcular los impactos de la lluvia de meteoritas
    public void lluviaMeteoritos(){
        if (!destruida){
            int x = (int) (Math.random()*4);
            setNumImpacto(getNumImpacto()+x);
        }
    }
    //Metodo para restar el combustible gastado
    public void gastoCombustible(){
        if (!destruida){
            setCombustible(getCombustible()-1);
        }
    }
    //Metodo para reparar los impactos de la nave
    public void repararImpactos(){
        if (!destruida&&getNumImpacto()>1){
            setNumImpacto(getNumImpacto()-2);
        } else if (!destruida&&getNumImpacto()==1) {
            setNumImpacto(getNumImpacto()-1);
        }
    }
    //Metodo para devolver los valores de la nave, y la base en la que está el piloto
    public String info(){
        return "La nave con id "+id+", tiene "+getCombustible()+"kL, tiene esta cantidad de impactos "+getNumImpacto()+"\n" +
                "Base: "+piloto.getNumBases();
    }
    //Getters

    public int getId() {
        return id;
    }

    public int getCombustible() {
        return combustible;
    }


    public int getNumImpacto() {
        return numImpacto;
    }

    public boolean isDestruida() {
        destruida = getNumImpacto() >= 5 || getCombustible() <= 0;
        return destruida;
    }

    //Setters

    protected void setId(int id) {
        this.id = id;
    }
    protected void setCombustible(int combustible) {
        this.combustible = combustible;
    }


    protected void setNumImpacto(int numImpacto) {
        this.numImpacto = numImpacto;
    }


    protected void setDestruida(boolean destruida) {
        this.destruida = destruida;
    }
}
