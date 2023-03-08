public class Loop {
    public static boolean multiplicity(int end) {
        return end % 4 == 0;
    }

    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (multiplicity(i))
                System.out.println(i);
        }
    }
}