package presentation;

import business.service.PrinterService;
import business.service.ReaderService;
import presentation.controller.StudentController;
import presentation.controller.SubjectController;

public class Main {

    public static final StudentController studentController = new StudentController();
    public static final SubjectController subjectController = new SubjectController();
    public static final PrinterService printerService = new PrinterService();
    public static final ReaderService readerService = new ReaderService();

    public static void main(String[] args) {

        while(true){
            showMenu();
            int option = readerService.nextInt();

            switch (option) {
                case 1:{
                    createStudent();
                    break;
                }
                case 2:{
                    showAllStudents();
                    break;
                }
                case 3:{
                    editStudent();
                    break;
                }
                case 4:{
                    deleteStudent();
                    break;
                }
                case 5:{
                    createSubject();
                    break;
                }
                case 6:{
                    showAllSubjects();
                    break;
                }
                case 7:{
                    editSubject();
                    break;
                }
                
                case 8:{
                    deleteSubject();
                    break;
                 }

                case 9:{
                    printerService.println("Saindo...");
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Opção inválida!");
                }
            } 
        }}
    
        private static void showAllStudents() {
            studentController.showAll();
        }
        private static void showAllSubjects() {
        subjectController.showAll();
        }

        private static void showMenu() {
            printerService.println("Digite a opção desejada: ");
            printerService.println("1. Criar Estudante");
            printerService.println("2. Visualizar Estudantes");
            printerService.println("3. Editar Estudante");
            printerService.println("4. Deletar Estudante");
            printerService.println("5. Criar Disciplina");
            printerService.println("6. Visualizar Disciplinas");
            printerService.println("7. Editar Disciplina");
            printerService.println("8. Deletar Disciplina");
            printerService.println("9. Sair");
        }

        private static void createStudent() {

            printerService.println("Digite o nome: ");
            String name = readerService.nextLine();
    
            printerService.println("Digite a matrícula: ");
            String mat = readerService.nextLine();

            printerService.println("Digite o curso: ");
            String curso = readerService.nextLine();

            studentController.create(name, mat, curso);
        }
        
        private static void editStudent(){
            
            studentController.showAll();
            printerService.println("Digite a matrícula do estudante que deseja alterar: ");
            String oldMat = readerService.nextLine();
            
            printerService.println("Digite o novo nome: ");
            String newName = readerService.nextLine();
            
            printerService.println("Digite a nova matrícula: ");
            String newMat = readerService.nextLine();

            printerService.println("Digite o novo curso: ");
            String newCurso = readerService.nextLine();
            
            boolean result = studentController.update(oldMat, newName, newMat, newCurso);
            
            if (result) {
                printerService.println("Estudante atualizado com sucesso!");
            } else {
                printerService.println("Estudante não encontrado!");
            }
            
        }
   
        private static void deleteStudent() {
            studentController.showAll();
            printerService.println("Digite a matrícula do estudante que deseja deletar: ");
            String mat = readerService.nextLine();
            
            boolean result = studentController.delete(mat);
            
            if (result) {
                printerService.println("Estudante deletado com sucesso!");
            } else {
                printerService.println("Estudante não encontrado!");
            }
        }
        
        private static void createSubject() {
            printerService.println("Digite o id: ");
            int id = readerService.nextInt();
    
            printerService.println("Digite o nome da disciplina: ");
            String disciplina = readerService.nextLine();
            
            printerService.println("Digite a carga horária: ");
            int cargaHoraria = readerService.nextInt();
            
            printerService.println("Digite o nome do professor: ");
            String professor = readerService.nextLine();
            
            subjectController.create(id, disciplina, cargaHoraria, professor);
        }
        
        private static void editSubject(){
            
            subjectController.showAll();
            printerService.println("Digite o id da disciplina que deseja alterar: ");
            String oldId = readerService.nextLine();

            printerService.println("Digite o novo nome da disciplina: ");
            String newName = readerService.nextLine();
    
            printerService.println("Digite o novo id: ");
            String newId = readerService.nextLine();
            
            printerService.println("Digite a nova carga horária: ");
            int newCargaHoraria = readerService.nextInt();
            
            printerService.println("Digite o novo nome do professor: ");
            String newProfessor = readerService.nextLine();
            
            boolean result = subjectController.update(oldId, newName, newId, newCargaHoraria, newProfessor);
            
            if (result) {
                printerService.println("Disciplina atualizada com sucesso!");
            } else {
                printerService.println("Disciplina não encontrada!");
            }
            
        }

        private static void deleteSubject() {
            subjectController.showAll();
            printerService.println("Digite o id da disciplina que deseja deletar: ");
            String id = readerService.nextLine();

            boolean result = subjectController.delete(id);

            if (result) {
                printerService.println("Disciplina deletada com sucesso!");
            } else {
                printerService.println("Disciplina não encontrada!");
            }
        }
    }
