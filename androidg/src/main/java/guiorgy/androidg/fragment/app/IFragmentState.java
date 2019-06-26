package guiorgy.androidg.fragment.app;

import android.os.Bundle;

import androidx.annotation.NonNull;

public interface IFragmentState {
    @SuppressWarnings("unused")
    @NonNull
    Bundle saveState();
}
