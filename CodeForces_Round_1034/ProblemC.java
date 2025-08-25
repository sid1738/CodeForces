package CodeForces_Round_1034;

import java.util.HashMap;
import java.util.Scanner;

public class ProblemC {
    public static void solve(Scanner sc) {
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int []pos=new int[1000001];
        int mn=arr[0];
        int mx=arr[n-1];
        String res="";
        for(int i=0;i<n;i++){
            mn=Math.min(mn,arr[i]);
            pos[mn]=1;
            mx=Math.max(mx,arr[n-1-i]);
            pos[mx]=1;
        }
        
        
        for(int i=0;i<n;i++){
            if(pos[arr[i]]==1){
                res+="1";
            }
            else{
                res+="0";
            }
        }
        System.out.println(res);
        
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
