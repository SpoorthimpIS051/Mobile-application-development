package com.example.checkboxmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public CheckBox pasta, coldcoffee, sandwitch;
    Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick() {
        //Getting instance of CheckBoxes and Button from the activty_main.xml file
        pasta = (CheckBox) findViewById(R.id.checkBox);
        coldcoffee = (CheckBox) findViewById(R.id.checkBox2);
        sandwitch = (CheckBox) findViewById(R.id.checkBox3);
        buttonOrder = (Button) findViewById(R.id.button);

        //Applying the Listener on the Button click
        buttonOrder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int totalamount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected Items:");
                if (pasta.isChecked()) {
                    result.append("\nPasta 100Rs");
                    totalamount += 100;
                }
                if (coldcoffee.isChecked()) {
                    result.append("\n ColdCoffee 50Rs");
                    totalamount += 50;
                }
                if (sandwitch.isChecked()) {
                    result.append("\nsandwitch 120Rs");
                    totalamount += 120;
                }
                result.append("\nTotal: " + totalamount + "Rs");
                //Displaying the message on the toast
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }

        });
    }
}