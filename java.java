import java.util.Arrays;
import java.util.Stack;

public class CompactExample {
    public static void main(String[] args) {
        // Массив
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Массив: " + Arrays.toString(numbers));
        
        // Стек
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Стек: " + stack);
        
        // Извлечение из стека
        int top = stack.pop();
        System.out.println("Извлечено: " + top);
        System.out.println("Осталось: " + stack);
    }
}