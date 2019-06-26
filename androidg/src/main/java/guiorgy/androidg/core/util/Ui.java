package guiorgy.androidg.core.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;

import androidx.annotation.NonNull;

public class Ui {
    private Ui() {
    }

    /**
     * Convert Density-independent Pixels (dip) to Pixels (px).
     *
     * @param dipValue The value in Density-independent Pixels (dip).
     * @return The converted value.
     */
    public static int dipToPx(final int dipValue) {
        final float scale = Resources.getSystem().getDisplayMetrics().density;
        return Float.valueOf(dipValue * scale + 0.5f).intValue();
    }

    /**
     * Convert Density-independent Pixels (dip) to Pixels (px).
     *
     * @param dipValue The value in Density-independent Pixels (dip).
     * @return The converted value.
     */
    public static float dipToPx(final float dipValue) {
        final float scale = Resources.getSystem().getDisplayMetrics().density;
        return dipValue * scale + 0.5f;
    }

    /**
     * Convert Pixels (px) to Density-independent Pixels (dip).
     *
     * @param pxValue The value in Pixels (px).
     * @return The converted value.
     */
    public static int pxToDip(final int pxValue) {
        final float scale = Resources.getSystem().getDisplayMetrics().density;
        return Float.valueOf(pxValue / scale + 0.5f).intValue();
    }

    /**
     * Convert Pixels (px) to Density-independent Pixels (dip).
     *
     * @param pxValue The value in Pixels (px).
     * @return The converted value.
     */
    public static float pxToDip(final float pxValue) {
        final float scale = Resources.getSystem().getDisplayMetrics().density;
        return pxValue / scale + 0.5f;
    }

    /**
     * Attempt to hide soft keyboard.
     *
     * @param activity Current activity on which the soft keyboard is shown.
     */
    public static void hideKeyboard(@NonNull final Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        // Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        // If no view currently has focus, create a new one, just so we can grab a window token from it.
        if (view == null) view = new View(activity);
        if (imm != null) imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /**
     * Attempt to hide soft keyboard.
     *
     * @param context
     * @param view    A view from the current activity.
     */
    public static void hideKeyboardFrom(@NonNull final Context context, @NonNull final View view) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        if (imm != null) imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /**
     * Assuming that all views in the list have the same height, calculate the current scroll position.
     *
     * @param list
     * @return The calculated scroll position.
     */
    public static int getListYScroll(@NonNull final AbsListView list) {
        View child = list.getChildAt(0);
        return child == null ? 0 : list.getFirstVisiblePosition() * child.getHeight() - child.getTop() + list.getPaddingTop();
    }

    /**
     * Calculate the current scroll position.
     *
     * @param list
     * @return The calculated scroll position.
     */
    public static int getListYScrollDeep(@NonNull final AbsListView list) {
        final View child = list.getChildAt(0);
        if (child == null) return 0;
        final int padding = child.getTop() - list.getPaddingTop();
        final int visible = list.getFirstVisiblePosition();
        int scroll = 0;
        for (int i = 0; i < visible; i++) {
            scroll += list.getChildAt(i).getHeight();
        }
        return scroll - padding;
    }
}
