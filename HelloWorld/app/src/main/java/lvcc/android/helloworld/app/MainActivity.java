package lvcc.android.helloworld.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        react((Button) findViewById(R.id.btnH), R.id.btnH, "H");
        react((Button) findViewById(R.id.btnE), R.id.btnE, "E");
        react((Button) findViewById(R.id.btnL), R.id.btnL, "L");
        react((Button) findViewById(R.id.btnL2), R.id.btnL2, "L");
        react((Button) findViewById(R.id.btnO), R.id.btnO, "O");
        react((Button) findViewById(R.id.btnW), R.id.btnO, "W");
        react((Button) findViewById(R.id.btnO2), R.id.btnO2, "O");
        react((Button) findViewById(R.id.btnR), R.id.btnO, "R");
        react((Button) findViewById(R.id.btnL3), R.id.btnL, "L");
        react((Button) findViewById(R.id.btnD), R.id.btnD, "D");
    }

    public void react(Button button, int id, final String letter) {
        Button btnE = (Button) findViewById(id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), letter, Toast.LENGTH_SHORT).show();
                EditText text = (EditText) findViewById(R.id.editText);
                text.setText(text.getText() + letter);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
