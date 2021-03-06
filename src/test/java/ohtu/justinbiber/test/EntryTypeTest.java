/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.justinbiber.test;

import ohtu.justinbiber.domain.EntryType;
import ohtu.justinbiber.domain.FieldType;
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
public class EntryTypeTest {

    public EntryTypeTest() {
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

    @Test
    public void getAndSetKey() {
        EntryType entryType = new EntryType("magazine", new FieldType[0]);
        entryType.setTypeKey(null);

        assertTrue(entryType.getTypeKey() == null);

        entryType.setTypeKey("");

        assertTrue(entryType.getTypeKey().equals(""));

        entryType.setTypeKey("111111111234554444");

        assertTrue(entryType.getTypeKey().equals("111111111234554444"));
    }
}