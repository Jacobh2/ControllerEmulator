package se.iceman.controlleremulator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * @author Jacob Hagstedt
 * @version 0.1
 * @since 2014-09-16
 */
public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(this, "Hello world", Toast.LENGTH_LONG).show();
    }
}