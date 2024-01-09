public class _1_ArrayDemo {
    public static void main(String[] args) {
        int[] rollNos = new int[5];
        rollNos[0] = 101;
        rollNos[1] = 102;
        rollNos[2] = 103;
        rollNos[3] = 104;
        rollNos[4] = 105;

        for (int i = 0; i < 5; i++) {
            System.out.println(rollNos[i]);
        }

        int[] newRoll = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < 5; i++) {
            System.out.println(newRoll[i]);
        }
    }
}
