package guiorgy.androidg.fragment.app;

import android.os.Bundle;

import androidx.annotation.NonNull;

public interface IFragmentState {
    @NonNull
    Bundle saveState();

    void onSaveState(@NonNull Bundle outState);
}
