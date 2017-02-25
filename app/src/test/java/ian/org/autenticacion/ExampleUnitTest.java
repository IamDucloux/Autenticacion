package ian.org.autenticacion;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    float suma2;
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);

    }
    @Test
    public void sumar(){
        int x = 5;
        double y = 4.2f;
        char v = 'v';
        byte b = 127;
        boolean o = true;
        String ian = "ian alejandro ducloux rueda";
         suma2 =(float) (x+y);
    }
}