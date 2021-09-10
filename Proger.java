import java.util.ArrayList;

public class Proger extends Employee{
    public String name; //имя сотрудника
    public String function; //должность
    public int id; //ид номер сотрудника
    public boolean progr = true;
       //сумма веса всех задач, тут нужно метод дописать, сумма не может быть больше 100
       int workLoad;
    public  ArrayList <Task> tasksProger = new  ArrayList<>();
       //список задач принятых в работу
    public int totalWeightForProger()
    {
        int workLoad=0;
        for(Task d : tasksProger)
             workLoad += d.weight;
        return workLoad;
    }
    //метод определения суммы задач в работе
    public  Proger(String name, int id){
    this.name=name;
    this.id=id;
        }
    public Proger(){

    }
    }

