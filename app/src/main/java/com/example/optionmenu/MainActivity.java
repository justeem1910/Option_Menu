package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.aboutItem:
                showMessage("About selected");
                break;
            case R.id.shareItem:
                showMessage("share selected");
                break;
            case R.id.sytemItem:
                showMessage("System selected");
                break;
            case R.id.policyItem:
                showMessage("Policy selected");
                break;
            case R.id.infItem:
                showMessage("Information selected");
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showMessage(String s){
        Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
    }
}