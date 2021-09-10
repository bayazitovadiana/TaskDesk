import java.util.Scanner;

public class Employee {
     String name; //имя сотрудника
    String function; //дожлность
    int id; //ид номер сотрудника
    String  getName(){
    name = new Scanner(System.in).nextLine();
        return name;
    }
    void  setName( String name){
        this.name = name;
    }
    String  getFunction(){
        function = new Scanner(System.in).nextLine();
        return function;
    }
    void  setFunction( String function){
        this.function = function;
    }
    int  getID(){
        id = new Scanner(System.in).nextInt();
        return id;
    }
    void  setID( int id){
        this.id = id;
    }

    Employee(String name, String function, int id){
        this.name = name;
        this.function = function;
        this.id=id;
    }

    public Employee() {
    }
}
