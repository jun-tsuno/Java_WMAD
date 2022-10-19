import java.util.LinkedList;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {

        LinkedList<Integer> initList = new LinkedList<>();

        for(int i = 1; i <= 10; i++) {
            Random rand = new Random();
            int randNum = rand.nextInt(1,50);
            initList.add(randNum);
        }

        LinkedList<Integer> cloneList = new LinkedList<>(initList);

        initList.removeLast();
        initList.add(-5);

        System.out.println(initList);
        System.out.println(cloneList);
    }
}
