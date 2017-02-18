package com.example.lloyd.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    private EditText mvalueField;
    private Button maddBtn;
    private EditText mkeyValue;
    private Firebase mRootRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRootRef= new Firebase("https://fireapp-d168a.firebaseio.com/Users");
        mvalueField= (EditText) findViewById(R.id.valueField);
        mkeyValue= (EditText) findViewById(R.id.keyValue);
        maddBtn= (Button) findViewById(R.id.addbtn);

        maddBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                String value= mvalueField.getText().toString();
                String key=mkeyValue.getText().toString();
                Firebase childRef = mRootRef.child(key);
                //childRef.setValue(value);
                //childRef.push().setValue(value);
                childRef.setValue(value);
            }
        });
    }

}
