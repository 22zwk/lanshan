public class Zuoye {
    public static void main(String[] args) {
        int x=12345;
        int t= x ;
        int num=0;
        while(x!=0){
            int g=x%10;
            x=x/10;
            num=num*10+g;
        }
        System.out.println(num);
        System.out.println(num==t);
    }
}

