package Algodatkelas;

public class ChangeArrayLength {

    public static Object[][] changeLength2D(Object[][] a, int n, int m, int newLength, int newLength2) {

        if (n > newLength) {
            throw new IllegalArgumentException("new length is too small");
        }
        if (m > newLength2) {
            throw new IllegalArgumentException("new length 2 is too small");
        }
        if (a != null) {
            Object[][] copy = new Object[newLength][newLength2];
            for (int i = 0; i < a.length; i++) {
                final Object[] ab = (Object[]) a[i];
                copy[i] = new Object[newLength2];
                System.arraycopy(ab, 0, copy[i], 0, ab.length);
            }
            return copy;
        }
        return null;
    }

// semua array akan di copy ke array yg baru
    public static Object[][] changeLength2D(Object[][] a, int newLength, int newLength2) {
        return changeLength2D(a, a.length, a[0].length, newLength, newLength2);
    }

}
