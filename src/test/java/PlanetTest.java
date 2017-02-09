import net.doughughes.testifier.test.TestifierTest;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class PlanetTest extends TestifierTest {

    @Test
    public void namePropertyIsStringTest() {
        /* arrange */

        /* act */
        Field name = null;
        try {
            name = Planet.class.getDeclaredField("name");
        } catch (NoSuchFieldException e) {
            fail("Planet does not have a 'name' property.");
        }

        /* assert */
        assertThat("Planet's 'name' property should be a String",
                name.getType().getSimpleName(), is("String"));
    }

    @Test
    public void distanceFromSunPropertyIsDoubleTest() {
        /* arrange */

        /* act */
        Field name = null;
        try {
            name = Planet.class.getDeclaredField("distanceFromSun");
        } catch (NoSuchFieldException e) {
            fail("Planet does not have a 'distanceFromSun' property.");
        }

        /* assert */
        assertThat("Planet's 'distanceFromSun' property should be a double",
                name.getType().getSimpleName(), is("double"));
    }

    @Test
    public void satellitesPropertyIsIntTest() {
        /* arrange */

        /* act */
        Field name = null;
        try {
            name = Planet.class.getDeclaredField("satellites");
        } catch (NoSuchFieldException e) {
            fail("Planet does not have a 'satellites' property.");
        }

        /* assert */
        assertThat("Planet's 'satellites' property should be an int",
                name.getType().getSimpleName(), is("int"));
    }

    @Test
    public void supportsLifePropertyIsBooleanTest() {
        /* arrange */

        /* act */
        Field name = null;
        try {
            name = Planet.class.getDeclaredField("supportsLife");
        } catch (NoSuchFieldException e) {
            fail("Planet does not have a 'supportsLife' property.");
        }

        /* assert */
        assertThat("Planet's 'supportsLife' property should be an int",
                name.getType().getSimpleName(), is("boolean"));
    }


}