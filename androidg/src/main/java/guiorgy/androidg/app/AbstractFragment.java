package guiorgy.androidg.app;

import android.app.Fragment;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import guiorgy.androidg.fragment.app.IFragmentBackable;
import guiorgy.androidg.fragment.app.IFragmentState;

/**
 * @deprecated
 */
@Deprecated
abstract class AbstractFragment extends Fragment implements IFragmentState, IFragmentBackable {
    Bundle mSavedFragmentState;
    static final String SAVED_STATE = "SavedInstanceState";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null && mSavedFragmentState == null) {
            mSavedFragmentState = savedInstanceState.getBundle(SAVED_STATE);
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mSavedFragmentState = null;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putBundle(SAVED_STATE, (mSavedFragmentState != null ? mSavedFragmentState : saveState()));
    }
}