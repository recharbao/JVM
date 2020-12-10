

//先执行父类的构造方法，然后执行子类的构造方法
public class B extends A {

    B(int m) {

        i = 2;

    }

    public static void main(String args[]){

        B b = new B(100);

        System.out.println(b.i); 

    }

}

class A {

    public int i=0;

    //A(){} 

    A(int m) {

        i = 1;

    }

}
