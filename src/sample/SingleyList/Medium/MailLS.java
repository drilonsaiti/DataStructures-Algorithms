package sample.SingleyList.Medium;
import java.util.Scanner;

public class MailLS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SLL<Integer> list = new SLL<Integer>();
        SLL<Integer> read = new SLL<Integer>();
        SLL<Integer> trash = new SLL<Integer>();
        int n =scanner.nextInt();

        for (int i = 1; i <= n;i++){
            list.insertLast(i);
        }

        int x = scanner.nextInt();

        while (x-- != 0){
            int op = scanner.nextInt();
            int id = scanner.nextInt();

            if (op == 1){
                list = remove(list,id);
                read.insertLast(id);
            }else if(op == 2){
                read = remove(read,id);
                trash.insertLast(id);
            }else if(op == 3){
                list = remove(list,id);
                trash.insertLast(id);
            }else if(op == 4){
                trash = remove(trash,id);
                read.insertLast(id);
            }
        }
        System.out.println("Unread " + list);
        System.out.println("Read " + read);
        System.out.println("Trash " + trash);

    }
    public static SLL remove(SLL<Integer> list,int id){
        SLLNode<Integer> node = list.getFirst();

        while (node != null){
            if(node.element == id){
                list.delete(node);
            }
            node = node.succ;
        }
        return list;
    }

}
