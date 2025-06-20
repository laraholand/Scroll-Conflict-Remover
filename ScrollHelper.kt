
import android.view.MotionEvent
import android.view.View
import android.view.ViewParent

/**
 * Extension function to prevent parent from intercepting touch events.
 *
 * Usage:
 *      myView.dontGiveScroll(true)
 */
fun View.dontGiveScroll(enable: Boolean) {
    if (enable) {
        this.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_DOWN || event.action == MotionEvent.ACTION_MOVE) {
                v.parent?.requestDisallowInterceptTouchEvent(true)
            }
            false
        }
    } else {
        this.setOnTouchListener(null)
    }
}
