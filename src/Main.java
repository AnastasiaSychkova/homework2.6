import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> str = new ArrayList<>(List.of("one", "one","two","one","one"));
        // task1(nums);
        //task2(nums);
        //task3(str);
        task4(str);
    }

    private static void task1(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (!isEven(nums.get(i))) {
                System.out.println(nums.get(i));
            }
        }
    }

    private static void task2(List<Integer> nums) {
        Collections.sort(nums);
        Set<Integer> numSet = new HashSet<>(nums);
        for (Integer num : numSet) {
            if (isEven(num)) {
                System.out.println(num);
            }
        }
    }
    public static void task3(List<String> strings){
        Set<String> str = new HashSet<>(strings);
        System.out.println(str);
    }
    public static void task4(List<String> strings) {
        Map<String, Integer> countStringByString = new HashMap<>();
        for (String str : strings) {
            if (countStringByString.get(str) == null) {
                countStringByString.put(str, 1);
            } else {
                countStringByString.put(str, countStringByString.get(str) + 1);
            }
        }
        System.out.println(countStringByString);
    }

    private static boolean isEven(Integer num) {
        return num % 2 == 0;
    }
}
