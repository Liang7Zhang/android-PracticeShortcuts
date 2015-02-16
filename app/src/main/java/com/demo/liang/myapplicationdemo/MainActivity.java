package com.demo.liang.myapplicationdemo;

        import android.app.Activity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.Menu;
        import android.view.MenuItem;


/**
 * This was prepared for training shortcuts in Android Studio
 *
 * */

public class MainActivity extends Activity {

    private static final String TAG = "Demo";
    private static final String STATIC_SYMBOL = "static symbol";
    private final String NON_STATIC_SYMBOL = "non static symbol";
    private String mNormalSymbol = "normal symbol";
    public final static String PUBLIC_STATIC_SYMBOL = "public static symbol";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Quick doc view, [fn] + [f1]
        try {
            getInfo("none");
        } catch (UnsatisfiedLinkError e) {
            Log.e(TAG, "Detect unsatisfied link error");
            Log.e(TAG, "In other words, the UnsatisfiedLinkError was caught");
        }

        // Practice show usage shortcuts, [Option] + [Command] + [F7]
        getInfo("none again");

        // Practice upload new commit to Github
        getInfo("this should be caught and recorded in new commit");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Practice show usage shortcuts
        getInfo("none again and again");

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void getInfo(String message) throws UnsatisfiedLinkError {
        //Practice complete statement 1, SHIFT + COMMAND + ENTER
        if (message == null) {

        } else if (message == "A") {

        } else if (message == "B") {

        } else {
        }

        //Practice complete statement 2, SHIFT + COMMAND + ENTER
        int i = 10;
        do {
            Log.d(TAG, "To do funny jobs.");
            i = i -1;
        } while (i >= 0);

        //Practice code surround shortcuts, OPTION + COMMAND + T
        try {
            message = "new message";
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (1 == 1) {

            //TODO task A
            //TODO task B
            //TODO task C

        } else {
            throw new UnsatisfiedLinkError("Caught unsatisfied link error.");
        }
    }
}
