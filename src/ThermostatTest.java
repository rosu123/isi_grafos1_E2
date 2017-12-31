import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ThermostatTest {
	
	private Thermostat.partOfDay day1;
	private Thermostat.temp temp1;
	
	
	@Before
	public void setUp()
	{
		day1 = Thermostat.partOfDay.Wake;
		temp1 = Thermostat.temp.Low;
	}
	
	@Test
	public void T1() {
		//#1
		Thermostat.down();
		assertEquals(day1, Thermostat.param1);
		assertEquals(temp1, Thermostat.param2);
		//#2
		day1 = Thermostat.partOfDay.Sleep;
		Thermostat.advance();
		assertEquals(day1, Thermostat.param1);
		assertEquals(temp1, Thermostat.param2);
		//#3
		Thermostat.down();
		assertEquals(day1, Thermostat.param1);
		assertEquals(temp1, Thermostat.param2);
		//#4
		temp1 = Thermostat.temp.High;
		Thermostat.up();
		assertEquals(day1, Thermostat.param1);
		assertEquals(temp1, Thermostat.param2);
		//#5
		Thermostat.up();
		assertEquals(day1, Thermostat.param1);
		assertEquals(temp1, Thermostat.param2);
		//#6
		day1 = Thermostat.partOfDay.Wake;
		Thermostat.advance();
		assertEquals(day1, Thermostat.param1);
		assertEquals(temp1, Thermostat.param2);
		//#7
		Thermostat.up();
		assertEquals(day1, Thermostat.param1);
		assertEquals(temp1, Thermostat.param2);
		//#8
		temp1 = Thermostat.temp.Low;
		Thermostat.down();
		assertEquals(day1, Thermostat.param1);
		assertEquals(temp1, Thermostat.param2);
		//#9
		temp1 = Thermostat.temp.High;
		Thermostat.up();
		assertEquals(day1, Thermostat.param1);
		assertEquals(temp1, Thermostat.param2);
		//#10
		day1 = Thermostat.partOfDay.Sleep;
		Thermostat.advance();
		assertEquals(day1, Thermostat.param1);
		assertEquals(temp1, Thermostat.param2);
		//#11
		temp1 = Thermostat.temp.Low;
		Thermostat.down();
		assertEquals(day1, Thermostat.param1);
		assertEquals(temp1, Thermostat.param2);
		//#12
		day1 = Thermostat.partOfDay.Wake;
		Thermostat.advance();
		assertEquals(day1, Thermostat.param1);
		assertEquals(temp1, Thermostat.param2);
	}
}
