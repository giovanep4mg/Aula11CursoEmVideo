
package aula11cursoemvideo;

public class Aluno extends Pessoa{
    
    // atributos 
    private int matricula;
    private String curso;
    
    
    // metodo
    public void pagarMensalidade(){
        
        System.out.println("Pagando mesalidade de aluno ");
    
    
    }

    
    // metodos especiais 
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
   
}//<< fim class
