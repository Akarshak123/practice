public class rightrotaion {

    public static void main(String[] args) {
        // Initialize array
        int A[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ,");
        }
        for (int n = 0; n < 3; n++) {
            System.out.println();
            int temp = A[4];
            for (int i = A.length - 1; i > 0; i--) {
                A[i] = A[i - 1];

            }

            A[0] = temp;
        }
        System.out.print("Rotated array=  ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " , ");
        }
        System.out.println();

    }
}
