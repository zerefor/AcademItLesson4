public class CycleFor {
    public static void multiplicity_4(int end) {
        if (end % 4 == 0) {
            System.out.println(end + "");
        }
    }

    public static void main(String[] args) {
        for (int end = 100; end >= 1; end--) {
            multiplicity_4(end);
        }
    }
}