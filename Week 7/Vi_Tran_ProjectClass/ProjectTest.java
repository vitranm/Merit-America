public class ProjectTest {
  public static void main(String[] args) {

      Project project1 = new Project();
      Project project2 = new Project("Project2");
      Project project3 = new Project("Project3", "Description3");

      project1.setName("Project1");
      project1.setDescription("Description1");

      project2.setDescription("Description2");

      System.out.println(project1.getName());
      System.out.println(project2.getDescription());

      String elevator = project3.elevatorPitch();
      System.out.println(elevator);
  }
}
