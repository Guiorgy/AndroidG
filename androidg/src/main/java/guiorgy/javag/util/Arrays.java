package guiorgy.javag.util;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Convert2Diamond")
public class Arrays { // java.util.Arrays
    private Arrays() {
    }

    /**
     *  Convert array of objects to a Lists of objects
     */
    @SafeVarargs
    @SuppressWarnings("varargs")
    public static <T> List<T> asList(T... objects){
        return java.util.Arrays.asList(objects);
    }

    /**
     *  Convert array of primitive type byte to a Lists of {@link Byte}
     */
    public static List<Byte> asList(final byte[] byteArray) {
        final List<Byte> list = new ArrayList<Byte>(byteArray.length);
        for (byte b : byteArray) {
            list.add(b);
        }
        return list;
    }

    /**
     *  Convert array of primitive type short to a Lists of {@link Short}
     */
    public static List<Short> asList(final short[] shortArray) {
        final List<Short> list = new ArrayList<Short>(shortArray.length);
        for (short s : shortArray) {
            list.add(s);
        }
        return list;
    }

    /**
     *  Convert array of primitive type int to a Lists of {@link Integer}
     */
    public static List<Integer> asList(final int[] intArray) {
        final List<Integer> list = new ArrayList<Integer>(intArray.length);
        for (int i : intArray) {
            list.add(i);
        }
        return list;
    }

    /**
     *  Convert array of primitive type long to a Lists of {@link Long}
     */
    public static List<Long> asList(final long[] longArray) {
        final List<Long> list = new ArrayList<Long>(longArray.length);
        for (long l : longArray) {
            list.add(l);
        }
        return list;
    }

    /**
     *  Convert array of primitive type float to a Lists of {@link Float}
     */
    public static List<Float> asList(final float[] floatArray) {
        final List<Float> list = new ArrayList<Float>(floatArray.length);
        for (float f : floatArray) {
            list.add(f);
        }
        return list;
    }

    /**
     *  Convert array of primitive type double to a Lists of {@link Double}
     */
    public static List<Double> asList(final double[] doubleArray) {
        final List<Double> list = new ArrayList<Double>(doubleArray.length);
        for (double d : doubleArray) {
            list.add(d);
        }
        return list;
    }

    /**
     *  Convert array of primitive type boolean to a Lists of {@link Boolean}
     */
    public static List<Boolean> asList(final boolean[] booleanArray) {
        final List<Boolean> list = new ArrayList<Boolean>(booleanArray.length);
        for (boolean b : booleanArray) {
            list.add(b);
        }
        return list;
    }

    /**
     *  Convert array of primitive type char to a Lists of {@link Character}
     */
    public static List<Character> asList(final char[] charArray) {
        final List<Character> list = new ArrayList<Character>(charArray.length);
        for (char c : charArray) {
            list.add(c);
        }
        return list;
    }
}
