package guiorgy.androidg.app;

import android.os.Bundle;

import androidx.annotation.NonNull;

public class Fragment extends AbstractFragment {
    @NonNull
    @Override
    public Bundle saveState() {
        Bundle bundle = new Bundle();
        onSaveInstanceState(bundle);
        return bundle;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
    }

    @Override
    public boolean onBackPressed() {
        return false;
    }
}
