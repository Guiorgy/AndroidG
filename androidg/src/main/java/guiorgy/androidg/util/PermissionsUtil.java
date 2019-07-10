package guiorgy.androidg.util;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PermissionsUtil {
    private PermissionsUtil() {
    }

    public static final String TAG = PermissionsUtil.class.getName();

    public interface OnPermissionListener {
        void onPermissionGranted(final String[] permissions);

        void onPermissionDenied(final String[] permissions);

        void onShouldShowRequestPermissionRationale(final String[] permissions);
    }

    public static void checkPermissions(@NonNull Context context, @Nullable final OnPermissionListener onPermissionListener, @Nullable final List<String> permissions) {
        checkPermissions(context, onPermissionListener, permissions == null ? new String[0] : permissions.toArray(new String[0]));
    }

    public static void checkPermissions(@NonNull Context context, @Nullable final OnPermissionListener onPermissionListener, final String... permissions) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M || permissions.length == 0) {
            if (onPermissionListener != null) onPermissionListener.onPermissionGranted(permissions);
            return;
        }

        int requestCode = nextRequestCode.getAndIncrement();
        // requestCode value must to be of 16 bits.
        if (requestCode >= 65000) nextRequestCode.lazySet(0);
        _permissionListeners.put(requestCode, onPermissionListener);

        context.startActivity(new Intent(context, PermissionActivity.class)
            .addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            .putExtra(PermissionActivity.INTENT_EXTRA_PERMISSIONS, permissions)
            .putExtra(PermissionActivity.INTENT_EXTRA_REQUEST_CODE, requestCode));
    }

    private static final SparseArrayCompat<OnPermissionListener> _permissionListeners = new SparseArrayCompat<>();
    private static final AtomicInteger nextRequestCode = new AtomicInteger();

    static OnPermissionListener getPermissionListener(final int requestCode) {
        return _permissionListeners.get(requestCode, null);
    }

    static void removePermissionListener(final int requestCode) {
        _permissionListeners.remove(requestCode);
    }
}
