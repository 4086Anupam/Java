package Constructor;

import java.util.*;

public class boy {

    private String name;
    private int age;

    public boy (String name){
        this("Rahul",19);
        this.name=name;
    }

    public boy(String name, int age){

        this.name=name;
        this.age=age;
    }


    void display(){

        System.out.println(name);
        System.out.println(age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof boy boy)) return false;
        return age == boy.age && Objects.equals(name, boy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}


class user implements Comparable<boy>{

    public static void main(String[] args) {

      boy obj =new boy ("Anupam") ;
      boy obj2 =new boy ("Anupam",20);

        obj.display();
        obj2.display();


    }



    List<boy> boys = new ArrayList<>();


    @Override
    public int compareTo(boy o) {
        return 0;
    }
}
