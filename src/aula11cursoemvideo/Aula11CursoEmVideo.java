/* herança em java
  usa uma classe Mae, que pode ter filhos e esses fihos podem ter filhos

a class principal, pode ter varias classes, e essas classes ter outras classes, 
mas a ( classe final)  "folha" não pode mais ter classes
*/
package aula11cursoemvideo;

public class Aula11CursoEmVideo {

    public static void main(String[] args) {
    /*  
       Pessoa p = new Pessoa();//<< dá erro por que é uma classe abstrata
       
    */
    
    
       //>> CRIA OBJETO VISITANTE " v "
       //>>>  apesar de nao ter atributos recebe tudo da classe pessoa <<<<
       Visitante v = new Visitante();
    
       
       // CRIA OBJETO ALUNO " a "
       Aluno a = new Aluno();
       
       // CRIA OBJETO BOLSISTA " b "
       Bolsista b = new Bolsista();
       
       // CRIA OBJETO PROFESSOR
       Professor pro = new Professor();
       
       //CRIA OBJETO TECNICO
       Tecnico t = new Tecnico();
       
       
       
       // inserindo dados do VISITANTE
        v.setNome("Giovani");
        v.setIdade(38);
        v.setSexo("Masculino");

        System.out.println("Visitante: "+v.toString());
        
        // inserindo dados do ALUNO
        a.setNome("Guilherme");
        a.setIdade(12);
        a.setSexo("Masculino");
        a.setCurso("Informática");
        a.setMatricula(01);

        System.out.println("Aluno : "+a.toString());

        
        
      // inserindo dados do BOLSISTA
        b.setNome("Getúlio");
        b.setIdade(52);
        b.setSexo("Masculino");
        b.setCurso("Português");
        b.setBolsa(100);
        b.setMatricula(02);

        System.out.println("Bolsista : "+b.toString());
        
        
        //inserir dados do Professor
        pro.setNome("Gilberto");
        pro.setIdade(52);
        pro.setSexo("Masculino");
        pro.setEspecialidade("Informática");
        pro.setSalario(5000f);

        System.out.println("Professor : "+pro.toString());
        
        
        // inserir dados do Tecnico
        t.setNome("Maria");
        t.setIdade(40);
        t.setSexo("Feminino");
        t.setCurso("Informática");
        t.setRegistroProfisional(171);
        t.setRegistroProfisional(0123);

        System.out.println("Tecnico : "+t.toString());
        
      
        
        
        
    }
    
}//<<< fim class
