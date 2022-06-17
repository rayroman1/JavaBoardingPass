package javaboardingproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Computer {
double price=0.0;
boolean cancreateticket=false;
String eta="";
int a=1000;

public boolean createticket(String d, String des, String dep, Routes m) throws FileNotFoundException, ParseException {
    Scanner sc2 = new Scanner(new File("src/main/resources/routes"));
    String line="";String[] tokens;
    String routid="";String departi="";String destina="";String depttime="";String arrtime="";String price="";
    while (sc2.hasNextLine())
    {
        line=sc2.nextLine();
        tokens=line.split(",");
        routid=tokens[0];//sc1.next();
        departi=tokens[1];//sc1.next();
        destina =tokens[2];//sc1.next();
        depttime=tokens[3];
        arrtime=tokens[4];
        price=tokens[5];
        //sc1.next();
        if(des.equals(destina)) {
            String date_time_user = d + " " + dep;
            SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
            Date date1 = dateParser.parse(date_time_user);
            String date_time_ticket = depttime;
            Date date2 = dateParser.parse(date_time_ticket);
            int result = date1.compareTo(date2);
            if (result < 0) {
                cancreateticket = true;
            } else {
                cancreateticket = false;
            }
        }
    }



    return cancreateticket;
}

    public double generateprice(int a, char g, String d, String des, String dep, Routes m) throws ParseException, FileNotFoundException {
        Scanner sc3 = new Scanner(new File("src/main/resources/routes"));
        String line="";String[] tokens;
        String routid="";String departi="";String destina="";String depttime="";String arrtime="";String price="";
       boolean cancreateticket1=false; double price1=0.0;
        while (sc3.hasNextLine())
        {
            line=sc3.nextLine();
            tokens=line.split(",");
            routid=tokens[0];//sc1.next();
            departi=tokens[1];//sc1.next();
            destina =tokens[2];//sc1.next();
            depttime=tokens[3];
            arrtime=tokens[4];
            price=tokens[5];price1= Double.parseDouble((price));
           // System.out.println("Price1 "+price1);
           // System.out.println("Gender "+g);
            //sc1.next();
            if(des.equals(destina)) {
               String date_time_user = d + " " + dep;
                SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
                Date date1 = dateParser.parse(date_time_user);
                String date_time_ticket = depttime;
                Date date2 = dateParser.parse(date_time_ticket);
                int result = date1.compareTo(date2);
                if (result < 0) {
                    System.out.println("Des "+des);
                    System.out.println("Price1 "+price1);
                    System.out.println("Gender "+g);
                    cancreateticket1 = true;
                    int compareOneTwo = Character.compare(g, 'F');
                    if (compareOneTwo==0)
                    {
                        price1=price1-(price1*.25);
                    }
                    else if(a<=12)
                    {

                     price1=price1-(price1*.5);
                    }
                    else if(a>=60)
                    {
                        //price1=Integer.parseInt(price);
                        price1=price1-(price1*.6);
                    }
                    break;

                }
                else {
                    cancreateticket1 = false;
                }
            }
        }

return price1;
    }

    public String getEta(String d, String des, String dep, Routes m) throws ParseException, FileNotFoundException {
        Scanner sc4 = new Scanner(new File("src/main/resources/routes"));
        String line="";String[] tokens;boolean cancreateticket1=false; String eta="";
        String routid="";String departi="";String destina="";String depttime="";String arrtime="";String price="";
        while (sc4.hasNextLine())
        {
            line=sc4.nextLine();
            tokens=line.split(",");
            routid=tokens[0];//sc1.next();
            departi=tokens[1];//sc1.next();
            destina =tokens[2];//sc1.next();
            depttime=tokens[3];
            arrtime=tokens[4];
            price=tokens[5];
            //sc1.next();
            if(des.equals(destina)) {
                String date_time_user = d + " " + dep;
                SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
                Date date1 = dateParser.parse(date_time_user);
                String date_time_ticket = depttime;
                Date date2 = dateParser.parse(date_time_ticket);
                int result = date1.compareTo(date2);
                if (result < 0) {
                    cancreateticket1 = true;
                    eta=arrtime;
                } else {
                    cancreateticket1 = false;
                }
            }
        }
        return eta;
    }
    public int generateboardingnumber()
    {
        a++;
        return a;
    }


    public void writetictofile()
    {

    }


}
