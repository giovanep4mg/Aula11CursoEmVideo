
package aula11cursoemvideo;

  public class Professor extends Pessoa{
    
    private String especialidade;
    private float salario;
    
    
    
    //metodo
    public void receberAumento(float aum){
        
        this.salario = salario + aum ;
    
    }

    
    //metodos especiais 
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
