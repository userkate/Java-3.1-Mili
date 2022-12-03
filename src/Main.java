public class Main {
    public static void main(String[] args) {
        int prise = 1005;
        int mili;

        if (prise >= 20) {
            mili = 1;
        } else {
            mili = 0;
        }
        int bonusMili = prise / 20 * mili;

        System.out.println(bonusMili);
    }

}
