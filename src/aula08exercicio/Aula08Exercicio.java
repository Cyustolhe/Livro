/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08exercicio;

/**
 *
 * @author anderson
 */
public class Aula08Exercicio {

    
    public static void main(String[] args) {
        Livros livro1 = new Livros();
        Livros livro2 = new Livros();
        
        livro1.nome = "Livro 1";
        livro1.descricao = "Bla bla bla!";
        livro1.isbn = "82374923874923749238";
        livro1.valor = 2.34;
        livro1.autor.setNomeAutor("Cristiano");
        livro1.autor.setEmailAutor("asdkfasdfj@gmail.com");
        livro1.autor.setCpfAutor("934923482394823");
        
        livro2.nome = "Livro 2";
        livro2.descricao = "Bla bla bla!";
        livro2.isbn = "82374923874923749238";
        livro2.valor = 3.40;
        livro2.autor.setNomeAutor("Anderson"); //mudar tudo pq agora os atributos estao encapsulados
        livro2.autor.setEmailAutor("asdkfasdfj@gmail.com");
        livro2.autor.setCpfAutor("934923482394823");
        
        
        float reajuste = 3;
        if(reajuste <= 0.3){
        livro1.livroReajustar(3);
    }else{
        System.out.println("Valor de reajuste: ");
         }     
        
        livro1.mostrarInformacoes();
        livro2.mostrarInformacoes();
        
        livro1.livroReajustar(reajuste);
        livro2.livroReajustar(reajuste);
        
        livro1.mostrarInformacoes();
        livro2.mostrarInformacoes();

    }

}
