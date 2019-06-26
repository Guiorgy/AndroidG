package guiorgy.androidg.core.util;

import android.util.Pair;

import androidx.annotation.NonNull;

public class Triple<F, S, T> extends Pair<F, S> {
    public final T third;

    /**
     * Constructor for a Pair.
     *
     * @param first  the first object in the Pair
     * @param second the second object in the pair
     */
    public Triple(F first, S second) {
        this(first, second, null);
    }

    /**
     * Constructor for a Triple.
     *
     * @param first  the first object in the Triple
     * @param second the second object in the Triple
     * @param third  the third object in the Triple
     */
    public Triple(F first, S second, T third) {
        super(first, second);
        this.third = third;
    }

    protected static boolean nullSafeEquals(Object a, Object b) {
        //noinspection EqualsReplaceableByObjectsCall
        return (a == b) || (a != null && a.equals(b));
    }

    /**
     * Checks the two objects for equality by delegating to their respective
     * {@link Object#equals(Object)} methods.
     *
     * @param o the {@link Triple} to which this one is to be checked for equality
     * @return true if the underlying objects of the Pair are both considered
     *         equal
     */
    @Override
    public boolean equals(Object o) {
        return (o instanceof Triple && nullSafeEquals(((Triple) o).first, first) && nullSafeEquals(((Triple) o).second, second) && nullSafeEquals(((Triple) o).third, third));
    }

    /**
     * Compute a hash code using the hash codes of the underlying objects
     *
     * @return a hashcode of the Triple
     */
    @Override
    public int hashCode() {
        return super.hashCode() ^ (third == null ? 0 : third.hashCode());
    }

    @NonNull
    @Override
    public String toString() {
        return "Triple{" + first + ", " + second + ", " + third + "}";
    }

    /**
     * @deprecated use {@link #create(Object, Object, Object)} instead
     */
    @Deprecated
    public static <A, B> Pair<A, B> create(A a, B b) {
        throw new UnsupportedOperationException();
    }

    /**
     * Convenience method for creating an appropriately typed Triple.
     *
     * @param a the first object in the Triple
     * @param b the second object in the Triple
     * @param c the third object in the Triple
     * @return a Triple that is templatized with the types of a, b and c
     */
    public static <A, B, C> Triple<A, B, C> create(A a, B b, C c) {
        return new Triple<>(a, b, c);
    }
}
