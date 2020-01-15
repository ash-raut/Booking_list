package com.example.booking_list;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class BookingListadapter extends RecyclerView.Adapter<BookingListadapter.ViewHolder> {
    View listItem;
    private BookingList_ListData[] listdata;

    public BookingListadapter(BookingList_ListData[] listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public BookingListadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        listItem = layoutInflater.inflate(R.layout.booking_list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final BookingListadapter.ViewHolder holder, int position) {
        final BookingList_ListData myListData = listdata[position];
        holder.djname.setText(listdata[position].getDjName());
        holder.datetime.setText(listdata[position].getDatetime());
        holder.address.setText(listdata[position].getAddress());
        holder.imageView.setImageResource(listdata[position].getImgId());
        holder.eventlocation.setText(listdata[position].getEventlocation());
        holder.eventdate.setText(listdata[position].getEventdate());
        holder.eventtime.setText(listdata[position].getEventtime());
        holder.mobileno.setText(listdata[position].getMobileno());
        holder.hrs.setText(listdata[position].getHrs());
        holder.totalcost.setText(listdata[position].getTotalcost());
        /*holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(v.getContext(), BookingFormActivity.class);
                v.getContext().startActivity(intent);

            }
        });*/
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView djname,datetime,address,eventlocation,eventdate,eventtime,mobileno,hrs,totalcost;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.linearLayout = (LinearLayout)itemView.findViewById(R.id.linearLayout);
            this.imageView = (ImageView) itemView.findViewById(R.id.android_gridview_image);
            this.djname = (TextView) itemView.findViewById(R.id.android_gridview_djname);
            this.address=(TextView) itemView.findViewById(R.id.address);
            this.datetime = (TextView) itemView.findViewById(R.id.DateTime);
            this.eventlocation = (TextView) itemView.findViewById(R.id.eventlocation);
            this.eventdate = (TextView) itemView.findViewById(R.id.eventdate);
            this.eventtime = (TextView) itemView.findViewById(R.id.eventTime);
            this.mobileno = (TextView) itemView.findViewById(R.id.mobileNo);
            this.hrs = (TextView) itemView.findViewById(R.id.hrs);
            this.totalcost = (TextView) itemView.findViewById(R.id.totalcost);

        }
    }
}
