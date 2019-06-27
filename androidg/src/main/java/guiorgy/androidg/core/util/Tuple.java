package guiorgy.androidg.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static guiorgy.androidg.utils.API.nullSafeEquals;

@SuppressWarnings({"NullableProblems", "WeakerAccess", "unused"})
public class Tuple<T1, T2, T3, T4, T5, T6, T7, T8> implements Comparable<Tuple> {
    protected static final String TAG = Tuple.class.getSimpleName();

    @Nullable
    public final T1 first;
    @Nullable
    public final T2 second;
    @Nullable
    public final T3 third;
    @Nullable
    public final T4 fourth;
    @Nullable
    public final T5 fifth;
    @Nullable
    public final T6 sixth;
    @Nullable
    public final T7 seventh;
    @Nullable
    public final T8 eighth;

    protected final int length;

    // region constructors
    public <E1 extends T1>
    Tuple(E1 first) {
        this.first = first;
        this.second = null;
        this.third = null;
        this.fourth = null;
        this.fifth = null;
        this.sixth = null;
        this.seventh = null;
        this.eighth = null;
        this.length = 1;
    }

    public <E1 extends T1, E2 extends T2>
    Tuple(E1 first, E2 second) {
        this.first = first;
        this.second = second;
        this.third = null;
        this.fourth = null;
        this.fifth = null;
        this.sixth = null;
        this.seventh = null;
        this.eighth = null;
        this.length = 2;
    }

    public <E1 extends T1, E2 extends T2, E3 extends T3>
    Tuple(E1 first, E2 second, E3 third) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = null;
        this.fifth = null;
        this.sixth = null;
        this.seventh = null;
        this.eighth = null;
        this.length = 3;
    }

    public <E1 extends T1, E2 extends T2, E3 extends T3, E4 extends T4>
    Tuple(E1 first, E2 second, E3 third, E4 fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = null;
        this.sixth = null;
        this.seventh = null;
        this.eighth = null;
        this.length = 4;
    }

    public <E1 extends T1, E2 extends T2, E3 extends T3, E4 extends T4, E5 extends T5>
    Tuple(E1 first, E2 second, E3 third, E4 fourth, E5 fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = null;
        this.seventh = null;
        this.eighth = null;
        this.length = 5;
    }

    public <E1 extends T1, E2 extends T2, E3 extends T3, E4 extends T4, E5 extends T5, E6 extends T6>
    Tuple(E1 first, E2 second, E3 third, E4 fourth, E5 fifth, E6 sixth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = null;
        this.eighth = null;
        this.length = 6;
    }

    public <E1 extends T1, E2 extends T2, E3 extends T3, E4 extends T4, E5 extends T5, E6 extends T6, E7 extends T7>
    Tuple(E1 first, E2 second, E3 third, E4 fourth, E5 fifth, E6 sixth, E7 seventh) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eighth = null;
        this.length = 7;
    }

    public <E1 extends T1, E2 extends T2, E3 extends T3, E4 extends T4, E5 extends T5, E6 extends T6, E7 extends T7, E8 extends T8>
    Tuple(E1 first, E2 second, E3 third, E4 fourth, E5 fifth, E6 sixth, E7 seventh, E8 eighth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eighth = eighth;
        this.length = 8;
    }
    // endregion

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Tuple)) return false;
        Tuple<?, ?, ?, ?, ?, ?, ?, ?> tuple = (Tuple<?, ?, ?, ?, ?, ?, ?, ?>) other;
        return length == tuple.length &&
            nullSafeEquals(first, tuple.first) &&
            nullSafeEquals(second, tuple.second) &&
            nullSafeEquals(third, tuple.third) &&
            nullSafeEquals(fourth, tuple.fourth) &&
            nullSafeEquals(fifth, tuple.fifth) &&
            nullSafeEquals(sixth, tuple.sixth) &&
            nullSafeEquals(seventh, tuple.seventh) &&
            nullSafeEquals(eighth, tuple.eighth);
    }

    @SuppressWarnings("unchecked")
    @Override
    public int compareTo(Tuple other) throws NullPointerException, ClassCastException {
        if (this == other) return 0;
        if (other == null) throw new NullPointerException();
        int result = 0;
        switch (length) {
            case 8:
                if (eighth == null)
                    throw new NullPointerException();
                if (!(eighth instanceof Comparable))
                    throw new ClassCastException("Must implement Comparable");
                result += ((Comparable) eighth).compareTo(other.eighth);
            case 7:
                if (seventh == null)
                    throw new NullPointerException();
                if (!(seventh instanceof Comparable))
                    throw new ClassCastException("Must implement Comparable");
                result += (1 << 1) * ((Comparable) seventh).compareTo(other.seventh);
            case 6:
                if (sixth == null)
                    throw new NullPointerException();
                if (!(sixth instanceof Comparable))
                    throw new ClassCastException("Must implement Comparable");
                result += (1 << 2) * ((Comparable) sixth).compareTo(other.sixth);
            case 5:
                if (fifth == null)
                    throw new NullPointerException();
                if (!(fifth instanceof Comparable))
                    throw new ClassCastException("Must implement Comparable");
                result += (1 << 3) * ((Comparable) fifth).compareTo(other.fifth);
            case 4:
                if (fourth == null)
                    throw new NullPointerException();
                if (!(fourth instanceof Comparable))
                    throw new ClassCastException("Must implement Comparable");
                result += (1 << 4) * ((Comparable) fourth).compareTo(other.fourth);
            case 3:
                if (third == null)
                    throw new NullPointerException();
                if (!(third instanceof Comparable))
                    throw new ClassCastException("Must implement Comparable");
                result += (1 << 5) * ((Comparable) third).compareTo(other.third);
            case 2:
                if (second == null)
                    throw new NullPointerException();
                if (!(second instanceof Comparable))
                    throw new ClassCastException("Must implement Comparable");
                result += (1 << 6) * ((Comparable) second).compareTo(other.second);
            case 1:
                if (first == null)
                    throw new NullPointerException();
                if (!(first instanceof Comparable))
                    throw new ClassCastException("Must implement Comparable");
                result += (1 << 7) * ((Comparable) first).compareTo(other.first);
                break;
            default:
                throw new RuntimeException();
        }
        return result;
    }

    @Override
    public int hashCode() throws IndexOutOfBoundsException {
        int hashCode = first == null ? 0 : first.hashCode();
        if (length > 1) {
            hashCode = combineHashCodes(hashCode, second == null ? 0 : second.hashCode());
            if (length > 2) {
                hashCode = combineHashCodes(hashCode, third == null ? 0 : third.hashCode());
                if (length > 3) {
                    hashCode = combineHashCodes(hashCode, fourth == null ? 0 : fourth.hashCode());
                    if (length > 4) {
                        hashCode = combineHashCodes(hashCode, fifth == null ? 0 : fifth.hashCode());
                        if (length > 5) {
                            hashCode = combineHashCodes(hashCode, sixth == null ? 0 : sixth.hashCode());
                            if (length > 6) {
                                hashCode = combineHashCodes(hashCode, seventh == null ? 0 : seventh.hashCode());
                                if (length > 7) {
                                    hashCode = combineHashCodes(hashCode, eighth == null ? 0 : eighth.hashCode());
                                }
                            }
                        }
                    }
                }
            }
        }
        return hashCode;
    }

    protected static int combineHashCodes(int first, int second) {
        return (((first << 5) + first) ^ second);
    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Tuple{first=");
        return toString(builder);
    }

    @NonNull
    protected String toString(StringBuilder builder) {
        builder.append(first);
        if (length > 1) {
            builder.append(", second=")
                .append(second);
            if (length > 2) {
                builder.append(", third=")
                    .append(third);
                if (length > 3) {
                    builder.append(", fourth=")
                        .append(fourth);
                    if (length > 4) {
                        builder.append(", fifth=")
                            .append(fifth);
                        if (length > 5) {
                            builder.append(", sixth=")
                                .append(sixth);
                            if (length > 6) {
                                builder.append(", seventh=")
                                    .append(seventh);
                                if (length > 7) {
                                    builder.append(", eighth=")
                                        .append(eighth);
                                }
                            }
                        }
                    }
                }
            }
        }
        return builder.append('}').toString();
    }

    @Nullable
    public Object get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Length: " + length + ", Requested index: " + index);
        }
        switch (index) {
            case 0:
                return first;
            case 1:
                return second;
            case 2:
                return third;
            case 3:
                return fourth;
            case 4:
                return fifth;
            case 5:
                return sixth;
            case 6:
                return seventh;
            case 7:
                return eighth;
            default:
                throw new IndexOutOfBoundsException("Length: " + length + ", Requested index: " + index);
        }
    }
}
