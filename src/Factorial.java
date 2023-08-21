public class Factorial {
    static int Giaithua(int n){
        if ((n==1)){
            return 1;
        } else {
            return (n* Giaithua(n-1));

        }
    }
    public static void main(String[] args) {

        for (int i=0;i<10;i ++){
        System.out.println("Giai thừa của 5 là: " + Giaithua(5));
        }
    }
}
