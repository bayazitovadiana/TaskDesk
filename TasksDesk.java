import java.util.ArrayList;

public class TasksDesk {

    Proger proger1 = new Proger("Сергей Поздняков",3130);
    Proger proger2 = new Proger("Игорь Поздняков",3131);
    Proger proger3 = new Proger("Александр Липуга",3132);

    Employee employee1 = new Employee("Елена","бухгалтерия", 2130);
    Employee employee2 = new Employee("Карина","опт", 1250);
    Employee employee3 =new Employee("Александр Медведев","розница", 1000);
    Employee employee4 =new Employee("Любовь Степановна","склад", 9000);

    public void createTask(String name, boolean receivedStatus, String contentData, int weight,String author, int priority, String executant)
    {
    Task task = new Task(name,receivedStatus,contentData,weight,author,priority,executant);
}

}
