package loggerepam;
import java.io.*;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
class Simpleinterest
{
	private static final Logger Logger=LogManager.getLogger(Simpleinterest.class);
	static void in()
	{
		double principal,rate,time,SI,CI;
		Scanner input=new Scanner(System.in);
		Logger.info("enter  principal amount:");
		principal=input.nextDouble();
		Logger.info("enter  no.of years:");
		time=input.nextDouble();
		Logger.info("enter rate of interest:");
		rate=input.nextDouble();
		SI=(principal*time*rate)/100;
		CI=principal*Math.pow(1.0+rate/100.0, time)-principal;
		Logger.info("Simpleinterest is :"+SI);
		Logger.info("Compoundinterest is:"+CI);
		Logger.info("executed successfully");
	}
}

public class Interest {
	public static void main(String args[]) {
		Simpleinterest i=new Simpleinterest();
		i.in();
	}

}
