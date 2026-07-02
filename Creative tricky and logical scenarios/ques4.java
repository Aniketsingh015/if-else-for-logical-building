// Find the smaller angle between clock hands.
// total angle 360
// minutes marks in clock =60 so per minute angle=360/60=6
// total hour =12 per hour roatation degree=360/12=30
// per minute hour hand rotation =30/60=.5
// rotation of 3:30 ->3*30=90 and for 30*.5=15 =90+15=115 this degree is hour hand rotation
// for minute hand rotation 30*6=180
// diffrence between hour hand and minute hand is 180-115=65
// if the diffrence angle become greater than 180 subtract it by 360 to 

import java.util.*;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hour=sc.nextInt();
        int minute=sc.nextInt();
        System.out.println(hour + " :" + minute);
        double hourHandRotation=hour*30+minute*.5;
        double minuteHandRotation=minute*6;
        double diffrence=Math.abs(hourHandRotation-minuteHandRotation);

        if(diffrence>180){
            diffrence=360-diffrence;
        }
        System.out.println("the smaller angle between hour hand and minute hand is "+diffrence);
    }
}
