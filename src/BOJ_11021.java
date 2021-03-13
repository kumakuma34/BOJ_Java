import java.util.Scanner;

public class BOJ_11021 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T, A, B;
        T = scanner.nextInt();
        for(int i = 0 ; i < T; i++){
            A = scanner.nextInt();
            B = scanner.nextInt();
            System.out.println("Case #"+(i+1) +": " + (A+B));
        }
    }
}
