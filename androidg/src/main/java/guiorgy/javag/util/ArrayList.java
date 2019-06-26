package guiorgy.javag.util;

public class ArrayList<E> extends java.util.ArrayList<E> implements List<E> {
    @Override
    public byte[] toArray(byte[] byteArray) {
        final int size = size();
        if (size == 0) {
            return new byte[0];
        }

        if (byteArray.length < size) {
            byteArray = new byte[size];
        }
        final Object elem = get(0);
        if (!Byte.class.isAssignableFrom(elem.getClass())) {
            throw new IllegalArgumentException(elem.getClass().getName() + " does not extend " + Byte.class.getName());
        }
        if (byteArray.length > size) {
            for (int index = size; index < byteArray.length; ++index) {
                byteArray[index] = 0;
            }
        }
        for (int index = 0; index < size; ++index) {
            byteArray[index++] = (Byte) get(index);
        }
        return byteArray;
    }

    @Override
    public short[] toArray(short[] shortArray) {
        final int size = size();
        if (size == 0) {
            return new short[0];
        }

        if (shortArray.length < size) {
            shortArray = new short[size];
        }
        final Object elem = get(0);
        if (!Short.class.isAssignableFrom(elem.getClass())) {
            throw new IllegalArgumentException(elem.getClass().getName() + " does not extend " + Short.class.getName());
        }
        if (shortArray.length > size) {
            for (int index = size; index < shortArray.length; ++index) {
                shortArray[index] = 0;
            }
        }
        for (int index = 0; index < size; ++index) {
            shortArray[index++] = (Short) get(index);
        }
        return shortArray;
    }

    @Override
    public int[] toArray(int[] intArray) {
        final int size = size();
        if (size == 0) {
            return new int[0];
        }

        if (intArray.length < size) {
            intArray = new int[size];
        }
        final Object elem = get(0);
        if (!Integer.class.isAssignableFrom(elem.getClass())) {
            throw new IllegalArgumentException(elem.getClass().getName() + " does not extend " + Integer.class.getName());
        }
        if (intArray.length > size) {
            for (int index = size; index < intArray.length; ++index) {
                intArray[index] = 0;
            }
        }
        for (int index = 0; index < size; ++index) {
            intArray[index++] = (Integer) get(index);
        }
        return intArray;
    }

    @Override
    public long[] toArray(long[] longArray) {
        final int size = size();
        if (size == 0) {
            return new long[0];
        }

        if (longArray.length < size) {
            longArray = new long[size];
        }
        final Object elem = get(0);
        if (!Long.class.isAssignableFrom(elem.getClass())) {
            throw new IllegalArgumentException(elem.getClass().getName() + " does not extend " + Long.class.getName());
        }
        if (longArray.length > size) {
            for (int index = size; index < longArray.length; ++index) {
                longArray[index] = 0;
            }
        }
        for (int index = 0; index < size; ++index) {
            longArray[index++] = (Long) get(index);
        }
        return longArray;
    }

    @Override
    public float[] toArray(float[] floatArray) {
        final int size = size();
        if (size == 0) {
            return new float[0];
        }

        if (floatArray.length < size) {
            floatArray = new float[size];
        }
        final Object elem = get(0);
        if (!Float.class.isAssignableFrom(elem.getClass())) {
            throw new IllegalArgumentException(elem.getClass().getName() + " does not extend " + Float.class.getName());
        }
        if (floatArray.length > size) {
            for (int index = size; index < floatArray.length; ++index) {
                floatArray[index] = 0;
            }
        }
        for (int index = 0; index < size; ++index) {
            floatArray[index++] = (Float) get(index);
        }
        return floatArray;
    }

    @Override
    public double[] toArray(double[] doubleArray) {
        final int size = size();
        if (size == 0) {
            return new double[0];
        }

        if (doubleArray.length < size) {
            doubleArray = new double[size];
        }
        final Object elem = get(0);
        if (!Double.class.isAssignableFrom(elem.getClass())) {
            throw new IllegalArgumentException(elem.getClass().getName() + " does not extend " + Double.class.getName());
        }
        if (doubleArray.length > size) {
            for (int index = size; index < doubleArray.length; ++index) {
                doubleArray[index] = 0;
            }
        }
        for (int index = 0; index < size; ++index) {
            doubleArray[index++] = (Double) get(index);
        }
        return doubleArray;
    }

    @Override
    public boolean[] toArray(boolean[] booleanArray) {
        final int size = size();
        if (size == 0) {
            return new boolean[0];
        }

        if (booleanArray.length < size) {
            booleanArray = new boolean[size];
        }
        final Object elem = get(0);
        if (!Boolean.class.isAssignableFrom(elem.getClass())) {
            throw new IllegalArgumentException(elem.getClass().getName() + " does not extend " + Boolean.class.getName());
        }
        if (booleanArray.length > size) {
            for (int index = size; index < booleanArray.length; ++index) {
                booleanArray[index] = false;
            }
        }
        for (int index = 0; index < size; ++index) {
            booleanArray[index++] = (Boolean) get(index);
        }
        return booleanArray;
    }

    @Override
    public char[] toArray(char[] charArray) {
        final int size = size();
        if (size == 0) {
            return new char[0];
        }

        if (charArray.length < size) {
            charArray = new char[size];
        }
        final Object elem = get(0);
        if (!Character.class.isAssignableFrom(elem.getClass())) {
            throw new IllegalArgumentException(elem.getClass().getName() + " does not extend " + Character.class.getName());
        }
        if (charArray.length > size) {
            for (int index = size; index < charArray.length; ++index) {
                charArray[index] = 0;
            }
        }
        for (int index = 0; index < size; ++index) {
            charArray[index++] = (Character) get(index);
        }
        return charArray;
    }
}
