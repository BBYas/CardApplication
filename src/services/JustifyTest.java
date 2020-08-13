package services;

import DTO.FieldDTO;
import org.junit.Test;

import static org.junit.Assert.*;

public class JustifyTest {

    @Test
    public void justifyString() {
        String testString = "sdfa";
        int maxSize = 10;
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setMaxSize(maxSize);
        fieldDTO.setValue(testString);
        String expectedString = "sdfa      ";
        final String actual = Justify.justifyString(fieldDTO);
        assertEquals(maxSize,actual.length());
        assertEquals(expectedString, actual);
    }

    @Test
    public void justifyInteger() {
        String testString = "10";
        int maxSize = 2;
        String expected = "10";
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setMaxSize(maxSize);
        fieldDTO.setValue(testString);
        String actual = Justify.justifyInteger(fieldDTO);
        assertEquals(maxSize, actual.length());
        assertEquals(expected,actual);
    }

    @Test
    public void justifyDecimal() {
        String testString = "12.01";
        int maxSize = 8;
        String expected = "00012010";
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setMaxSize(maxSize);
        fieldDTO.setValue(testString);
        String actual = Justify.justifyDecimal(fieldDTO,'.');
        assertEquals(maxSize, actual.length());
        assertEquals(expected, actual);

         testString = "12.";
         maxSize = 8;
         expected = "00012000";
        fieldDTO.setMaxSize(maxSize);
        fieldDTO.setValue(testString);
         actual = Justify.justifyDecimal(fieldDTO,'.');
        assertEquals(maxSize, actual.length());
        assertEquals(expected, actual);
    }

    @Test
    public void justifyEnum() {
        String testString = "1";
        int maxSize = 2;
        String expected = "02";
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setMaxSize(maxSize);
        fieldDTO.setValue(testString);
        String actual = Justify.justifyEnum(fieldDTO);
        assertEquals(maxSize, actual.length());
        assertEquals(expected, actual);

         testString = "1";
         maxSize = 1;
         expected = "2";
        fieldDTO.setMaxSize(maxSize);
        fieldDTO.setValue(testString);
         actual = Justify.justifyEnum(fieldDTO);
        assertEquals(maxSize, actual.length());
        assertEquals(expected, actual);
    }

    @Test
    public void justifyCharacter() {
        String testString = "A";
        String expected = "A";
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(testString);
        String actual = Justify.justifyCharacter(fieldDTO);
        assertEquals(expected, actual);
    }

    @Test
    public void justifyDate() {
        String testString = "2000/12/21";
        String expectedString = "20001221";
        FieldDTO fieldDTO = new FieldDTO();
        fieldDTO.setValue(testString);
        String actual = Justify.justifyDate(fieldDTO, '/');
        assertEquals(expectedString, actual);
        assertEquals(actual.length(),8);
    }
}