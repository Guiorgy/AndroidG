package guiorgy.androidg.appcompat.app;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import guiorgy.androidg.fragment.app.IFragmentBackable;

public class AppCompatActivity extends AbstractAppCompatActivity {
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
            Fragment fragment = getSupportFragmentManager().findFragmentById(fragmentId);
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
