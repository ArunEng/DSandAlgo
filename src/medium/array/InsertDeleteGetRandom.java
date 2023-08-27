package medium.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class InsertDeleteGetRandom {
    public static void main(String[] args) {
        RandomizedSet set = new RandomizedSet();
        System.out.println(set.insert(1));
        System.out.println(set.remove(2));
        System.out.println(set.insert(2));
        System.out.println(set.getRandom());
        System.out.println(set.remove(1));
        System.out.println(set.insert(2));
        System.out.println(set.getRandom());
    }
}

class RandomizedSet {

    HashSet<Integer> set;
    ArrayList<Integer> list;

    public RandomizedSet() {
        this.set = new HashSet<>();
        this.list = new ArrayList<>();
    }

    public boolean insert(int val) {
        boolean a = this.set.add(val);
        if (a) list.add(val);
        return a;
    }

    public boolean remove(int val) {
        boolean removed = this.set.remove(val);
        if (removed) this.list.remove(Integer.valueOf(val));
        return removed;
    }

    public int getRandom() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}
