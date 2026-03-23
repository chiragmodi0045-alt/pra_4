public class FullPyramid {
    public static void main(String[] args) {
        int rows = 5;

       
        System.out.println("Alphabet Pyramid:");

        for (int i = 1; i <= rows; i++) {
            char ch = 'A';

          
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

           
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }

       
        System.out.println();

       
        System.out.println("Star Pyramid:");

        for (int i = rows; i >= 1; i--) {

           
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            
            for (int star = 0; star < i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}