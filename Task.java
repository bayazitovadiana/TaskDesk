import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task {

public  String name; //заголовок задачи (проверка названия - не должно быть глаголов и пробелов, совпадать с названием объекта из списка предоплределенных в программе)
    String  getName(){ //установка заголовка, читаем из ввода
        name = new Scanner(System.in).nextLine();
        return name;
    }
    void  setName( String name){
        this.name = name;
    }
    //значимые даты
    Date  receivedDate; //дата получения
    Date  acceptedDate; //дата принятия
    Date  handed_over_to_workDate; //дата передачи в работу
    Date  in_workDate; //дата принятия в работа
    Date  checkingDate; //дата передачи в проверку
    Date  completedDate; //дата завершения
    Date  back_in_workDate; //дата возвращения в работу

    //статусы задачи
 public  boolean  receivedStatus = true; //при записи статус всегда receivedStatus
    public  boolean  acceptedStatus=false;
    public  boolean handed_over_to_workStatus=false;
    public  boolean in_workStatus=false;
    public  boolean checking=false;
    public  boolean completedStatus=false;
    public  boolean back_in_workStatus = false;
    void getReceivedStatus(){ //установка статуса Задача получена
        if(receivedStatus = true)
            System.out.println("Задача получена");
    }
void getAcceptedStatus(){  //установка статуса Принятая задача
    if (acceptedStatus==true)
    receivedStatus = false;
    handed_over_to_workStatus=false;
    in_workStatus=false;
    checking=false;
    back_in_workStatus = false;
    completedStatus=false;
    System.out.println("Задача принята");
}
   void getHanded_over_to_workStatus (){   //установка статуса Задача в работе
        if (handed_over_to_workStatus ==true)
            receivedStatus = false;
        acceptedStatus = false;
        in_workStatus=false;
        checking=false;
       back_in_workStatus = false;
        completedStatus=false;
       System.out.println("Задача передана в работу. Назначен исполнитель");
    }
    void getIn_workStatus (){ //Установка статуса Задача в работе
        if (in_workStatus ==true)
            receivedStatus = false;
        acceptedStatus = false;
        handed_over_to_workStatus=false;
        checking=false;
        back_in_workStatus = false;
        completedStatus=false;
        System.out.println("Задача в работе");
    }
    void getСhecking(){ //Установка статуса Задача на проверке
        if (checking ==true)
            receivedStatus = false;
        acceptedStatus = false;
        handed_over_to_workStatus=false;
        in_workStatus=false;
        back_in_workStatus = false;
        completedStatus=false;
        System.out.println("Задача передана на проверку");
    }
    void getBack_in_workStatus(){ //Установка статуса Задача возвращена в работу
        if (back_in_workStatus ==true)
            receivedStatus = false;
        acceptedStatus = false;
        handed_over_to_workStatus=false;
        in_workStatus=false;
        checking=false;
        completedStatus=false;
        System.out.println("Задача возвращена в работу");
    }
    void getСompleted(){ //Установка статуса Задача выполнена. После статуса завершения уже нельзя изменить статус задачи, она архивируется
        if (completedStatus ==true)
            receivedStatus = false;
        acceptedStatus = false;
        handed_over_to_workStatus=false;
        in_workStatus=false;
        back_in_workStatus = false;
        checking=false;
        System.out.println("Задача выполнена");
    }
public String contentData; //многострочное описание задачи
int weight=0; //задается для учета нагрузки отдельного сотрудника, не может быть больше 100
    int  getWeight(){ //прочесть вводимое значение веса
        weight = new Scanner(System.in).nextInt();
        if (weight>100)
        {
            System.out.println("Значение не может превышать 100");
        return 100;
        }
        return weight;
    }
    void  setWeight( int weight){

        this.weight = weight;
    }
String author = new Employee().name; //имя автора задачи
int priority = 5; //Приоритет по умолчанию 5, для определения порядка в очереди на исполнение.
    int getPriortity(){ //установить приоритет вручную
        priority = new Scanner(System.in).nextInt();
        if(priority<1)
            return 1;
        return priority;
    }
    String executant = new Proger().name;
    int id; //идентификатор присваивается поле добавления задачи в пул задач общий
    public  int  timeWork = 0; //Срок выполнения задачи в сутках
    public  int gettimeWork(Date completedDate, Date receivedDate){  //расчет срока между датами поступления и завершения
        return (int)( (completedDate.getTime() - receivedDate.getTime()) / (1000 * 60 * 60 * 24));
    }
    public Task(String name, boolean receivedStatus, String contentData, int weight,String author, int priority, String executant){
        this.name=name;
        receivedStatus=true;
        this.contentData= contentData;
        this.weight=weight;
        this.author=author;
        this.priority=priority;
        this.executant=executant;
    }

}
