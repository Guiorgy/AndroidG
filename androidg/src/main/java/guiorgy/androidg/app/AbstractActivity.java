package guiorgy.androidg.app;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

import androidx.annotation.NonNull;

import guiorgy.androidg.fragment.app.IFragmentBackable;
import guiorgy.androidg.fragment.app.IFragmentState;
import guiorgy.androidg.fragment.app.IFragmentState.IActiviityState;

abstract class AbstractActivity extends Activity implements IActiviityState {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Do not let the launcher create a new activity http://stackoverflow.com/questions/16283079
        if (!isTaskRoot()) {
            // Android launched another instance of the root activity into an existing task
            //  so just quietly finish and go away, dropping the user back into the activity
            //  at the top of the stack (ie: the last state of this task)
            finish();
            return;
        }
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

    public void onBackPressed(boolean handled) {
        if (!handled) super.onBackPressed();
    }
}
