import java.io.*;
import java.util.*;

public class Thermostat
{
	//static String partOfDay [] = {"Wake", "Sleep"};
	//static String temp [] = {"Low", "High"};
	public enum partOfDay {
		Wake,
		Sleep;
	}
	public enum temp {
		Low,
		High;
	}
	
	static partOfDay param1 = partOfDay.Wake;
	static temp param2 = temp.Low;
	
	public static void advance()
	{
		switch (param1) {
	       case Wake:
	    	  param1 = partOfDay.Sleep;
	          break;       
	       case Sleep:
	    	  param1 = partOfDay.Wake;
	          break;
	     }
	}
	
	public static void up() 
	{
		switch (param2) {
	       case Low:
	    	  param2 = temp.High;
	          break;       
	       case High:
	          break;
	     }
	}
	
	public static void down()
	{
		switch (param2) {
	       case High:
	    	  param2 = temp.Low;
	          break;       
	       case Low:
	          break;
	     }
	}
}