package guiorgy.androidg.utils;

public class API {
    private API() {
    }

    public static boolean nullSafeEquals(Object a, Object b) {
        //noinspection EqualsReplaceableByObjectsCall
        return (a == b) || (a != null && a.equals(b));
    }
}
