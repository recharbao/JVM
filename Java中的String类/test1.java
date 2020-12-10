public class test1 {
    public static void main(String[] args) {
        String str = new String("yes");
        modify(str);
        System.out.print(str);
    }

    public static void modify(String s){
        s = new String("he");
    }
}
