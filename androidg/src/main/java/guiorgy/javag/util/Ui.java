package guiorgy.javag.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;

import androidx.annotation.NonNull;

public class Ui {
    private Ui() {}

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
}
