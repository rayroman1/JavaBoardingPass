package javaboardingproject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Date;

public class writetofilesboardimpl implements writetofilesboard {

    public void writetouserinfo(String name, String email,String phonenumber, char gender, int age, String date,String destination, String departuretime) {
        Path filePath = Path.of("src/main/resources/userInfo");

        String content  = "MenuData{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber=" + phonenumber +
                ", gender=" + gender +
                ", age=" + age +
                ", date=" + date +
                ", destination='" + destination + '\'' +
                ", departuretime=" + departuretime +
                '}';
        try {
            Files.write(filePath, content.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeticket(String name, String email,String phonenumber, char gender, int age, String date,String destination, String departuretime,int num, double pri,String eta)
    {
        Path filePath = Path.of("src/main/resources/tickts");

        String content  = "MenuData{" ;
        String content9=        ", ticketno=" + num ;
        String content1=        "name='" + name;
        String content2=         ", email='" + email ;
                String content3=         ", phonenumber=" + phonenumber ;
            String content4=          ", gender=" + gender ;
            String content5=          ", age=" + age ;
            String content6=         ", date=" + date ;
            String content7=        ", destination='" + destination ;
            String content8=        ", departuretime=" + departuretime ;
        String content10=        ", Price=" + pri ;
        String content12=        ", Eta=" + eta ;


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
