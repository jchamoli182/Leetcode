package leetcode.arrays;
import java.util.HashMap;
import java.util.Map;

public class Rabbits_in_Forest {
    public static void main (String[] args) {
        int[] answers = {10, 10, 10};
        System.out.println(numRabbits(answers));
    }
    public static int numRabbits(int[] answers) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < answers.length; i++) {
            map.put(answers[i], map.getOrDefault(answers[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int total = entry.getKey() + 1;
            int count = entry.getValue();
            int groups = (int) Math.ceil((double)count / total);
            System.out.println(groups);
            ans += groups * total;

        }
        return ans;
    }
}
