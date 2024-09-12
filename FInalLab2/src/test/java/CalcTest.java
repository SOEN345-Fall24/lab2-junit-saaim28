import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Calc;

//import org.junit.Test;
//import static org.junit.Assert.*;
public class CalcTest
{
    @Test
    public void testAdd()
    {
        assertEquals ( 5 , Calc.add (2, 3));
    }
}
