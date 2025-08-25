package CodeForces_Round_1034;

import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        int t;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt(); 
        while(t-->0){
            int n,j,k;
            n=sc.nextInt();
            j=sc.nextInt();
            k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            if(k!=1){
                System.out.println("Yes");
            }
            else{
                boolean flag=false;      
                for(int i=0;i<n;i++){
                    if(j-1!=i && arr[j-1]<arr[i]){
                        flag=true;
                        break;
                    }
                }
                if(flag){
                    System.out.println("No");
                }
                else{
                    System.out.println("Yes");
                }
                
            }
            
            
        }
    }
}
