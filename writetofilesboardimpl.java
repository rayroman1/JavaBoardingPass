package javaboardingproject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Date;

public class writetofilesboardimpl implements writetofilesboard {

    public void writetouserinfo(String name, String email,String phonenumber, char gender, int age, String date,String destination, String departuretime) {
        Path filePath = Path.of("src/main/resources/userInfo");

        String content  = "MenuData{ \r \n" +
                "name='" + name + "\r \n" +
                ", email='" + email + "\r\n"+
                ", phonenumber=" + phonenumber +"\r\n"+
                ", gender=" + gender +"\r\n"+
                ", age=" + age +"\r\n"+
                ", date=" + date +"\r\n"+
                ", destination='" + destination +"\r\n"+
                ", departuretime=" + departuretime +"\r\n";
        try {
            Files.write(filePath, content.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeticket(String name, String email,String phonenumber, char gender, int age, String date,String destination, String departuretime,int num, double pri,String eta)
    {
        Path filePath = Path.of("src/main/resources/tickts");

        String content  = "\r\n"+"MenuData{ \r\n" ;
        String content9=        ", ticketno=" + num +"\r\n";
        String content1=        "name='" + name+"\r\n";
        String content2=         ", email='" + email +"\r\n";
                String content3=         ", phonenumber=" + phonenumber +"\r\n";
            String content4=          ", gender=" + gender+"\r\n" ;
            String content5=          ", age=" + age+"\r\n" ;
            String content6=         ", date=" + date +"\r\n";
            String content7=        ", destination='" + destination+"\r\n" ;
            String content8=        ", departuretime=" + departuretime+"\r\n" ;
        String content10=        ", Price=" + pri +"\r\n";
        String content12=        ", Eta=" + eta+"\r\n" ;


        String content11="____________________________________________________________";
        try {
            Files.write(filePath, content.getBytes(), StandardOpenOption.APPEND);
            Files.write(filePath, content9.getBytes(), StandardOpenOption.APPEND);
            Files.write(filePath, content1.getBytes(), StandardOpenOption.APPEND);
            Files.write(filePath, content2.getBytes(), StandardOpenOption.APPEND);
            Files.write(filePath, content3.getBytes(), StandardOpenOption.APPEND);
            Files.write(filePath, content4.getBytes(), StandardOpenOption.APPEND);
            Files.write(filePath, content5.getBytes(), StandardOpenOption.APPEND);
            Files.write(filePath, content6.getBytes(), StandardOpenOption.APPEND);
            Files.write(filePath, content7.getBytes(), StandardOpenOption.APPEND);
            Files.write(filePath, content8.getBytes(), StandardOpenOption.APPEND);
            Files.write(filePath, content10.getBytes(), StandardOpenOption.APPEND);
            Files.write(filePath, content12.getBytes(), StandardOpenOption.APPEND);
            Files.write(filePath, content11.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
