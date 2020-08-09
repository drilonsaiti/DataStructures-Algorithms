package sample.DoubleList.Medium;


import java.util.Scanner;

class Company{
    int ID;
    int plata;

    public Company(int ID, int plata) {
        this.ID = ID;
        this.plata = plata;
    }
    public String toString(){
        return ID + " " + plata;
    }
}
public class CompanyDLL {
    public static void main(String[] args) {
        DLL<Company> lista1 = new DLL<>();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 0; i < N; i++){
            int id = in.nextInt();
            int plata = in.nextInt();
            Company k = new Company(id,plata);
            lista1.insertLast(k);
        }
        int minPlata = in.nextInt();
        brisi(lista1,minPlata);
        System.out.println(lista1);
        if(lista1.getFirst() == null)
        {
            System.out.println("nema");
        }else{
            najgolemaPlata(lista1);
            System.out.println(lista1);
        }
        //najgolemaPlata(lista1);
    }

    public static void najgolemaPlata(DLL<Company> list){
        int n = list.length();
        for (int i = 0; i < n; i++){
            DLLNode<Company> node = list.getFirst();
            while (node.succ != null){
                if(node.element.plata < node.succ.element.plata){
                    int ID,plata;
                    ID = node.element.ID;
                    node.element.ID = node.succ.element.ID;
                    node.succ.element.ID = ID;

                    plata = node.element.plata;
                    node.element.plata = node.succ.element.plata;
                    node.succ.element.plata = plata;
                }
                node = node.succ;
            }
        }
    }
    public static void brisi(DLL<Company> list,int min){
        DLLNode<Company> node = list.getFirst();

        while (node != null){
            if(node.element.plata < min){
                list.delete(node);
            }
            node = node.succ;
        }
    }
}
