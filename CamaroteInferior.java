
package exercicios_aulaandersonacessovip;


public class CamaroteInferior extends VIP {
    private String localizacao;
    
    public CamaroteInferior(String localizacao,double valorad,double ingresso){
    super(valorad,ingresso);
    this.localizacao = localizacao;
    }

    public String getLocalizacao() {
     return localizacao;
    }
public void imprimeLocal(){
   System.out.println("A localização é: "+ localizacao);
}

}
