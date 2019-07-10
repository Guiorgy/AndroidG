package guiorgy.androidg.fragment.app;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface FragmentState {
    @NonNull
    Bundle saveState();

    void onSaveState(@NonNull Bundle outState);

    @Nullable
    Bundle getSavedState();

    interface IActivityState {
        @NonNull
        String[] getFragmentTags();
    }
}
