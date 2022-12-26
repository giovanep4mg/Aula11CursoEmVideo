
package aula11cursoemvideo;

public class Tecnico extends Aluno{
    
    // atributos 
    private int registroProfisional;
    
    
    
    
    // metodo
    public void praticar(){
        System.out.println("O tecnico "+this.getNome()+" está praticando..");
    
    }
    
    
    
    //metodos especiais

    public int getRegistroProfisional() {
        return registroProfisional;
    }

    public void setRegistroProfisional(int registroProfisional) {
        this.registroProfisional = registroProfisional;
    }
    
    
}
