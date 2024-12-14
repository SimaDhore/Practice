package date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Nine_Twelve 
{
public static void main(String[] args) 
{
System.out.println(LocalDate.now());	

SimpleDateFormat DF = new SimpleDateFormat ("yyyy/MM/dd HH:mm:SS");

Date Date = new Date ();
System.out.println(DF.format(Date));
}
}
