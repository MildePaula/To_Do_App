
package TodoApp;
//import java.sql.Connection;
//import util.ConnectionFactory;
import controller.ProjectController;
//import java.util.List;
import model.Project;


public class Main {

    public static void main(String[] args) {
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("Description");
        projectController.save(project);
        
//        
//        project.setName("Projeto nome do projeto");
//        projectController.update(project);
//        
//        List<Project> projects = projectController.getAll();
//        System.out.println("Total de projetos = " + project.size());
              
    }
        
     
}
