package com.example.lloyd.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    private Button msendData;
    private Firebase mRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        mRef= new Firebase("https://fireapp-d168a.firebaseio.com/");
        msendData= (Button) findViewById(R.id.SendData);
        msendData.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Firebase mRefChild= mRef.child("Name");
                mRef.setValue("LeTeam");
            }
        });
    }

}
