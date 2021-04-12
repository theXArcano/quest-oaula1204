
package exercicios_aulaandersonacessovip;


public class VIP extends Ingresso{
    private double valorad; 
   
    public VIP (double valorad,double ingresso){
    super(ingresso);
    this.valorad = valorad;
    }
   

    @Override
    public void imprimeValor(){
    System.out.println("Valor do ingresso: "+(valorad + ingresso));
}
        
}
