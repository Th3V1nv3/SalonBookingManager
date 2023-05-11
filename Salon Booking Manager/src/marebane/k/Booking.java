package marebane.k;

import java.util.ArrayList;

public class Booking {
    private String name;
    private String date;
    private String time;
    private ArrayList<String> services;

    public Booking() {
    }

    public Booking(String name, String date, String time, ArrayList<String> services) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.services = services;
    }

    public ArrayList<String> getService() {
        return services;
    }

    public void setService(ArrayList<String> services) {
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public String getAllServices()
    {
        String allServices = "";
        
        for(int i = 0 ; i < services.size() ; i ++)
        {
            allServices = allServices + (i+1) +" . "+services.get(i)+"\n";
        }
        
        return allServices;
    }
    public String formatDate(int day , int month)
    {
        return day+"/"+month;
    }
    public String formatTime(int hours , int minutes)
    {
        return hours+":"+minutes;
    }
    
}
