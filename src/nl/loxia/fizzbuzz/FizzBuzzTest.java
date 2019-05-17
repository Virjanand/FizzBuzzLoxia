package nl.loxia.fizzbuzz;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void input_vijftien_geeft_lijst_vijftien() {
        assertEquals(15, FizzBuzz.fizzBuzzLijst(15).size());
    }

    @Test
    public void input_vijftien_geeft_lijst_vijftien_positie_drie_fizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzzLijst(15).get(2));
    }

}
