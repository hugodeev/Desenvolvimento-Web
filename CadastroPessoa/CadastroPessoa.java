import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        int opcao;
        
        do { 
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Deletar");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    
                    System.out.print("Telefone: ");
                    String tel = sc.nextLine();
                    
                    System.out.print("Endereço: ");
                    String end = sc.nextLine();
                    
                    lista.add(nome + "|" + tel + "|" + end);
                    System.out.println("Cadastrado com sucesso!");
                    break;
                    
                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum cadastro encontrado!");
                    } else {
                        System.out.println("\n=== LISTA DE CADASTROS ===");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println("[" + i + "] " + lista.get(i));
                        }
                    }
                    break;
                    
                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum cadastro para deletar!");
                    } else {
                        System.out.println("\n=== LISTA DE CADASTROS ===");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println("[" + i + "] " + lista.get(i));
                        }
                        
                        System.out.print("\nDigite o número do cadastro que deseja deletar: ");
                        int indice = sc.nextInt();
                        sc.nextLine();
                        
                        if (indice >= 0 && indice < lista.size()) {
                            String removido = lista.remove(indice);
                            System.out.println("Deletado com sucesso!");
                            System.out.println("Removido: " + removido);
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (opcao != 4); 
        
        sc.close();
    }
}