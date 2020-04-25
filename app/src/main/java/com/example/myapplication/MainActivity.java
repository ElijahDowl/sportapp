package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listview);

        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("Water Polo");
        arrayList.add("Swim");
        arrayList.add("Track");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(position==0){
                    Intent myintent = new Intent(view.getContext(),WaterPoloActivity.class);
                    startActivityForResult(myintent,0);
                }

                if(position==1){
                    Intent myintent = new Intent(view.getContext(),SwimActivity.class);
                    startActivityForResult(myintent,1);
                }
                if(position==2){
                    Intent myintent = new Intent(view.getContext(),TrackSprintActivity.class);
                    startActivityForResult(myintent,2);
                }



            }
        });

    }
}
