package javaboardingproject;

import java.util.Date;

public class MenuData {
    String name;
    String email;
    int phonenumber;
    char gender;
    int age;
    String date;
    String destination;
    String departuretime;

    MenuData() {
        String name="";
        String email;
        int phonenumber;
        char gender;
        int age;
        Date date;
        String destination;
        Date departuretime;

    }

    public String getname()
    {

        return name;
    }

    public void setname(String w)
    {

        this.name=w;
    }
    public String getemail()
    {

        return email;
    }

    public void setemail(String w)
    {

        this.email=w;
    }
    public int getphonenumber()
    {

        return phonenumber;
    }

    public void setphonenumber(int w)
    {

        this.phonenumber=w;
    }

    public char getgender()
    {

        return gender;
    }

    public void setgender(char w)
    {

        this.gender=w;
    }
    public int getage()
    {

        return age;
    }

    public void setage(int w)
    {

        this.age=w;
    }
    public String getdate()
    {

        return date;
    }

    public void setdate(String w)
    {

        this.date=w;
    }
    public String getdestination()
    {

        return destination;
    }

    public void setdestination(String w)
    {

        this.destination=w;
    }
    public String getdeparturetime()
    {

        return departuretime;
    }

    public void setdeparturetime(String w)
    {

        this.departuretime=w;
    }

    @Override
    public String toString() {
        return "MenuData{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber=" + phonenumber +
                ", gender=" + gender +
                ", age=" + age +
                ", date=" + date +
                ", destination='" + destination + '\'' +
                ", departuretime=" + departuretime +
                '}';
    }
}
