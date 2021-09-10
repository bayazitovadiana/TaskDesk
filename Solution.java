import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList <Proger> list = new ArrayList<>();
        list.add(new Proger("Сергей Поздняков", 3131));
        list.add(new Proger("Игорь Пресняков", 3132));
        list.add(new Proger("Александр Липуга", 3133));
        ArrayList <Employee> listEmployee = new ArrayList<>();
        listEmployee.add(new Employee("Елена","бухгалтерия", 2130));
        listEmployee.add(new Employee("Карина","опт", 1250));
        listEmployee.add(new Employee("Александр Медведев","розница", 1000));

    }
}
