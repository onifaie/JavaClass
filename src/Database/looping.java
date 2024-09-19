package Database;

public class looping {

    static  int  i;
    static int sum;
    static int j;
    static String m = "total Number is = ";
    public int myloop(int x){

        for (int j = 0; j < x; j++) {
            System.out.println(sum +=j +2);
            System.out.println("-------------------------");

//            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("---------this Begin Loop 1-------------");
        looping d1=new looping();
        d1.myloop(8);
        System.out.println("---------this Bwgin Loop 2-------------");

        d1.myloop(20);

    }

}
