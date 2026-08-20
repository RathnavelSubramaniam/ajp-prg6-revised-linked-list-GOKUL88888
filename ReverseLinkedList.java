import java.util.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {

        LinkedList<Character> originalList = new LinkedList<>();

        // Add characters A to J
        for (char c = 'A'; c <= 'J'; c++) {
            originalList.add(c);
        }

        // Print the original list
        System.out.println("Original LinkedList:");
        for (char c : originalList) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Create a new linked list for reversed elements
        LinkedList<Character> reversedList = new LinkedList<>();

        // Copy elements in reverse order
        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        // Print the reversed list
        System.out.println("Reversed LinkedList:");
        for (char c : reversedList) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}