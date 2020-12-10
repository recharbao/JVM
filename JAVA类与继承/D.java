
public class D {

    public static void main(String args[]) {

        //Tom a = new Tom();           //A 这一行是编译错误的一行， Tom类不再提供默认构造方法

        Tom b = new Tom(127);        //B

        Tom c = new Tom((byte)127);  //C

        Tom d = new Tom('好');       //D

    }

}

class Tom {


    Tom(int m){
        System.out.println("Next");
        System.out.println(m);

    }

    void  Tom(){

        System.out.println("ok");

    }

    Tom(byte m)  {

        System.out.println("你好");

    }



}
