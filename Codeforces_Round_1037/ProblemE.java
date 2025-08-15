import java.util.Scanner;

public class ProblemE {
    public static void solve(Scanner sc){
        int n = sc.nextInt();
        int[]p=new int[n];
        int[]s=new int[n];
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
            ans[i]=lcm(p[i], s[i]);
        }

        if(ans[0]!=p[0]){
            System.out.println("NO");
            return;
        }

        if(ans[n-1]!=s[n-1]){
            System.out.println("NO");
            return;
        }

        for(int i=1;i<n;i++){
            if(gcd(p[i-1],ans[i])!=p[i]){
                System.out.println("NO");
                return;
            }
        }

        for(int i=n-2;i>=0;i--){
            if(gcd(s[i+1],ans[i])!=s[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");


        

    }
    private static int lcm(int i, int j) {
        // TODO Auto-generated method stub
        return (i * j) / gcd(i, j);
    }
    private static int gcd(int g, int i) {
        // TODO Auto-generated method stub
        if(i==0) return g;
        return gcd(i, g%i);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            solve(sc);
        }
        sc.close();
    }
}
