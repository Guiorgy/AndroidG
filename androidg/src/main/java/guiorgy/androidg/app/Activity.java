package guiorgy.androidg.app;

import android.app.Fragment;
import android.os.Bundle;

import androidx.annotation.NonNull;

import guiorgy.androidg.fragment.app.IFragmentBackable;

public class Activity extends AbstractActivity {
    @NonNull
    @Override
    public int[] getFragmentIds() {
        return new int[0];
    }

    @Override
    public final void onBackPressed() {
        boolean handled = false;
        final int[] fragmentIds = getFragmentIds();
        for (final int fragmentId : fragmentIds) {
            Fragment fragment = getFragmentManager().findFragmentById(fragmentId);
            if (fragment != null && fragment.isVisible() && (fragment instanceof IFragmentBackable) && ((IFragmentBackable) fragment).onBackPressed()) {
                handled = true;
            }
        }
        onBackPressed(handled);
    }

    @Override
    public void onBackPressed(boolean handled) {
        if (!handled) super.onBackPressed();
    }
}
