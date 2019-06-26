package guiorgy.androidg.app;

import android.app.Activity;

import androidx.annotation.NonNull;

abstract class AbstractActivity extends Activity {
    @NonNull
    public abstract int[] getFragmentIds();

    public abstract void onBackPressed(boolean handled);
}
