package com.example.lloyd.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private TextView mvalueView;
    private Firebase mRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mvalueView= (TextView) findViewById(R.id.valueView);
        mRef= new Firebase("https://fireapp-d168a.firebaseio.com/");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                Map<String,String> map= dataSnapshot.getValue(Map.class);
                String name= map.get("Name");
                String age= map.get("Age");
                String profession= map.get("Profession");
                Log.v("E_NAME","Name: "+name);
                Log.v("E_NAME","Age: "+age);
                Log.v("E_NAME","Profession: "+profession);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

    }

}
