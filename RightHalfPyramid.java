public class RightHalfPyramid {
    public static void main(String[] args) {
        int rows = 6;

       
        System.out.println("Right Half Pyramid:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        
        System.out.println();

       
        System.out.println("Number Pattern:");
        int num = 1;
        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;

                if (num > 9) {
                    num = 1;
                }
            }
            System.out.println();
        }
    }
}