package ie.app.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.libie.shoppingcart.R;


public class Added extends AppCompatActivity {
    ListView listView;

    static final String[] numbers = new String[]{
            "Amount, Products",
            "1,     Wallet",
            "2,     Sneakers",
            "3,     Watches",
            "4,     Tshirts"
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_added);

        listView = (ListView) findViewById(R.id.addedList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbers);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
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
}