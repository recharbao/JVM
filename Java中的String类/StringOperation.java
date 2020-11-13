public class test1 {
    public static void main(String[] args) {
        String nice = "漂亮";
        String testOne = "漂" + "亮";
        System.out.println(testOne == nice); //这个是true,两个常量做并置运算,
        // 结果仍然是常量,如果常量池中没有这个常量，就加入这个常量并创建引用;
        System.out.println(nice == "漂亮"); //这个是true, 该目录下由图解，这里不做解释
        String piao = "漂";
        String liang = "亮";
        String testTwo = piao + liang;
        System.out.println(testTwo == testOne); //这个是false,
        //因为piao和liang都是变量而不是常量，并置运算中只要有一个量是变量,
        // Java 就会在动态区(非常量池), 创建实体和引用,作用效果就相当于new("漂亮")
        //下面的结果同样验证了这一点
        String testThree = piao + liang;
        System.out.println(testThree == testTwo); //fasle
    }
}

