package sample.Hash.Medium;

import java.util.*;
import java.util.List;

public class BrickWall {
    public static void main(String[] args) {

    }

    public static int leastBricks(List<List<Integer>> wall){
        Hashtable<Integer,Integer> table = new Hashtable<>();

        for (int i = 0; i < wall.size(); i++){
            int sum = 0;
            for (int j = 0; j < wall.get(i).size()-1; j++){
                sum += wall.get(i).get(j);
                table.put(sum,table.getOrDefault(sum,0)+1);
            }
        }

        int max = Integer.MIN_VALUE;

        for (int key : table.keySet()){
            max = Math.max(max,table.get(key));
        }
        if (max == Integer.MIN_VALUE){
            return wall.size();
        }else{
            return wall.size() - max;
        }
    }
}
