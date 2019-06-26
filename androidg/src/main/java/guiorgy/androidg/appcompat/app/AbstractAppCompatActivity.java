package guiorgy.androidg.appcompat.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

abstract class AbstractAppCompatActivity extends AppCompatActivity {
    @NonNull
    public abstract int[] getFragmentIds();
    public abstract void onBackPressed(boolean handled);
}
