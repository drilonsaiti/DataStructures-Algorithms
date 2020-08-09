package sample.SingleyList.Medium;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Components {

    public static void main(String[] args) throws IOException {
        SLL<Integer> sll = new SLL<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String []pomNiza = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            sll.insertLast(Integer.parseInt(pomNiza[i]));
        }

        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int array[] = new int[m];
        for (int i = 0; i < m; i++){
            array[i] = scan.nextInt();
        }
        System.out.println(sll);

        System.out.println(numComponents(sll,array));
    }

    public static int numComponents(SLL<Integer> list, int [] g){
        Set<Integer> gSet = new HashSet<>();

        for (int x: g) gSet.add(x);

        SLLNode<Integer> node = list.getFirst();
        int ans = 0;

        while (node != null){
            if(gSet.contains(node.element) && (node.succ == null || !gSet.contains(node.succ.element)))
                ans++;
            node = node.succ;
        }
        return ans;
    }
}
