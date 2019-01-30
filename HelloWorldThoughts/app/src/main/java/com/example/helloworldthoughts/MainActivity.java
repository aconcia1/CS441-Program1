package com.example.helloworldthoughts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button thoughtButton = findViewById(R.id.button2);

        thoughtButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Random rand = new Random();

                int n = rand.nextInt(20) + 1;

                if(n == 1) {

                    Toast.makeText(MainActivity.this, "A moment of laxity spawns a lifetime of heresy", Toast.LENGTH_LONG).show();
                }

                else if(n == 2) {

                    Toast.makeText(MainActivity.this, "A coward always seeks to compromise", Toast.LENGTH_LONG).show();
                }

                else if(n == 3) {

                    Toast.makeText(MainActivity.this, "An open mind is like a fortress with its gates unbarred and unguarded", Toast.LENGTH_LONG).show();
                }

                else if(n == 4) {

                    Toast.makeText(MainActivity.this, "Enlightenment is a myth we do not need to understand in order to hate", Toast.LENGTH_LONG).show();
                }

                else if(n == 5) {

                    Toast.makeText(MainActivity.this, "Facts are chains that bind perception and fetter truth. For a man can remake the world if he has a dream and no facts to cloud his mind", Toast.LENGTH_LONG).show();
                }

                else if(n == 6) {

                    Toast.makeText(MainActivity.this, "Foolish are those who fear nothing, yet claim to know everything", Toast.LENGTH_LONG).show();
                }

                else if(n == 7) {

                    Toast.makeText(MainActivity.this, "Hope is the first step on the road to disappointment", Toast.LENGTH_LONG).show();
                }

                else if(n == 8) {

                    Toast.makeText(MainActivity.this, "If a job's worth doing it's worth dying for!", Toast.LENGTH_LONG).show();
                }

                else if(n == 9) {

                    Toast.makeText(MainActivity.this, "Knowledge is power, hide it well", Toast.LENGTH_LONG).show();
                }

                else if(n == 10) {

                    Toast.makeText(MainActivity.this, "Nobody is innocent, there are merely varying levels of guilt", Toast.LENGTH_LONG).show();
                }

                else if(n == 11) {

                    Toast.makeText(MainActivity.this, "Only in death does duty end", Toast.LENGTH_LONG).show();
                }

                else if(n == 12) {

                    Toast.makeText(MainActivity.this, "Pain is an illusion of the senses, despair is an illusion of the mind", Toast.LENGTH_LONG).show();
                }

                else if(n == 13) {

                    Toast.makeText(MainActivity.this, "Reason begets doubt; Doubt begets heresy", Toast.LENGTH_LONG).show();
                }

                else if(n == 14) {

                    Toast.makeText(MainActivity.this, "Serve the Emperor today, tomorrow you may be dead", Toast.LENGTH_LONG).show();
                }

                else if(n == 15) {

                    Toast.makeText(MainActivity.this, "Success is measured in blood; yours or your enemy's", Toast.LENGTH_LONG).show();
                }

                else if(n == 16) {

                    Toast.makeText(MainActivity.this, "It is better to die for the Emperor then live for yourself", Toast.LENGTH_LONG).show();
                }

                else if(n == 17) {

                    Toast.makeText(MainActivity.this, "Sins hidden in the heart turn all into decay", Toast.LENGTH_LONG).show();
                }

                else if(n == 18) {

                    Toast.makeText(MainActivity.this, "Let your soul be armoured with Faith, driven on the tracks of Obedience which overcome all obstacles, and armed with the three great guns of Zeal, Duty and Purity", Toast.LENGTH_LONG).show();
                }

                else if(n == 19) {

                    Toast.makeText(MainActivity.this, "Negotiation is surrender", Toast.LENGTH_LONG).show();
                }

                else {

                    Toast.makeText(MainActivity.this, "Only the awkward question; only the foolish ask twice", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
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
}
