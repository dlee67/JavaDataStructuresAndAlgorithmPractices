package com.example.bob.myapplication;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
            The implementation done from Udacity's innitializes the XML objects
            in the Java source; meaning, I gotta figure out how to do just that,
            with the EditText.
         */
        ArrayList<EditText> listOfInputs = new ArrayList<EditText>();
        EditText inputOne = new EditText(this);
        setHW(inputOne);
        listOfInputs.add(inputOne);
        /*
        EditText inputTwo = new EditText(this);
        setHW(inputTwo);
        listOfInputs.add(inputTwo);
        EditText inputThree = new EditText(this);
        setHW(inputThree);
        listOfInputs.add(inputThree);
        EditText inputFour = new EditText(this);
        setHW(inputFour);
        listOfInputs.add(inputFour);
        EditText inputFive = new EditText(this);
        setHW(inputFive);
        listOfInputs.add(inputFive);
        */

        //Not entirely sure if the simple_list_item_1
        ArrayAdapter<EditText> itemsAdapter = new ArrayAdapter<EditText>(this
                , android.R.layout.simple_list_item_1, listOfInputs);
        ListView listView = (ListView) findViewById(R.id.listViews);
        listView.setAdapter(itemsAdapter);

    }

    //https://stackoverflow.com/questions/36340268/nullpointerexception-while-setting-layoutparams
    //The link above saved me.
    protected void setHW(EditText edText){
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        edText.setLayoutParams(params);
    }
}
