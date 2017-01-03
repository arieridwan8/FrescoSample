package id.arieridwan.frescosample;

import android.app.Application;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by arieridwan on 02/01/2017.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
