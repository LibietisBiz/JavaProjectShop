package ie.app.activities;

import android.content.Intent;
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
import android.widget.NumberPicker;
import android.widget.Toast;

import com.example.libie.shoppingcart.R;


public class Shopping extends AppCompatActivity {

    private Button addButton;
    private Button addButton2;
    private Button addButton3;
    private Button addButton4;

    private NumberPicker amountPicker;
    private NumberPicker amountPicker2;
    private NumberPicker amountPicker3;
    private NumberPicker amountPicker4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Email us", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        addButton4 = (Button) findViewById(R.id.addButton4);

        if (addButton4 != null)
        {
            Log.v("Add", "Got the add button");
        }

        amountPicker4  = (NumberPicker) findViewById(R.id.amountPicker4);

        amountPicker4.setMinValue(0);
        amountPicker4.setMaxValue(5);

        addButton3 = (Button) findViewById(R.id.addButton3);

        if (addButton3 != null)
        {
            Log.v("Add", "Got the add button");
        }

        amountPicker3  = (NumberPicker) findViewById(R.id.amountPicker3);

        amountPicker3.setMinValue(0);
        amountPicker3.setMaxValue(5);

        addButton2 = (Button) findViewById(R.id.addButton2);

        if (addButton2 != null)
        {
            Log.v("Add", "Got the add button");
        }

        amountPicker2  = (NumberPicker) findViewById(R.id.amountPicker2);

        amountPicker2.setMinValue(0);
        amountPicker2.setMaxValue(5);

        addButton = (Button) findViewById(R.id.addButton);

        if (addButton != null)
        {
            Log.v("Add", "Got the add button");
        }

        amountPicker  = (NumberPicker) findViewById(R.id.amountPicker);

        amountPicker.setMinValue(0);
        amountPicker.setMaxValue(5);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_shopping, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.Added : startActivity (new Intent(this, Added.class));
                break;
            case R.id.Products : startActivity (new Intent( this, Shopping.class));
            break;
            case R.id.About : startActivity (new Intent( this, About.class));
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    public void addButtonPressed (View view)
    {
        int amount = amountPicker.getValue();
        Log.v("Add", "Add Pressed! with amount " + amount);
    }

    public void addButtonPressed2 (View view)
    {
        int amount = amountPicker2.getValue();
        Log.v("Add", "Add Pressed! with amount " + amount);
    }

    public void addButtonPressed3 (View view)
    {
        int amount = amountPicker3.getValue();
        Log.v("Add", "Add Pressed! with amount " + amount);
    }

    public void addButtonPressed4 (View view)
    {
        int amount = amountPicker4.getValue();
        Log.v("Add", "Add Pressed! with amount " + amount);
    }
}
