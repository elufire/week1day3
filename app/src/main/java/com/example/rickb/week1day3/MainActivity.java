package com.example.rickb.week1day3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //textView and Button variables
        final TextView output= findViewById(R.id.theText);
        //final EditText editText = findViewById(R.id.editText);;
        final Button button = findViewById(R.id.edit_text);

        //On click listener and method for altering the text
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //output.setText(editText.getText().toString());

                output.setText(getAlphaNumericString(10));
            }

        });


    }
    //method that generates a random string and sends it back to setText method
    static String getAlphaNumericString(int n)
    {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }


}
