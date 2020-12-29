
public class E{
    public static void main(String[] args) {
        System.out.println(Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE); //一个字节
        System.out.println(Short.MIN_VALUE + " ~ " + Short.MAX_VALUE); //两个字节
        System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE); //四个字节
        System.out.println(Long.MIN_VALUE + " ~ " + Long.MAX_VALUE); //8个字节
        System.out.println(Float.MIN_VALUE + " ~ " + Float.MAX_VALUE); //4个字节
        System.out.println(Double.MIN_VALUE + " ~ " + Double.MAX_VALUE); //8个字节
    }
}

/**
 -128 ~ 127
 -32768 ~ 32767
 -2147483648 ~ 2147483647
 -9223372036854775808 ~ 9223372036854775807
 1.4E-45 ~ 3.4028235E38
 4.9E-324 ~ 1.7976931348623157E308
**/

//在计算机组成原理中学习到浮点数是由三部分组成，java也采用这种方式
//即:符号位，指数位， 尾数
