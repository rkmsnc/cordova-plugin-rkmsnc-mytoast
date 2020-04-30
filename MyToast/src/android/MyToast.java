package cordova.plugin.rkmsnc.mytoast;

import android.view.Gravity;
import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * This class echoes a string called from JavaScript.
 */
public class MyToast extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("showToast")) {
            String message = args.getString(0);
            int duration;
            if (args.getInt(1) == 1) {
                duration = Toast.LENGTH_SHORT;
            } else {
                duration = Toast.LENGTH_SHORT;
            }
            this.showToast(message, duration, callbackContext);
            return true;
        }
        return false;
    }

    private void showToast(String message, int duration, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            Toast toast = Toast.makeText(webView.getContext(), message, duration);
            toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 10);
            toast.show();
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
