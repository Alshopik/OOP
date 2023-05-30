import java.io.PrintStream;

public class cat {

    public String ownerName;
    private  String name;
    private  int age;


    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    String getOwnerName(){
        return  this.ownerName;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    public void greet(){
        System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s.", name, age, ownerName);
    }

}
