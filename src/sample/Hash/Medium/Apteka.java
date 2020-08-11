package sample.Hash.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

import static java.lang.Integer.parseInt;


class Lekovi{
    String name;
    int dali;
    int price;
    int count;
    public Lekovi(String name,int dali,int price,int count){
        this.name=name;
        this.dali=dali;
        this.price=price;
        this.count=count;
    }
    public  Lekovi(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDali() {
        return dali;
    }

    public void setDali(int dali) {
        this.dali = dali;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public String toString() {
        String s = this.name + "\n";
        if(this.dali == 1)
            s += "POZ\n";
        else
            s += "NEG\n";
        s += this.price + "\n" + this.count;
        return s;
    }
    public boolean daliIma(int counter){
        if(count>=counter)
            return true;
        return false;
    }
    public void buyItem(int items){
        this.count -=items;
    }
}

class LekName{
    String name;

    public LekName(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private int ASCII(char c) {
        return (int)c;
    }
    public int hashCode() {
        return (29*(29*(29*0+ASCII(name.charAt(0)))+ASCII(name.charAt(1)))+ASCII(name.charAt(2)))%102780;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LekName other = (LekName) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}

public class Apteka {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Hashtable<LekName,Lekovi> table = new Hashtable<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++){
            String [] pom = br.readLine().split(" ");
            Lekovi lekovi = new Lekovi(pom[0].toUpperCase(),parseInt(pom[1]),parseInt(pom[2]),parseInt(pom[3]));
            table.put(new LekName(pom[0].toUpperCase()),lekovi);
        }
        String name = null;
        int count = 0;
        while (true){
            count++;
            name = br.readLine();
            if(name.equals("KRAJ"))
                break;
            LekName lekName = new LekName(name.toUpperCase());
            int howMany = parseInt(br.readLine());
            Lekovi lekovi = table.get(lekName);
            if(!table.containsKey(lekName)){
                System.out.println("Nemav tako lek");
                continue;
            }
            if(lekovi.daliIma(howMany)){
                System.out.println(lekovi);
                System.out.println("Napravena naracka");
                lekovi.buyItem(howMany);
            }else{
                System.out.println(lekovi);
                System.out.println("Nemav dovolno lekovi");
                continue;
            }

        }
    }
}
