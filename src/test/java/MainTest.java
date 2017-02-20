import net.doughughes.testifier.exception.CannotFindMethodException;
import net.doughughes.testifier.matcher.RegexMatcher;
import net.doughughes.testifier.output.OutputStreamInterceptor;
import net.doughughes.testifier.test.TestifierTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.fail;

public class MainTest extends TestifierTest {

    @Test
    public void mainMethodShouldInstantiatePlanet1Test(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        // check the structure of the code
        Assert.assertThat("The main() method should define a variable planet1 and set it to a new instance of the Planet class.",
                source, RegexMatcher.matches("^.*?ExpressionStmt VariableDeclarationExpr ReferenceType ClassOrInterfaceType\\[Planet\\] VariableDeclarator VariableDeclaratorId\\[planet1\\] ObjectCreationExpr ClassOrInterfaceType\\[Planet\\] \\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldSetPlanet1Name(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        // check the structure of the code
        Assert.assertThat("The main() method should set planet1's name property.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet1\\] NameExpr\\[name\\] AssignExpr.*?\\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldSetPlanet1DistanceFromSun(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        // check the structure of the code
        Assert.assertThat("The main() method should set planet1's distanceFromSun property.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet1\\] NameExpr\\[distanceFromSun\\] AssignExpr.*?\\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldSetPlanet1Satellites(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        // check the structure of the code
        Assert.assertThat("The main() method should set planet1's satellites property.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet1\\] NameExpr\\[satellites\\] AssignExpr.*?\\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldSetPlanet1SupportsLife(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        // check the structure of the code
        Assert.assertThat("The main() method should set planet1's supportsLife property.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet1\\] NameExpr\\[supportsLife\\] AssignExpr.*?\\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldPrintPlanet1AfterSettingPropertiesTest(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        // check the structure of the code
        Assert.assertThat("The main() method should print a description of planet1 that includes all of its properties after setting its properties the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet1\\] NameExpr\\[name\\] AssignExpr.*?\\/ExpressionStmt.*?ExpressionStmt MethodCallExpr NameExpr\\[System\\] FieldAccessExpr\\[out\\] MethodName\\[println\\] MethodArguments.*?NameExpr\\[planet1\\] FieldAccessExpr\\[name\\].*?\\/ExpressionStmt.*?$"));
        Assert.assertThat("The main() method should print a description of planet1 that includes all of its properties after setting its properties the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet1\\] NameExpr\\[distanceFromSun\\] AssignExpr.*?\\/ExpressionStmt.*?ExpressionStmt MethodCallExpr NameExpr\\[System\\] FieldAccessExpr\\[out\\] MethodName\\[println\\] MethodArguments.*?NameExpr\\[planet1\\] FieldAccessExpr\\[distanceFromSun\\].*?\\/ExpressionStmt.*?$"));
        Assert.assertThat("The main() method should print a description of planet1 that includes all of its properties after setting its properties the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet1\\] NameExpr\\[satellites\\] AssignExpr.*?\\/ExpressionStmt.*?ExpressionStmt MethodCallExpr NameExpr\\[System\\] FieldAccessExpr\\[out\\] MethodName\\[println\\] MethodArguments.*?NameExpr\\[planet1\\] FieldAccessExpr\\[satellites\\].*?\\/ExpressionStmt.*?$"));
        Assert.assertThat("The main() method should print a description of planet1 that includes all of its properties after setting its properties the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet1\\] NameExpr\\[supportsLife\\] AssignExpr.*?\\/ExpressionStmt.*?ExpressionStmt MethodCallExpr NameExpr\\[System\\] FieldAccessExpr\\[out\\] MethodName\\[println\\] MethodArguments.*?NameExpr\\[planet1\\] FieldAccessExpr\\[supportsLife\\].*?\\/ExpressionStmt.*?$"));

    }

    // planet 2 tests

    @Test
    public void mainMethodShouldInstantiatePlanet2Test(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        // check the structure of the code
        Assert.assertThat("The main() method should define a variable planet2 and set it to a new instance of the Planet class.",
                source, RegexMatcher.matches("^.*?ExpressionStmt VariableDeclarationExpr ReferenceType ClassOrInterfaceType\\[Planet\\] VariableDeclarator VariableDeclaratorId\\[planet2\\] ObjectCreationExpr ClassOrInterfaceType\\[Planet\\] \\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldSetPlanet2Name(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        // check the structure of the code
        Assert.assertThat("The main() method should set planet2's name property.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet2\\] NameExpr\\[name\\] AssignExpr.*?\\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldSetPlanet2DistanceFromSun(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        // check the structure of the code
        Assert.assertThat("The main() method should set planet2's distanceFromSun property.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet2\\] NameExpr\\[distanceFromSun\\] AssignExpr.*?\\/ExpressionStmt.*?$"));
    }

    @Test
    public void mainMethodShouldSetPlanet2Satellites(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        // check the structure of the code
        Assert.assertThat("The main() method should set planet2's satellites property.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet2\\] NameExpr\\[satellites\\] AssignExpr.*?\\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldSetPlanet2SupportsLife(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        // check the structure of the code
        Assert.assertThat("The main() method should set planet2's supportsLife property.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet2\\] NameExpr\\[supportsLife\\] AssignExpr.*?\\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldPrintPlanet2AfterSettingPropertiesTest(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        // check the structure of the code
        Assert.assertThat("The main() method should print a description of planet2 that includes all of its properties after setting its properties the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet2\\] NameExpr\\[name\\] AssignExpr.*?\\/ExpressionStmt.*?ExpressionStmt MethodCallExpr NameExpr\\[System\\] FieldAccessExpr\\[out\\] MethodName\\[println\\] MethodArguments.*?NameExpr\\[planet2\\] FieldAccessExpr\\[name\\].*?\\/ExpressionStmt.*?$"));
        Assert.assertThat("The main() method should print a description of planet2 that includes all of its properties after setting its properties the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet2\\] NameExpr\\[distanceFromSun\\] AssignExpr.*?\\/ExpressionStmt.*?ExpressionStmt MethodCallExpr NameExpr\\[System\\] FieldAccessExpr\\[out\\] MethodName\\[println\\] MethodArguments.*?NameExpr\\[planet2\\] FieldAccessExpr\\[distanceFromSun\\].*?\\/ExpressionStmt.*?$"));
        Assert.assertThat("The main() method should print a description of planet2 that includes all of its properties after setting its properties the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet2\\] NameExpr\\[satellites\\] AssignExpr.*?\\/ExpressionStmt.*?ExpressionStmt MethodCallExpr NameExpr\\[System\\] FieldAccessExpr\\[out\\] MethodName\\[println\\] MethodArguments.*?NameExpr\\[planet2\\] FieldAccessExpr\\[satellites\\].*?\\/ExpressionStmt.*?$"));
        Assert.assertThat("The main() method should print a description of planet2 that includes all of its properties after setting its properties the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet2\\] NameExpr\\[supportsLife\\] AssignExpr.*?\\/ExpressionStmt.*?ExpressionStmt MethodCallExpr NameExpr\\[System\\] FieldAccessExpr\\[out\\] MethodName\\[println\\] MethodArguments.*?NameExpr\\[planet2\\] FieldAccessExpr\\[supportsLife\\].*?\\/ExpressionStmt.*?$"));

    }

    // change properties

    @Test
    public void mainMethodShouldChangePlanet1PropertyAfterPrintingTest(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        // check the structure of the code
        Assert.assertThat("The main() method should change any one of Planet1's properties after printing it the first time.",
                source, RegexMatcher.matches("^.*?(MethodCallExpr.*?MethodName\\[println\\].*?){2}.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet1\\] NameExpr\\[.*?\\] AssignExpr .*?LiteralExpr.*? \\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldChangePlanet2PropertyAfterPrintingTest(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        // check the structure of the code
        Assert.assertThat("The main() method should change any one of Planet2's properties after printing it the first time.",
                source, RegexMatcher.matches("^.*?(MethodCallExpr.*?MethodName\\[println\\].*?){2}.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet2\\] NameExpr\\[.*?\\] AssignExpr .*?LiteralExpr.*? \\/ExpressionStmt.*?$"));

    }


    @Test
    public void mainMethodShouldPrintFourStringsTest() {
        /* arrange */

        /* act */
        Main.main(new String[]{});

        /* assert */
        ArrayList printed = ((OutputStreamInterceptor) System.out).getPrinted();
        // note that the testifier rule considers println to print two things, the text and a newline
        assertThat("The main method should have printed four individual Strings to the console.",
                printed.size(), equalTo(8));

        // the first and third and second and fourth strings should not be equal
        assertThat("The planet1 object should have been changed, resulting in different output the second time planet1 was described.",
                printed.get(0), is(not(printed.get(4))));
        assertThat("The planet2 object should have been changed, resulting in different output the second time planet2 was described.",
                printed.get(2), is(not(printed.get(6))));
    }

}