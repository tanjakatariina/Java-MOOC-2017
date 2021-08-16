public class ParillisetLuvut {

    public static void main(String[] args) {
        int luku = 1;
        int loppuLuku = 100;

        while (luku <= loppuLuku) {
            if (luku % 2 == 0) {
                System.out.println(luku);
            }
            luku++;
        }
    }
}