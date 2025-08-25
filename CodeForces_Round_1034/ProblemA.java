package CodeForces_Round_1034;

import java.util.Scanner;

public class ProblemA {
    public static void solve(Scanner sc) {
        int n;
        n=sc.nextInt();

        int res=n*(n-1);

        res=res/2;

        if(res%3==0 && n%2==0){
            System.out.println("Bob");
        }
        else{
            System.out.println("Alice");
        }
    }
    public static void main(String[] args) {
        int t;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
}