package guiorgy.androidg.util;

import android.view.MotionEvent;
import android.view.View;

import static android.view.ViewConfiguration.getLongPressTimeout;

public class KeyEvent {
    public interface OnTouchListener extends View.OnTouchListener {
        @Override
        default boolean onTouch(View v, MotionEvent event) {
            return false;
        }
    }

    public abstract class OnLongClickListener implements View.OnLongClickListener {
        int longClickDuration;

        public OnLongClickListener(int longClickDuration) {
            if (longClickDuration > 0) this.longClickDuration = longClickDuration;
                else this.longClickDuration = getLongPressTimeout();
        }

        public abstract boolean onLongClick(View view);
    }
}
