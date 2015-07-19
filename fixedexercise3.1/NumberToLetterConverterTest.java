
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author roberta
 */
public class NumberToLetterConverterTest {

    public NumberToLetterConverterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of convertNumberToLetter method, of class NumberToLetterConverter.
     */
    @Test
    public void testConvertNumberToLetter() {
        double number = 0.0;
        String expResult = "Zero dollars";
        String result = NumberToLetterConverter.convertNumberToLetter(number);
        assertEquals(expResult, result);

    }

    /**
     * Test of convertNumberToLetter method, of class NumberToLetterConverter.
     */
    @Test
    public void test1000ConvertNumberToLetter() {
        double number = 1000.15;
        String expResult = "One Thousand and 15/100 Dollars";
        String result = NumberToLetterConverter.convertNumberToLetter(number);
        assertEquals(expResult, result);

    }

    /**
     * Test of convertNumberToLetter method, of class NumberToLetterConverter.
     */
    @Test
    public void testNegative() {
        double number = -1;
        //String expResult = "Negative ";
        try {
            String result = NumberToLetterConverter.convertNumberToLetter(number);
            fail("Shouln't convert negative numbers");
        } catch (IllegalArgumentException e) {

        }

    }

}
