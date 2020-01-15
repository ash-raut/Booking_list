package com.example.booking_list;

public class BookingList_ListData {
    private int imgId;
    private String djName;
    private String address;
    private String datetime;
    private String eventlocation;
    private String eventdate;
    private String eventtime;
    private String mobileno;
    private  String hrs;
    private String totalcost;


    public BookingList_ListData(String djName, String address, String datetime,String eventlocation,String eventdate,
                                String eventtime,String mobileno,String hrs ,String totalcost,int imgId) {
        this.djName = djName;
        this.address = address;
        this.datetime = datetime;
        this.imgId = imgId;
        this.eventlocation=eventlocation;
        this.eventdate=eventdate;
        this.eventtime=eventtime;
        this.mobileno=mobileno;
        this.hrs=hrs;
        this.totalcost=totalcost;
    }

    public String getDjName(){
        return djName;
    }
    public void setDjName(String djName){
        this.djName = djName;
    }



    public String getDatetime() {
        return datetime;
    }
    public void setDatetime(String add){
        this.datetime=add;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getEventlocation() {
        return eventlocation;
    }

    public void setEventlocation(String eventlocation) {
        this.eventlocation = eventlocation;
    }

    public String getEventdate() {
        return eventdate;
    }

    public void setEventdate(String eventdate) {
        this.eventdate = eventdate;
    }

    public String getEventtime() {
        return eventtime;
    }

    public void setEventtime(String eventtime) {
        this.eventtime = eventtime;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getHrs() {
        return hrs;
    }

    public void setHrs(String hrs) {
        this.hrs = hrs;
    }

    public String getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(String totalcost) {
        this.totalcost = totalcost;
    }
}
