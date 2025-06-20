// ScrollHelper.java

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

import androidx.annotation.NonNull;

/**
 * Utility class to prevent parent views from intercepting touch events.
 *
 * Usage:
 *      ScrollHelper.dontGiveScroll(myView, true);
 */
public class ScrollHelper {

    public static void dontGiveScroll(@NonNull View view, boolean enable) {
        if (enable) {
            view.setOnTouchListener((v, event) -> {
                if (event.getAction() == MotionEvent.ACTION_DOWN ||
                    event.getAction() == MotionEvent.ACTION_MOVE) {
                    ViewParent parent = v.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
                return false;
            });
        } else {
            view.setOnTouchListener(null);
        }
    }
}
