package guiorgy.androidg.core.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;

import guiorgy.androidg.BuildConfig;

import static guiorgy.androidg.utils.API.nullSafeEquals;

@SuppressWarnings({"WeakerAccess", "NullableProblems", "unused"})
public class Tuple<T1, T2, T3, T4, T5, T6, T7, T8> implements Comparable<Tuple>, Parcelable {
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
    public Tuple(T1 first) {
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

    public Tuple(T1 first, T2 second) {
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

    public Tuple(T1 first, T2 second, T3 third) {
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

    public Tuple(T1 first, T2 second, T3 third, T4 fourth) {
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

    public Tuple(T1 first, T2 second, T3 third, T4 fourth, T5 fifth) {
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

    public Tuple(T1 first, T2 second, T3 third, T4 fourth, T5 fifth, T6 sixth) {
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

    public Tuple(T1 first, T2 second, T3 third, T4 fourth, T5 fifth, T6 sixth, T7 seventh) {
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

    public Tuple(T1 first, T2 second, T3 third, T4 fourth, T5 fifth, T6 sixth, T7 seventh, T8 eighth) {
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

    @SuppressWarnings("unchecked")
    protected Tuple(Parcel in) {
        length = in.readInt();
        final Class<?>[] types = (Class<?>[]) in.readArray(Class.class.getClassLoader());
        if (types != null) {
            T1 first = null;
            T2 second = null;
            T3 third = null;
            T4 fourth = null;
            T5 fifth = null;
            T6 sixth = null;
            T7 seventh = null;
            T8 eighth = null;
            switch (length) {
                case 8:
                    if (types[7] != null)
                        eighth = in.readParcelable(types[7].getClassLoader());
                case 7:
                    if (types[6] != null)
                        seventh = in.readParcelable(types[6].getClassLoader());
                case 6:
                    if (types[5] != null)
                        sixth = in.readParcelable(types[5].getClassLoader());
                case 5:
                    if (types[4] != null)
                        fifth = in.readParcelable(types[4].getClassLoader());
                case 4:
                    if (types[3] != null)
                        fourth = in.readParcelable(types[3].getClassLoader());
                case 3:
                    if (types[2] != null)
                        third = in.readParcelable(types[2].getClassLoader());
                case 2:
                    if (types[1] != null)
                        second = in.readParcelable(types[1].getClassLoader());
                case 1:
                    if (types[0] != null)
                        first = in.readParcelable(types[0].getClassLoader());
                    break;
                default:
                    throw new RuntimeException();
            }
            switch (length) {
                case 1:
                    second = null;
                case 2:
                    third = null;
                case 3:
                    fourth = null;
                case 4:
                    fifth = null;
                case 5:
                    sixth = null;
                case 6:
                    seventh = null;
                case 7:
                    eighth = null;
                case 8:
                    break;
                default:
                    throw new RuntimeException();
            }
            this.first = first;
            this.second = second;
            this.third = third;
            this.fourth = fourth;
            this.fifth = fifth;
            this.sixth = sixth;
            this.seventh = seventh;
            this.eighth = eighth;
        } else {
            this.first = null;
            this.second = null;
            this.third = null;
            this.fourth = null;
            this.fifth = null;
            this.sixth = null;
            this.seventh = null;
            this.eighth = null;
        }
    }

    public static final Creator<Tuple> CREATOR = new Creator<Tuple>() {
        @Override
        public Tuple createFromParcel(Parcel in) {
            return new Tuple(in);
        }

        @Override
        public Tuple[] newArray(int size) {
            return new Tuple[size];
        }
    };
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(length);
        final Class<?>[] types = new Class[length];
        switch (length) {
            case 8:
                if (eighth instanceof Parcelable) {
                    dest.writeParcelable((Parcelable) eighth, flags);
                    types[7] = eighth.getClass();
                } else {
                    types[7] = null;
                    if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + eighth + " doesn't implement Parcelable");
                    if (eighth instanceof Serializable) {
                        dest.writeSerializable((Serializable) eighth);
                    } else if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + eighth + " doesn't implement Serializable either!");
                }
            case 7:
                if (seventh instanceof Parcelable) {
                    dest.writeParcelable((Parcelable) seventh, flags);
                    types[6] = seventh.getClass();
                } else {
                    types[6] = null;
                    if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + seventh + " doesn't implement Parcelable");
                    if (seventh instanceof Serializable) {
                        dest.writeSerializable((Serializable) seventh);
                    } else if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + seventh + " doesn't implement Serializable either!");
                }
            case 6:
                if (sixth instanceof Parcelable) {
                    dest.writeParcelable((Parcelable) sixth, flags);
                    types[5] = sixth.getClass();
                } else {
                    types[5] = null;
                    if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + sixth + " doesn't implement Parcelable");
                    if (sixth instanceof Serializable) {
                        dest.writeSerializable((Serializable) sixth);
                    } else if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + sixth + " doesn't implement Serializable either!");
                }
            case 5:
                if (fifth instanceof Parcelable) {
                    dest.writeParcelable((Parcelable) fifth, flags);
                    types[4] = fifth.getClass();
                } else {
                    types[4] = null;
                    if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + fifth + " doesn't implement Parcelable");
                    if (fifth instanceof Serializable) {
                        dest.writeSerializable((Serializable) fifth);
                    } else if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + fifth + " doesn't implement Serializable either!");
                }
            case 4:
                if (fourth instanceof Parcelable) {
                    dest.writeParcelable((Parcelable) fourth, flags);
                    types[3] = fourth.getClass();
                } else {
                    types[3] = null;
                    if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + fourth + " doesn't implement Parcelable");
                    if (fourth instanceof Serializable) {
                        dest.writeSerializable((Serializable) fourth);
                    } else if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + fourth + " doesn't implement Serializable either!");
                }
            case 3:
                if (third instanceof Parcelable) {
                    dest.writeParcelable((Parcelable) third, flags);
                    types[2] = third.getClass();
                } else {
                    types[2] = null;
                    if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + third + " doesn't implement Parcelable");
                    if (third instanceof Serializable) {
                        dest.writeSerializable((Serializable) third);
                    } else if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + third + " doesn't implement Serializable either!");
                }
            case 2:
                if (second instanceof Parcelable) {
                    dest.writeParcelable((Parcelable) second, flags);
                    types[1] = second.getClass();
                } else {
                    types[1] = null;
                    if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + second + " doesn't implement Parcelable");
                    if (second instanceof Serializable) {
                        dest.writeSerializable((Serializable) second);
                    } else if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + second + " doesn't implement Serializable either!");
                }
            case 1:
                if (first instanceof Parcelable) {
                    dest.writeParcelable((Parcelable) first, flags);
                    types[0] = first.getClass();
                } else {
                    types[0] = null;
                    if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + first + " doesn't implement Parcelable");
                    if (first instanceof Serializable) {
                        dest.writeSerializable((Serializable) first);
                    } else if (BuildConfig.DEBUG)
                        Log.w(TAG, "Object " + first + " doesn't implement Serializable either!");
                }
                break;
            default:
                throw new RuntimeException();
        }
        dest.writeArray(types);
    }
}
