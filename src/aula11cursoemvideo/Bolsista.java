
package aula11cursoemvideo;

 public class Bolsista extends Aluno{
     // atributos
     private int bolsa;
     
     
     // metodo
     public void renovarBolsa(){
         System.out.println("Renovando a bolsa de "+this.getNome());
     
     
     }

     
     // metodos especiais 
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    // METODO
    @Override 
    public void pagarMensalidade(){
    
        System.out.println(this.getNome()+" é bolsista, pagamento facilitado");
    
    } 
     
    
 
 }//<< fim class
