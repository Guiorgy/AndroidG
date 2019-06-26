package guiorgy.javag.util;

public interface List<E> extends java.util.List<E> {
    /**
     * Returns an array containing primitive equivalent of all of the
     * elements in this list in proper sequence (from first to last element);
     * The runtime type of the returned array is that of the specified array.
     * If the list fits in the specified array, it is returned therein.
     * Otherwise, a new array is allocated with the runtime type of the
     * specified array and the size of this list.
     *
     * <p>If the list fits in the specified array with room to spare (i.e.,
     * the array has more elements than the list), the elements in the array
     * following the end of the list are set to 0.
     *
     * <p>Like the {@link #toArray(Object[])} method, this method acts as
     * bridge between array-based and collection-based APIs.  Further, this
     * method allows the return of primitive type arrays.
     *
     * @param byteArray The array into which the equivalent primitives of the
     *                  elements of this list are to be stored, if it is big
     *                  enough; otherwise, a new array of the same runtime
     *                  type is allocated for this purpose.
     * @return An array containing the equivalent primitives the elements
     * of this list
     * @throws ArrayStoreException  If the runtime type of the specified array
     *                              is not an equivalent primitive of the
     *                              runtime type of every element in this list
     * @throws NullPointerException If the specified array is null
     */
    default byte[] toArray(byte[] byteArray) throws ArrayStoreException, NullPointerException {
        final int size = size();
        if (size == 0) {
            return new byte[0];
        }
        if (byteArray.length < size) {
            byteArray = new byte[size];
        }
        final Object elem = get(0);
        if (!(elem instanceof Byte)) {
            throw new ArrayStoreException(elem.getClass().getName() + " does not extend " + Byte.class.getName());
        }
        if (byteArray.length > size) {
            for (int index = size; index < byteArray.length; ++index) {
                byteArray[index] = 0;
            }
        }
        byteArray[0] = (byte) elem;
        for (int index = 1; index < size; ++index) {
            byteArray[index++] = (byte) get(index);
        }
        return byteArray;
    }

    /**
     * Returns an array containing primitive equivalent of all of the
     * elements in this list in proper sequence (from first to last element);
     * The runtime type of the returned array is that of the specified array.
     * If the list fits in the specified array, it is returned therein.
     * Otherwise, a new array is allocated with the runtime type of the
     * specified array and the size of this list.
     *
     * <p>If the list fits in the specified array with room to spare (i.e.,
     * the array has more elements than the list), the elements in the array
     * following the end of the list are set to 0.
     *
     * <p>Like the {@link #toArray(Object[])} method, this method acts as
     * bridge between array-based and collection-based APIs.  Further, this
     * method allows the return of primitive type arrays.
     *
     * @param shortArray The array into which the equivalent primitives of the
     *                  elements of this list are to be stored, if it is big
     *                  enough; otherwise, a new array of the same runtime
     *                  type is allocated for this purpose.
     * @return An array containing the equivalent primitives the elements
     * of this list
     * @throws ArrayStoreException  If the runtime type of the specified array
     *                              is not an equivalent primitive of the
     *                              runtime type of every element in this list
     * @throws NullPointerException If the specified array is null
     */
    default short[] toArray(short[] shortArray) throws ArrayStoreException, NullPointerException {
        final int size = size();
        if (size == 0) {
            return new short[0];
        }
        if (shortArray.length < size) {
            shortArray = new short[size];
        }
        final Object elem = get(0);
        if (!(elem instanceof Short)) {
            throw new ArrayStoreException(elem.getClass().getName() + " does not extend " + Short.class.getName());
        }
        if (shortArray.length > size) {
            for (int index = size; index < shortArray.length; ++index) {
                shortArray[index] = 0;
            }
        }
        shortArray[0] = (short) elem;
        for (int index = 1; index < size; ++index) {
            shortArray[index++] = (short) get(index);
        }
        return shortArray;
    }

    /**
     * Returns an array containing primitive equivalent of all of the
     * elements in this list in proper sequence (from first to last element);
     * The runtime type of the returned array is that of the specified array.
     * If the list fits in the specified array, it is returned therein.
     * Otherwise, a new array is allocated with the runtime type of the
     * specified array and the size of this list.
     *
     * <p>If the list fits in the specified array with room to spare (i.e.,
     * the array has more elements than the list), the elements in the array
     * following the end of the list are set to 0.
     *
     * <p>Like the {@link #toArray(Object[])} method, this method acts as
     * bridge between array-based and collection-based APIs.  Further, this
     * method allows the return of primitive type arrays.
     *
     * @param intArray The array into which the equivalent primitives of the
     *                  elements of this list are to be stored, if it is big
     *                  enough; otherwise, a new array of the same runtime
     *                  type is allocated for this purpose.
     * @return An array containing the equivalent primitives the elements
     * of this list
     * @throws ArrayStoreException  If the runtime type of the specified array
     *                              is not an equivalent primitive of the
     *                              runtime type of every element in this list
     * @throws NullPointerException If the specified array is null
     */
    default int[] toArray(int[] intArray) throws ArrayStoreException, NullPointerException {
        final int size = size();
        if (size == 0) {
            return new int[0];
        }
        if (intArray.length < size) {
            intArray = new int[size];
        }
        final Object elem = get(0);
        if (!(elem instanceof Integer)) {
            throw new ArrayStoreException(elem.getClass().getName() + " does not extend " + Integer.class.getName());
        }
        if (intArray.length > size) {
            for (int index = size; index < intArray.length; ++index) {
                intArray[index] = 0;
            }
        }
        intArray[0] = (int) elem;
        for (int index = 1; index < size; ++index) {
            intArray[index++] = (int) get(index);
        }
        return intArray;
    }

    /**
     * Returns an array containing primitive equivalent of all of the
     * elements in this list in proper sequence (from first to last element);
     * The runtime type of the returned array is that of the specified array.
     * If the list fits in the specified array, it is returned therein.
     * Otherwise, a new array is allocated with the runtime type of the
     * specified array and the size of this list.
     *
     * <p>If the list fits in the specified array with room to spare (i.e.,
     * the array has more elements than the list), the elements in the array
     * following the end of the list are set to 0.
     *
     * <p>Like the {@link #toArray(Object[])} method, this method acts as
     * bridge between array-based and collection-based APIs.  Further, this
     * method allows the return of primitive type arrays.
     *
     * @param longArray The array into which the equivalent primitives of the
     *                  elements of this list are to be stored, if it is big
     *                  enough; otherwise, a new array of the same runtime
     *                  type is allocated for this purpose.
     * @return An array containing the equivalent primitives the elements
     * of this list
     * @throws ArrayStoreException  If the runtime type of the specified array
     *                              is not an equivalent primitive of the
     *                              runtime type of every element in this list
     * @throws NullPointerException If the specified array is null
     */
    default long[] toArray(long[] longArray) throws ArrayStoreException, NullPointerException {
        final int size = size();
        if (size == 0) {
            return new long[0];
        }
        if (longArray.length < size) {
            longArray = new long[size];
        }
        final Object elem = get(0);
        if (!(elem instanceof Long)) {
            throw new ArrayStoreException(elem.getClass().getName() + " does not extend " + Long.class.getName());
        }
        if (longArray.length > size) {
            for (int index = size; index < longArray.length; ++index) {
                longArray[index] = 0;
            }
        }
        longArray[0] = (long) elem;
        for (int index = 1; index < size; ++index) {
            longArray[index++] = (long) get(index);
        }
        return longArray;
    }

    /**
     * Returns an array containing primitive equivalent of all of the
     * elements in this list in proper sequence (from first to last element);
     * The runtime type of the returned array is that of the specified array.
     * If the list fits in the specified array, it is returned therein.
     * Otherwise, a new array is allocated with the runtime type of the
     * specified array and the size of this list.
     *
     * <p>If the list fits in the specified array with room to spare (i.e.,
     * the array has more elements than the list), the elements in the array
     * following the end of the list are set to 0.
     *
     * <p>Like the {@link #toArray(Object[])} method, this method acts as
     * bridge between array-based and collection-based APIs.  Further, this
     * method allows the return of primitive type arrays.
     *
     * @param floatArray The array into which the equivalent primitives of the
     *                  elements of this list are to be stored, if it is big
     *                  enough; otherwise, a new array of the same runtime
     *                  type is allocated for this purpose.
     * @return An array containing the equivalent primitives the elements
     * of this list
     * @throws ArrayStoreException  If the runtime type of the specified array
     *                              is not an equivalent primitive of the
     *                              runtime type of every element in this list
     * @throws NullPointerException If the specified array is null
     */
    default float[] toArray(float[] floatArray) throws ArrayStoreException, NullPointerException {
        final int size = size();
        if (size == 0) {
            return new float[0];
        }
        if (floatArray.length < size) {
            floatArray = new float[size];
        }
        final Object elem = get(0);
        if (!(elem instanceof Float)) {
            throw new ArrayStoreException(elem.getClass().getName() + " does not extend " + Float.class.getName());
        }
        if (floatArray.length > size) {
            for (int index = size; index < floatArray.length; ++index) {
                floatArray[index] = 0;
            }
        }
        floatArray[0] = (float) elem;
        for (int index = 1; index < size; ++index) {
            floatArray[index++] = (float) get(index);
        }
        return floatArray;
    }

    /**
     * Returns an array containing primitive equivalent of all of the
     * elements in this list in proper sequence (from first to last element);
     * The runtime type of the returned array is that of the specified array.
     * If the list fits in the specified array, it is returned therein.
     * Otherwise, a new array is allocated with the runtime type of the
     * specified array and the size of this list.
     *
     * <p>If the list fits in the specified array with room to spare (i.e.,
     * the array has more elements than the list), the elements in the array
     * following the end of the list are set to 0.
     *
     * <p>Like the {@link #toArray(Object[])} method, this method acts as
     * bridge between array-based and collection-based APIs.  Further, this
     * method allows the return of primitive type arrays.
     *
     * @param doubleArray The array into which the equivalent primitives of the
     *                  elements of this list are to be stored, if it is big
     *                  enough; otherwise, a new array of the same runtime
     *                  type is allocated for this purpose.
     * @return An array containing the equivalent primitives the elements
     * of this list
     * @throws ArrayStoreException  If the runtime type of the specified array
     *                              is not an equivalent primitive of the
     *                              runtime type of every element in this list
     * @throws NullPointerException If the specified array is null
     */
    default double[] toArray(double[] doubleArray) throws ArrayStoreException, NullPointerException {
        final int size = size();
        if (size == 0) {
            return new double[0];
        }
        if (doubleArray.length < size) {
            doubleArray = new double[size];
        }
        final Object elem = get(0);
        if (!(elem instanceof Double)) {
            throw new ArrayStoreException(elem.getClass().getName() + " does not extend " + Double.class.getName());
        }
        if (doubleArray.length > size) {
            for (int index = size; index < doubleArray.length; ++index) {
                doubleArray[index] = 0;
            }
        }
        doubleArray[0] = (double) elem;
        for (int index = 1; index < size; ++index) {
            doubleArray[index++] = (double) get(index);
        }
        return doubleArray;
    }

    /**
     * Returns an array containing primitive equivalent of all of the
     * elements in this list in proper sequence (from first to last element);
     * The runtime type of the returned array is that of the specified array.
     * If the list fits in the specified array, it is returned therein.
     * Otherwise, a new array is allocated with the runtime type of the
     * specified array and the size of this list.
     *
     * <p>If the list fits in the specified array with room to spare (i.e.,
     * the array has more elements than the list), the elements in the array
     * following the end of the list are set to false.
     *
     * <p>Like the {@link #toArray(Object[])} method, this method acts as
     * bridge between array-based and collection-based APIs.  Further, this
     * method allows the return of primitive type arrays.
     *
     * @param booleanArray The array into which the equivalent primitives of the
     *                  elements of this list are to be stored, if it is big
     *                  enough; otherwise, a new array of the same runtime
     *                  type is allocated for this purpose.
     * @return An array containing the equivalent primitives the elements
     * of this list
     * @throws ArrayStoreException  If the runtime type of the specified array
     *                              is not an equivalent primitive of the
     *                              runtime type of every element in this list
     * @throws NullPointerException If the specified array is null
     */
    default boolean[] toArray(boolean[] booleanArray) throws ArrayStoreException, NullPointerException {
        final int size = size();
        if (size == 0) {
            return new boolean[0];
        }
        if (booleanArray.length < size) {
            booleanArray = new boolean[size];
        }
        final Object elem = get(0);
        if (!(elem instanceof Boolean)) {
            throw new ArrayStoreException(elem.getClass().getName() + " does not extend " + Boolean.class.getName());
        }
        if (booleanArray.length > size) {
            for (int index = size; index < booleanArray.length; ++index) {
                booleanArray[index] = false;
            }
        }
        booleanArray[0] = (boolean) elem;
        for (int index = 1; index < size; ++index) {
            booleanArray[index++] = (boolean) get(index);
        }
        return booleanArray;
    }

    /**
     * Returns an array containing primitive equivalent of all of the
     * elements in this list in proper sequence (from first to last element);
     * The runtime type of the returned array is that of the specified array.
     * If the list fits in the specified array, it is returned therein.
     * Otherwise, a new array is allocated with the runtime type of the
     * specified array and the size of this list.
     *
     * <p>If the list fits in the specified array with room to spare (i.e.,
     * the array has more elements than the list), the elements in the array
     * following the end of the list are set to 0.
     *
     * <p>Like the {@link #toArray(Object[])} method, this method acts as
     * bridge between array-based and collection-based APIs.  Further, this
     * method allows the return of primitive type arrays.
     *
     * @param charArray The array into which the equivalent primitives of the
     *                  elements of this list are to be stored, if it is big
     *                  enough; otherwise, a new array of the same runtime
     *                  type is allocated for this purpose.
     * @return An array containing the equivalent primitives the elements
     * of this list
     * @throws ArrayStoreException  If the runtime type of the specified array
     *                              is not an equivalent primitive of the
     *                              runtime type of every element in this list
     * @throws NullPointerException If the specified array is null
     */
    default char[] toArray(char[] charArray) throws ArrayStoreException, NullPointerException {
        final int size = size();
        if (size == 0) {
            return new char[0];
        }
        if (charArray.length < size) {
            charArray = new char[size];
        }
        final Object elem = get(0);
        if (!(elem instanceof Character)) {
            throw new ArrayStoreException(elem.getClass().getName() + " does not extend " + Character.class.getName());
        }
        if (charArray.length > size) {
            for (int index = size; index < charArray.length; ++index) {
                charArray[index] = 0;
            }
        }
        charArray[0] = (char) elem;
        for (int index = 1; index < size; ++index) {
            charArray[index++] = (char) get(index);
        }
        return charArray;
    }
}
