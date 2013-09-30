package ohtu.justinbiber.test;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import ohtu.justinbiber.domain.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danipallo
 */
public class FieldTest {

    public FieldTest() {
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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void consturctAfield() {
        Field field = new Field("dfgdg", "asdaf");
        assertTrue(field.getKey().equals("dfgdg"));
        assertTrue(field.getValue().equals("asdaf"));


        field.setValue("-111");

        assertTrue(field.getValue().equals("-111"));
    }

    @Test
    public void setKeySetsKey() {

        Field field = new Field("", "");

        field.setKey("22225");

        assertTrue(field.getKey().equals("22225"));


    }
}