
package testarfuncionario;

public class Gerente extends Funcionario{
    
    private static int contador = 0;
    
    public static void contador(){
        contador++;
    }   
    
    public Gerente(){
        super();
        contador();
    }       
        
    @Override
    public void fazerMenu() {
        super.fazerMenu(); 
    }

    @Override
    public void informaCadastro() {
        super.informaCadastro(); 
    }
       
    @Override
    public void informaDados(){
        
        System.out.println("\n    > DADOS DE " + getNome() + " < ");
        
        System.out.println("Nome Completo -> " + getNome());
        System.out.println("CPF -> " + getCpf());
        System.out.println("Idade -> " + getIdade());
        System.out.println("RG -> " + getRg());          
        System.out.println("ID Gerente: " + contador);
            
    }
    
    public float ReajusteGerente(float salario){        
        
        System.out.println("Seu salário atual é de " + salario);
        
        float novosalario = salario + salario*70/100;    
        
        System.out.println("O seu novo salário, com reajuste de 70% é: " + novosalario);
        
        return novosalario;                
    }    
}
