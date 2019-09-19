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
class Autor {
    private String nomeAutor;
    private String emailAutor;
    private String cpfAutor;
    
    public void mostrarInformacoes(){
        System.out.println("Nome do Autor: " + this.nomeAutor);
        System.out.println("E-mail Autor: " + this.emailAutor);
        System.out.println("CPF Autor: " + this.cpfAutor + "\n");
        
    }; 

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getEmailAutor() {
        return emailAutor;
    }

    public void setEmailAutor(String emailAutor) {
        this.emailAutor = emailAutor;
    }

    public String getCpfAutor() {
        return cpfAutor;
    }

    public void setCpfAutor(String cpfAutor) {
        this.cpfAutor = cpfAutor;
    }
    
    
     
}
