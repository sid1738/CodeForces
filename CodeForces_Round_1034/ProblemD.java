package CodeForces_Round_1034;

import java.util.Scanner;

public class ProblemD {

    public static void solve(Scanner sc) {
        
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int arr[]=new int[n];
        int ones=0;
        for(int i=0;i<n;i++){
            
            arr[i]=sc.nextInt();
            if(arr[i]==1){
                ones++;
            }

        }


        if(ones<=k || n<2*k){
            System.out.println("Alice");
            
        }
        else{
            System.out.println("Bob");
        }



        
        
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-->0){ 
            solve(sc);
        }
    }
}
