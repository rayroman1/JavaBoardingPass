package javaboardingproject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class javaBoardingMain  {

    public static void main(String [] args) throws ParseException, IOException {
        System.out.println("Welcome to the Ticket System");
        System.out.println("Make a choice");
        int choiceToPlay=0;String name=""; String email=""; String phonenumber=""; char gender=' '; int age=0; String date; String destination=""; String departuretime;
        JavaBoardMenu q= new JavaBoardMenu();
        q.printMenu(); Computer cv= new Computer(); char answer=' ';
        Scanner sc = new Scanner(System.in);
        choiceToPlay = sc.nextInt();
        Routes m=new Routes();

        while (choiceToPlay==2)
        {

            System.out.println("Enter your Name");
            name=sc.next();
            System.out.println("Enter your Email");
            email=sc.next();
            System.out.println("Enter your phonenumber");
            phonenumber=sc.next();
            System.out.println("Enter your gender");
            gender=sc.next().charAt(0);
            System.out.println("Enter your age");
            age=sc.nextInt();
            System.out.println("Enter date you want to leave format: mm/dd/yy");
            date=sc.next();
            System.out.println("Enter destination");
            sc.useDelimiter("\n");
            destination= sc.next();
            System.out.println("Enter departure time format: hh:mm:ss");
            departuretime=sc.next();  //default format: hh:mm:ss
           // LocalTime lt1=LocalTime.parse(departuretime);
            String date_time = date+" "+departuretime;
            SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
            Date date1 = dateParser.parse(date_time);
//write to file-userInfo
            writetofilesboardimpl w= new writetofilesboardimpl();
    w.writetouserinfo( name,  email, phonenumber,  gender,  age,  date, destination,  departuretime);
if (cv.createticket(date, destination, departuretime, m)==true)
{
    System.out.println("Ticket can be created");
    int age1= Integer.parseInt(String.valueOf(age));
    char x=gender;
    double price1=cv.generateprice(age1, gender, date, destination, departuretime, m);
    String getEta=cv.getEta(date, destination, departuretime, m);
    System.out.println("Price is: "+price1);
    System.out.println("ETA is: "+getEta);
    System.out.println("Create Ticket Y/N");
    answer=sc.next().charAt(0);
    if(answer=='Y')
    {
        int tickno= cv.generateboardingnumber();
        Path filePath = Path.of("src/main/resources/newtickt");

        String content    = "MenuData{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", phonenumber=" + phonenumber +
            ", gender=" + gender +
            ", age=" + age +
            ", date=" + date +
            ", destination='" + destination + '\'' +
            ", departuretime=" + departuretime +", ticket number="+ tickno+ ", price="+price1+", Eta is"+ getEta+
            '}';
        Files.write(filePath, content.getBytes(), StandardOpenOption.APPEND);

        w.writeticket(name,  email, phonenumber,  gender,  age,  date, destination,  departuretime,tickno,price1,getEta);
    }
    else
    { System.out.println("Ticket not created");
    }
}
else
{ System.out.println("Ticket can't be created");
}

System.out.println("Create another ticket?");
            JavaBoardMenu q1= new JavaBoardMenu();
            q.printMenu();
            choiceToPlay = sc.nextInt();

        }

System.out.println("Goodbye");

    }


}
