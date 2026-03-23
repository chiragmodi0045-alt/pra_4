import java.util.ArrayList;

public class EvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> evenList = new ArrayList<>();
        int sum = 0;

       
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
                sum += i;
            }
        }

        // List
        System.out.println("List of Even Numbers:");
        System.out.println(evenList);

        
        System.out.print("First 3 Minimum Even Numbers: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(evenList.get(i) + " ");
        }
        System.out.println();

        System.out.print("Last 3 Maximum Even Numbers: ");
        for (int i = evenList.size() - 3; i < evenList.size(); i++) {
            System.out.print(evenList.get(i) + " ");
        }
        System.out.println();

       
        double average = (double) sum / evenList.size();
        System.out.println("Average of Even Numbers: " + average);
    }
}