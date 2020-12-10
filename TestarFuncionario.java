
package testarfuncionario;

import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;

public class TestarFuncionario {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);               
               
        Collection<Gerente> gerente1 = new ArrayList();
        Collection<Vendedor> vendedor1 = new ArrayList();        
        Collection<Faxineiro> faxineiro1 = new ArrayList();
        
        int menu;
                      
            System.out.println("\n      --> Bem-vindo a RSDS COMPANY <--   \n");
            System.out.println("\n    > Informe o seu cargo na empresa RSDS Company <  ");
            System.out.println("\n  1 - Gerente ");
            System.out.println("\n  2 - Vendedor ");
            System.out.println("\n  3 - Faxineiro ");
            int op;
            op = ler.nextInt();
            
            do {  
                
            switch(op){
                
                case 1:                   
                    do {
                        
                    System.out.println("\n\n       > CADASTRO DE GERENTE <        \n");
                    System.out.println("    1 - Cadastro  ");
                    System.out.println("    2 - Informa dados ");         
                    System.out.println("    3 - Sair    ");
                    menu = ler.nextInt();
                    
                    switch(menu){
                        
                        case 1:  
                            Gerente g1 = new Gerente();
                            g1.informaCadastro();
                            g1.ReajusteGerente(g1.getSalario());
                            g1.Testarsenha();
                            gerente1.add(g1);                                                                                                  
                            break;  
                            
                        case 2:                            
                            for (Gerente gg1 : gerente1){
                                g1 = gg1;
                                gg1.informaDados();
                                System.out.println("Salário: " + g1.ReajusteGerente(g1.getSalario()));
                            }                                               
                            break;
                            
                        case 3:
                            System.out.println("\n    > Obrigado por se juntar a nossa equipe! < ");   
                            System.exit(0);
                            break;  
                    }   
                                              
                      
                } while (menu != 3);
                
                case 2:                
                    do {
                        
                    System.out.println("\n\n       > CADASTRO DE VENDEDOR <        \n");                  
                    System.out.println("    1 - Cadastro  ");
                    System.out.println("    2 - Informa dados ");         
                    System.out.println("    3 - Sair    ");
                    menu = ler.nextInt();
                    
                    switch(menu){
                        
                        case 1:  
                            Vendedor v1 = new Vendedor();
                            v1.informaCadastro();                              
                            v1.ReajusteVendedor(v1.getSalario());
                            v1.Testarsenha();
                            vendedor1.add(v1);
                            break;
                            
                        case 2:
                            for (Vendedor vv1 : vendedor1){
                                v1 = vv1;
                                vv1.informaDados();
                                System.out.println("Salário: " + v1.ReajusteVendedor(v1.getSalario()));
                            }                                               
                            break;
                            
                        case 3:
                            System.out.println("\n    > Obrigado por se juntar a nossa equipe! < ");
                            System.exit(0);
                            break;         
                            
                    } 
                    
                } while (menu != 3);
                                       
                case 3:
                    do {
                        
                    System.out.println("\n\n       > CADASTRO DE FAXINEIRO <        \n");                  
                    System.out.println("    1 - Cadastro  ");
                    System.out.println("    2 - Informa dados ");         
                    System.out.println("    3 - Sair    ");
                    menu = ler.nextInt();
                    
                    switch(menu){
                        
                        case 1:  
                            Faxineiro f1 = new Faxineiro();                           
                            f1.informaCadastro();
                            f1.ReajusteFaxineiro(f1.getSalario());
                            f1.Testarsenha();
                            faxineiro1.add(f1);
                            break;  
                            
                        case 2:
                            for (Faxineiro ff1 : faxineiro1){
                                f1 = ff1;
                                ff1.informaDados();
                                System.out.println("Salário: " + f1.ReajusteFaxineiro(f1.getSalario()));
                            }  
                            break;
                            
                        case 3:
                            System.out.println("\n    > Obrigado por se juntar a nossa equipe! < ");  
                            System.exit(0);
                            break; 
                            
                        }                 
                    
                    } while (menu != 3);
                }                          
            }   while (op != 4);
        }    
    }

