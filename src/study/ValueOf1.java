package study;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValueOf1 {
    int x = 10;
    public static void main(String[] args) throws ParseException {
        String str1 = "100";
        String str2 = "200";
        int i = 300;
        int i1 = Integer.parseInt(str1);
        Integer i2 = Integer.valueOf(str2);
        String s = String.valueOf(i2);
        String string = Integer.toString(i);
        System.out.println(string);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(s);
        
        // doing this in same method
        String str3 = "1999-02-15";
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date inFormat = inputFormat.parse(str3);
        String date = outputFormat.format(inFormat);
        System.out.println(date);
        //the output is a date as String not actual date

        System.out.println(inFormat);
        //the output is actual date
       
       //doing this by calling another method
       String tDate = "1997-02-15";
        String sDate = parseDate(tDate);
        System.out.println(sDate);
        //the output is a date as String not actual date
        ValueOf1 v1 = new ValueOf1();
        System.out.println(v1.x);
        v1.test();

    }

    private static String parseDate(String rDate) throws ParseException {
        SimpleDateFormat indateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outdateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = indateFormat1.parse(rDate);
        String sdate = outdateFormat1.format(dt);
        return sdate;

    }
    public void test(){
        System.out.println(this.x);
    }

}
