
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Usuario {
    
    //  DECLARAR ATRIBUTOS DA CLASSE USUARIO   
    private String nome;
    private String email;
    private int idade;
    private String endereco;

    // CONSTRUTOR DA CLASSE USUARIO
    // INICIALIZAÇÃO DOS VALORES DOS ATRIBUTOS
    public Usuario() {
        this ("","",0,"");
    }

    public Usuario(String nome, String email, int idade, String endereco) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    // ENCAPSULAMENTO DOS ATRIBUTOS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    //  MÉTODOS DA CLASSE USUARIO
    public void guardarDados(){
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do usuário: ");
        setNome(ler.next());
        
        System.out.println("Digite o email do usuário: ");
        setEmail(ler.next());
        
        System.out.println("Digite o endereço do usuário: ");
        setEndereco(ler.next());
                
        System.out.println("Digite a idade do usuário: ");
        setIdade(ler.nextInt());
    }
    
    public void mostrarDados(){
        System.out.println("\n Dados do usuário \nNome: "+ getNome()+ "\n"+
        "Email: "+ getEmail()+ "\n"+ 
        "Idade: "+ getIdade()+ "\n"+
        "Endereço: " + getEndereco());
    }
}
