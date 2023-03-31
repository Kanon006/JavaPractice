public class Main {


    public int op(int a,int b){
        int sum =a+b;
        return sum;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int x=10,y=20;


        int sum=obj.op(x,y);
        System.out.println(sum);

    }

}