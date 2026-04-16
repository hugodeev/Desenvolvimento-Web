
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudante> estudantes = new ArrayList<>();
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        ArrayList<Matricula> matriculas = new ArrayList<>();
        
        int opcao = 0;
        
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Disciplina");
            System.out.println("2 - Cadastrar Estudante");
            System.out.println("3 - Inserir estudante na disciplina");
            System.out.println("4 - Listar");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            
            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida!");
                sc.next();
                continue;
            }
            
            switch (opcao) {
                case 1:
                    try {
                        System.out.print("ID da disciplina: ");
                        int idD = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.print("Nome: ");
                        String nomeD = sc.nextLine();
                        
                        System.out.print("Carga horária: ");
                        int carga = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.print("Professor: ");
                        String prof = sc.nextLine();
                        
                        disciplinas.add(new Disciplina(idD, nomeD, carga, prof));
                        System.out.println("Disciplina cadastrada com sucesso!");
                        
                    } catch (InputMismatchException e) {
                        System.out.println("ERRO: ID e carga devem ser números!");
                        sc.next();
                    }
                    break;
                    
                case 2:
                    try {
                        System.out.print("ID do aluno: ");
                        int idA = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.print("Nome: ");
                        String nomeA = sc.nextLine();
                        
                        System.out.print("Matrícula: ");
                        String mat = sc.nextLine();
                        
                        System.out.print("Curso: ");
                        String curso = sc.nextLine();
                        
                        estudantes.add(new Estudante(idA, nomeA, mat, curso));
                        System.out.println("Estudante cadastrado com sucesso!");
                        
                    } catch (InputMismatchException e) {
                        System.out.println("ERRO: ID deve ser número!");
                        sc.next();
                    }
                    break;
                    
                case 3:
                    if (estudantes.isEmpty()) {
                        System.out.println("Nenhum estudante cadastrado!");
                        break;
                    }
                    if (disciplinas.isEmpty()) {
                        System.out.println("Nenhuma disciplina cadastrada!");
                        break;
                    }
                    
                    System.out.println("\n--- Estudantes ---");
                    for (Estudante e : estudantes) {
                        e.mostrar();
                    }
                    
                    System.out.print("ID do estudante: ");
                    int idEstudante;
                    try {
                        idEstudante = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("ERRO: ID deve ser número!");
                        sc.next();
                        break;
                    }
                    
                    Estudante estudanteEncontrado = null;
                    for (Estudante e : estudantes) {
                        if (e.getId() == idEstudante) { 
                            estudanteEncontrado = e;
                            break;
                        }
                    }
                    
                    if (estudanteEncontrado == null) {
                        System.out.println("Estudante não encontrado!");
                        break;
                    }
                    
                    System.out.println("\n--- Disciplinas ---");
                    for (Disciplina d : disciplinas) {
                        d.mostrar();
                    }
                    
                    System.out.print("ID da disciplina: ");
                    int idDisc;
                    try {
                        idDisc = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("ERRO: ID deve ser número!");
                        sc.next();
                        break;
                    }
                    
                    Disciplina disciplinaEncontrada = null;
                    for (Disciplina d : disciplinas) {
                        if (d.getId() == idDisc) {  
                            disciplinaEncontrada = d;
                            break;
                        }
                    }
                    
                    if (disciplinaEncontrada == null) {
                        System.out.println("Disciplina não encontrada!");
                        break;
                    }
                    
                    matriculas.add(new Matricula(estudanteEncontrado, disciplinaEncontrada));
                    System.out.println("Estudante inserido na disciplina!");
                    break;
                    
                case 4:
                    System.out.println("\n--- DISCIPLINAS ---");
                    for (Disciplina d : disciplinas) {
                        System.out.println("\nDisciplina: " + d.getNome());
                        System.out.println("Estudantes matriculados:");
                        boolean temEstudante = false;
                        for (Matricula m : matriculas) {
                            if (m.getDisciplina().getId() == d.getId()) {
                                // Mostra NOME e MATRÍCULA do estudante
                                System.out.println("- " + m.getEstudante().getNome() + " (Matrícula: " + m.getEstudante().getMatricula() + ")");
                                temEstudante = true;
                            }
                        }
                        if (!temEstudante) {
                            System.out.println("Nenhum estudante matriculado.");
                        }
                    }
                    
                    System.out.println("\n--- ESTUDANTES ---");
                    for (Estudante e : estudantes) {
                        // Mostra NOME e MATRÍCULA (em vez de ID)
                        System.out.println("- " + e.getNome() + " (Matrícula: " + e.getMatricula() + ")");
                    }
                        break;
                    
                case 5:
                    System.out.println("Encerrando...");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
        
        sc.close();
    }
}