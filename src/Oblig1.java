import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

    public static int maks (int[] a) {
        if (a.length < 1) {
            throw new NoSuchElementException("Tabellen a er tom!");
        }
        int n = a.length;
        int maks = 0;
        for (int i = 0; i <n-1; i++) {
            if (a[i] > a[i+1]) {
                bytt(a, i, i+1);
                System.out.println("Inversjon" + i);
                maks = a[a.length-1];
            }
        }
        return maks;
    }

    public static void bytt (int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


// For testing, husk å slette denne! :
    public static void main(String[] args) {
        int[] a = {1,10,3,5,2};
        System.out.println(Arrays.toString(a));

        maks(a);
        System.out.print("Etter sortering: " + Arrays.toString(a));
        System.out.println(maks(a));
    }
}