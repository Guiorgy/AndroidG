package guiorgy.javag.util;

public interface List<E> extends java.util.List<E> {
    byte[] toArray(byte[] byteArray);
    short[] toArray(short[] shortArray);
    int[] toArray(int[] intArray);
    long[] toArray(long[] longArray);
    float[] toArray(float[] floatArray);
    double[] toArray(double[] doubleArray);
    boolean[] toArray(boolean[] booleanArray);
    char[] toArray(char[] charArray);
}
