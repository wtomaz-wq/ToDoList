
import java.util.Scanner;

public class NewClass {
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int lista;
        
        String[] tarefas = new String[10];
        boolean[] concluidas = new boolean[10];
        boolean[] ocupadas = new boolean[10];
        
       int opcao;
       
       do {
           System.out.println("\n===Lista de tarefas===");
           System.out.println("1- Adcionar Tarefa");
           System.out.println("2- Listar Tarefas");
           System.out.println("3- Concluir Tarefas");
           System.out.println("4- Excluir Tarefa");
           System.out.println("5- Sair");
           
           opcao = scanner.nextInt();
           scanner.nextLine();
           
           switch (opcao) {
               case 1:
                   System.out.println("Você escolheu adcionar tarefas.");
                   boolean cadastrou = false;
                   for (int i = 0; i < 10; i++) {
                       if (!ocupadas[i]){
                           System.out.println("Digite a tarefa: ");
                           tarefas[i] = scanner.nextLine();
                           ocupadas[i] = true;
                           concluidas[i] = false;
                       }
                   }
                   if (!cadastrou){
                       System.out.println("A lista de tarefas está cheia!");
                   }
                   break;
               case 2:
                   System.out.println("Você escolheu Listar tarefas.");
                    System.out.println("\n=== MINHAS TAREFAS===");
                    boolean temTarefa = false;
                    for (int i = 0; i < 10; i++){
                        if (ocupadas[i]){
                            temTarefa = true;
                            String status = concluidas[i] ? "[x]" : "[ ]";
                            System.out.println((i + 1) + " - " + status + " " + tarefas[i]);                          
                        }
                    }
                    if (!temTarefa) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    }
                   break;
               case 3:
                   System.out.println("Tarefas concluidas.");
                   
                   System.out.print("Digite o número da tarefa que deseja concluir: ");
                   int numConcluir = scanner.nextInt();
                   scanner.nextLine();
                   int idxConcluir = numConcluir - 1;
                   
                   if (idxConcluir >= 0 && idxConcluir < 10 && ocupadas[idxConcluir]){
                       concluidas[idxConcluir] = true;
                       System.out.println("\nTarefa Concluída com sucesso!");
                   }else{
                       System.out.println("tarefa inválida!");
                   } 
                   break;
               case 4:
                   System.out.println("Você Escolheu Excluir Tarefas");
                   System.out.print("Digite o número da tarefa que deseja excluir: ");
                   int numExcluir = scanner.nextInt();
                   scanner.nextInt();
                   int idxExcluir = numExcluir - 1;
                   if (idxExcluir >= 0 && idxExcluir < 10 && ocupadas [idxExcluir]){
                       ocupadas[idxExcluir] = false;
                       concluidas[idxExcluir] = false;
                       tarefas[idxExcluir] = "";
                       System.out.println("\nTarefa excluída com sucesso!");
                   }else{
                       System.out.println("tarefa invalida!");                      
                   }                                
                   break;
               case 5:
                   System.out.println("Programa encerrado");
                   break;
               default:
                   System.out.println("Opção invalida! Tente Novamente");
           }
           } while (opcao !=5);
       }
       }
    
    
    
