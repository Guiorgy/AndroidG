package guiorgy.androidg.fragment.app;

import androidx.annotation.NonNull;

@SuppressWarnings({"SpellCheckingInspection", "DanglingJavadoc"})
/** Override onBackPressed method in your activity like this! v */

    /*@Override public void onBackPressed() {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.[FRAGMENT_ID]);
        if (!(fragment instanceof FragmentBackable) || !((FragmentBackable) fragment).onBackPressed()) {
            super.onBackPressed();
        }
    }*/

/** Override onBackPressed method in your activity like this! ^ */
public interface FragmentBackable {
    /**
     * Called when the activity has detected the user's press of the back key and fragment is visible.
     *
     * @return True if the fragment has consumed the event, false otherwise.
     */
    boolean onBackPressed();

    interface IActivityBackable {
        @NonNull
        int[] getFragmentIds();
    }
}
