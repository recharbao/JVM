public class E {

    public static void main(String args[]){

        int [][] a = {{0,1,2,3,4},{5,6},{7,8,9}};

        int [] b ={100,200,300};

        a[0] = b;

        int m = a[0][2]+b[2];

        System.out.println(m);

    }

}
