package com.example.bob_mccone.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends ActionBarActivity {
    //adding the EXTRA_MESSAGE definition
    public final static String EXTRA_MESSAGE = "com.example.bob_mccone.myfirstapp.MESSAGE";

    /*Called when the user clicks the send button, the intent creates runtime
    binding between seperate components, the intent represents an app's
    intent to do something. We are using findViewById to get the EditText
    element, so the editText should display the edit_message in the
    strings.xml file. We then assign message as a local variable and the
    putExtra method adds its text value to the intent. The startActivity method
    passes the Intent on the first line of the sendMessage method. Basically
    this will start an instance of the activity specified by the intent.*/
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
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
