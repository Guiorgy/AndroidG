package guiorgy.androidg.appcompat.app;

import androidx.annotation.NonNull;

public class AppCompatActivity extends AbstractAppCompatActivity {
    @NonNull
    @Override
    public int[] getFragmentIds() {
        return new int[0];
    }

    @NonNull
    @Override
    public String[] getFragmentTags() {
        return new String[0];
    }
}
