
package exercicios_aulaandersonacessovip;


public class Ingresso {
    
    protected double ingresso;

 public Ingresso(double ingresso){
    this.ingresso = ingresso;
    }    

    public double getIngresso() {
        return ingresso;
    }

    public void setIngresso(double ingresso) {
        this.ingresso = ingresso;
    }
   
    public void imprimeValor(){
        System.out.println("Valor do ingresso: "+ingresso);
    
    }
    
    
    
}
