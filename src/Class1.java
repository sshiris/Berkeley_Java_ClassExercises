public class Class1 {

    public void drawTriangle(int n) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append("*");
            System.out.println(sb);
        }

    }

    public static int max(int[] m) {
        int max = 0;
        for (int i : m) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void windowPosSum(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                continue;
            }
            // my way, well, not the best, chatpgt won!
            /*
             * if (i + n < a.length) {
             * for (int j = 1; j < n + 1; j++) {
             * a[i] += a[i + j];
             * }
             * } else {
             * for (int k = 1; k < a.length - i; k++) {
             * a[i] += a[i + k];
             * }
             * }
             */

            // from chatgpt after my training
            /*
             * int sum = 0;
             * for (int j = i; j <=Math.min(i + n, a.length-1) ; j++) {
             * sum += a[j];
             * }
             * a[i] = sum;
             */

            // from chatgpt orginal
            int sum = 0;
            for (int j = i; j <= i + n; j++) {
                if (j >= a.length) {
                    break;
                }
                sum += a[j];
            }
            a[i] = sum;

        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, -3, 4, 5, 4 };
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));

    }
}
