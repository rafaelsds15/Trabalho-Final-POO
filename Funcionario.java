
package testarfuncionario;
import java.util.Scanner;

public abstract class Funcionario{     
    
    Scanner ler = new Scanner(System.in);
    
    private String nome; 
    private int idade;
    private int rg;
    private int cpf;
    private float salario;
    
    
    public Funcionario(){
        this.nome = "";
        this.idade = 0;
        this.rg = 0;
        this.cpf = 0;
        this.salario = 0;
    }           
    
    public void fazerMenu(){               
        
        System.out.println("    1 - Cadastro e Dados informados  ");
        System.out.println("    2 - Salário  ");          
        System.out.println("    3 - Sair    ");
               
    } 
    
    public void informaCadastro(){
        
        System.out.println("\n    > CADASTRO < ");       
        
        System.out.println("\n   > Nome Completo: ");
        nome = ler.nextLine();
        setNome(nome);           
        System.out.println("\n   > Idade: ");
        idade = ler.nextInt();
        setIdade(idade);              
        System.out.println("   > RG: ");
        rg = ler.nextInt();
        setRg(rg);
        System.out.println("   > CPF: ");
        cpf = ler.nextInt();    
        setCpf(cpf);
        System.out.println("    > Salário: ");
        salario = ler.nextFloat();
        setSalario(salario);
             
    }
    
    public abstract void informaDados();    
           
    public void Testarsenha(){
        int senha;
        int valSenha;
        
        try {
        System.out.println("Digite uma senha somente com números: ");
        senha = ler.nextInt();
        System.out.println("Confirme sua senha: ");
        valSenha = ler.nextInt();
        
        if (senha != valSenha){
            System.out.println("Senha Incorreta!");
            
        } else {
            System.out.println("Senha cadastrada com sucesso!");
        }
        } catch (java.util.InputMismatchException exception){
            System.out.println("Letras não podem!");
        }
        System.out.println("Retornando ao cadastro...\n");
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String Nome) {
        nome = Nome;
    }   
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getRg() {
        return rg;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
       
}
