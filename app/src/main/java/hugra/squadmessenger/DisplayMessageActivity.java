package hugra.squadmessenger;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class DisplayMessageActivity extends ActionBarActivity {
    private TextView swapButt;
    private boolean isEnabledText = true;

    public void swapEnabled(View v){
        swapButt.setEnabled(!isEnabledText);
        isEnabledText = !isEnabledText;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        swapButt = (TextView) findViewById(R.id.displayMessageLabel);
        swapButt.setText(getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE));
//        swapButt.setEnabled(true);
    }
}