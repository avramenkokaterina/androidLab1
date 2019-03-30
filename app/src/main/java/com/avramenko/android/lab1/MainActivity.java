package com.avramenko.android.lab1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void onClick(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        RadioGroup radGrp = (RadioGroup)findViewById(R.id.radios);
        if (editText.getText().toString().equals("")) {
            Toast toast = Toast.makeText(this, "Enter question first.", Toast.LENGTH_LONG);
            toast.show();
        }
        else if (radGrp.getCheckedRadioButtonId() == -1){
            Toast toast = Toast.makeText(this, "Select answer.", Toast.LENGTH_LONG);
            toast.show();
        }
        else{
            int selectedId = radGrp.getCheckedRadioButtonId();
            RadioButton radioBttn = (RadioButton) findViewById(selectedId);
            Toast toast = Toast.makeText(this, editText.getText().toString() + " " + radioBttn.getText().toString(), Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
