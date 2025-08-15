import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;


public class ProblemD{
    static class Node {
        int l;
        int r;
        int real;

        Node(int l, int r, int real) {
            this.l = l;
            this.r = r;
            this.real = real;
        }

        public int getL() {
            return l;
        }

        public int getR() {
            return r;
        }

        public int getReal() {
            return real;
        }
    }
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Node> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int real = sc.nextInt();
            list.add(new Node(l, r, real));
        }

        list.sort((a, b) -> Integer.compare(a.getL(), b.getL()));
        PriorityQueue<Node>pq=new PriorityQueue<>((a,b)->b.getReal()-a.getReal());

        int curr = k;

        for(int i=0;i<n;i++){
            Node node = list.get(i);
            if(node.getL() <= curr && node.getR() >= curr){
                pq.add(node);
                curr = Math.max(curr, node.getReal());
            }
            
            while(!pq.isEmpty() && pq.peek().getR() < curr){
                pq.poll();
            }
        }
        System.out.println(curr);

    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n-- > 0) {
            
            solve(sc);
        }
    }
}