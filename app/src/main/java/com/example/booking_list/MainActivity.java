package com.example.booking_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BookingList_ListData[] myListData= new BookingList_ListData[]{
                new BookingList_ListData("ABC","Pune","Monday 04:00 PM ","101," +
                        "Tuljabhavani nagar kharadi","11/01/2020","11:30PM","9912341234","03hrs","10,000",R.drawable.slider1),
                new BookingList_ListData("XYZ","Ahmednagar","Monday 04:00 PM ","101," +
                        "Yashwant nagar kharadi","11/01/2020","11:30PM","9912341234","03hrs","10,000",R.drawable.slider1),
                new BookingList_ListData("PQR","Satara","Monday 04:00 PM ","101," +
                        "Akurdi station","11/01/2020","11:30PM","9912341234","03hrs","10,000",R.drawable.slider1),
                new BookingList_ListData("QWE","Nashik","Monday 04:00 PM ","101," +
                        "Tuljabhavani nagar kharadi","11/01/2020","11:30PM","9912341234","03hrs","10,000",R.drawable.slider1),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.djparty_recycler_view);
     BookingListadapter adapter = new BookingListadapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
