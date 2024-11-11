import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ArrayStack {
    public static void main(String[] args) {
        // Liisaska hore
        int[] list1 = {1, 2, 3, 4,7,5};
        int[] list2 = {4, 5, 6, 7};
        int[] list3 = {4, 5, 6, 7};

        // Stack
        Stack<Integer> stack = new Stack<>();

        // Isticmaal HashSet si loo saaro tirada soo laa labata
        Set<Integer> set = new HashSet<>();

        // Ku dar liiska koowaad set-ka
        for (int num : list1) {
            set.add(num);
        }

        // Ku dar liiska labaad set-ka
        for (int num : list2) {
            set.add(num);
        }
        for (int num : list3){
            set.add(num);
        }


        // Ku dar set-ka stack-ka
        for (int num : set) {
            stack.push(num);
        }

        // Daabaca stack-ka
        System.out.println(stack);

    }
}