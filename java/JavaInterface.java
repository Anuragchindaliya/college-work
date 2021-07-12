interface A {

    void display();

}

interface B extends A {

    void show();

}

public class JavaInterface implements B

{

    public void display()

    {

        System.out.println("Good Morning");

    }

    public void show()

    {

        System.out.println("Have a nice day!!");

    }

    public static void main(String[] args)

    {

        JavaInterface obj = new JavaInterface();

        obj.display();

        obj.show();

    }

}
