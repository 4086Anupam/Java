package Interface;

// Multiple inheritance 

interface Student {  // Interface 1

    void name();

}

interface Department{ // Interface 2

   void dept();

}

class Info implements Student,Department{ // class

    public void name (){

        System.out.println("Anupam");

    }
    public void dept(){

        System.out.println("Information Technology");
    }

}


class ExampleMultipleInheritance{  // main class
    public static void main(String[] args) {


        Info obj = new Info();

        obj.name();
        obj.dept();
    }

}