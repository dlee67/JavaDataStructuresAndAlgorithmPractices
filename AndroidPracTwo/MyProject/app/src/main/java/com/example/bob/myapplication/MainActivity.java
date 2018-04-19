package com.example.bob.myapplication;

import android.app.ActionBar;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class MainActivity extends AppCompatActivity {

    public static class EditTextAdapter extends ArrayAdapter<EditText>{

        //Not entirely
        public EditTextAdapter(Context context, /* int resource = 0 ,*/ ArrayList<EditText> edTxtList){
            super(context, 0, edTxtList);
        }

        public View getView(int position, View convertView, ViewGroup parent){

            View listItemView = convertView;
            if(listItemView == null){
                //What's LayoutInflater?
                //https://stackoverflow.com/questions/17101903/what-does-layoutinflater-class-do-in-android
                listItemView = LayoutInflater.from(getContext()).inflate(
                                R.layout.edit_text, parent, false);
            }

            //Can call getItem off the bet because I am extending ArrayAdapter.
            //Anyways, EditText in the list_item located at the "position" argument.
            EditText currentEdTxt = getItem(position);

            return listItemView;
        }
    }

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
        //inputOne.setHint("No dude.");
        //inputOne.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        listOfInputs.add(inputOne);

        EditTextAdapter itemsAdapter = new EditTextAdapter(this, listOfInputs);
        ListView listView = (ListView) findViewById(R.id.listViews);
        listView.setAdapter(itemsAdapter);
    }

    //https://stackoverflow.com/questions/36340268/nullpointerexception-while-setting-layoutparams
    //The link above saved me.

    protected void setHW(EditText edText){
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        edText.setLayoutParams(params);
        edText.setInputType(InputType.TYPE_TEXT_FLAG_MULTI_LINE);
        //The below lines are from: https://stackoverflow.com/questions/15032870/create-a-multiline-edittext-programmatically
        edText.setSingleLine(false);
        edText.setImeOptions(EditorInfo.IME_FLAG_NO_ENTER_ACTION);
    }
}
