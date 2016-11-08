package com.theironyard;

import com.github.javaparser.ParseException;
import net.doughughes.testifier.matcher.RegexMatcher;
import net.doughughes.testifier.output.OutputStreamInterceptor;
import net.doughughes.testifier.test.TestifierTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MainTest extends TestifierTest {

    @Test
    public void mainMethodShouldPrintFourStringsTest() {
        /* arrange */

        /* act */
        Main.main(new String[]{});

        /* assert */
        ArrayList printed = ((OutputStreamInterceptor) System.out).getPrinted();
        assertThat("The main method should have printed four individual Strings to the console.",
                printed.size(), equalTo(4));

        // the first and third and second and fourth strings should not be equal
        assertThat("The planet1 object should have been changed, resulting in different output the second time planet1 was described.",
                printed.get(0), is(not(printed.get(2))));
        assertThat("The planet2 object should have been changed, resulting in different output the second time planet2 was described.",
                printed.get(1), is(not(printed.get(3))));
    }

    @Test
    public void mainMethodShouldInstantiatePlanet1Test() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        String source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);

        // check the structure of the code
        Assert.assertThat("The main() method should define a variable planet1 and set it to a new instance of the Planet class.",
                source, RegexMatcher.matches("^.*?ExpressionStmt VariableDeclarationExpr ReferenceType ClassOrInterfaceType\\[Planet\\] VariableDeclarator VariableDeclaratorId\\[planet1\\] ObjectCreationExpr ClassOrInterfaceType\\[Planet\\] \\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldSetPlanet1NameBeforePrintingTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        String source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);

        // check the structure of the code
        Assert.assertThat("The main() method should set planet1's name property before printing it out the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet1\\] NameExpr\\[name\\] AssignExpr StringLiteralExpr\\[.*?\\] \\/ExpressionStmt.*?(MethodName\\[println\\].*?){4}.*?$"));

    }

    @Test
    public void mainMethodShouldSetPlanet1DistanceFromSunBeforePrintingTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        String source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);

        // check the structure of the code
        Assert.assertThat("The main() method should set planet1's distanceFromSun property before printing it out the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet1\\] NameExpr\\[distanceFromSun\\] AssignExpr (DoubleLiteralExpr|IntegerLiteralExpr)\\[.*?\\] \\/ExpressionStmt.*?(MethodName\\[println\\].*?){4}.*?$"));

    }

    @Test
    public void mainMethodShouldSetPlanet1SatellitesBeforePrintingTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        String source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);

        // check the structure of the code
        Assert.assertThat("The main() method should set planet1's satellites property before printing it out the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet1\\] NameExpr\\[satellites\\] AssignExpr IntegerLiteralExpr\\[.*?\\] \\/ExpressionStmt.*?(MethodName\\[println\\].*?){4}.*?$"));

    }

    @Test
    public void mainMethodShouldSetPlanet1SupportsLifeBeforePrintingTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        String source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);

        // check the structure of the code
        Assert.assertThat("The main() method should set planet1's supportsLife property before printing it out the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet1\\] NameExpr\\[supportsLife\\] AssignExpr BooleanLiteralExpr\\[.*?\\] \\/ExpressionStmt.*?(MethodName\\[println\\].*?){4}.*?$"));

    }

    // planet 2 tests //


    @Test
    public void mainMethodShouldInstantiatePlanet2Test() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        String source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);

        // check the structure of the code
        Assert.assertThat("The main() method should define a variable planet2 and set it to a new instance of the Planet class.",
                source, RegexMatcher.matches("^.*?ExpressionStmt VariableDeclarationExpr ReferenceType ClassOrInterfaceType\\[Planet\\] VariableDeclarator VariableDeclaratorId\\[planet2\\] ObjectCreationExpr ClassOrInterfaceType\\[Planet\\] \\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldSetPlanet2NameBeforePrintingTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        String source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);

        // check the structure of the code
        Assert.assertThat("The main() method should set planet2's name property before printing it out the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet2\\] NameExpr\\[name\\] AssignExpr StringLiteralExpr\\[.*?\\] \\/ExpressionStmt.*?(MethodName\\[println\\].*?){4}.*?$"));

    }

    @Test
    public void mainMethodShouldSetPlanet2DistanceFromSunBeforePrintingTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        String source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);

        // check the structure of the code
        Assert.assertThat("The main() method should set planet2's distanceFromSun property before printing it out the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet2\\] NameExpr\\[distanceFromSun\\] AssignExpr (DoubleLiteralExpr|IntegerLiteralExpr)\\[.*?\\] \\/ExpressionStmt.*?(MethodName\\[println\\].*?){4}.*?$"));

    }

    @Test
    public void mainMethodShouldSetPlanet2SatellitesBeforePrintingTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        String source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);

        // check the structure of the code
        Assert.assertThat("The main() method should set planet2's satellites property before printing it out the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet2\\] NameExpr\\[satellites\\] AssignExpr IntegerLiteralExpr\\[.*?\\] \\/ExpressionStmt.*?(MethodName\\[println\\].*?){4}.*?$"));

    }

    @Test
    public void mainMethodShouldSetPlanet2SupportsLifeBeforePrintingTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        String source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);

        // check the structure of the code
        Assert.assertThat("The main() method should set planet2's supportsLife property before printing it out the first time.",
                source, RegexMatcher.matches("^.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet2\\] NameExpr\\[supportsLife\\] AssignExpr BooleanLiteralExpr\\[.*?\\] \\/ExpressionStmt.*?(MethodName\\[println\\].*?){4}.*?$"));

    }

    @Test
    public void mainMethodShouldChangePlanet1PropertyAfterPrintingTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        String source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);

        // check the structure of the code
        Assert.assertThat("The main() method should change any one of Planet1's properties before printing it out a second time.",
                source, RegexMatcher.matches("^.*?(MethodCallExpr.*?MethodName\\[println\\].*?){2}.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet1\\] NameExpr\\[.*?\\] AssignExpr .*?LiteralExpr.*? \\/ExpressionStmt.*?$"));

    }

    @Test
    public void mainMethodShouldChangePlanet2PropertyAfterPrintingTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        String source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("main", String[].class);

        // check the structure of the code
        Assert.assertThat("The main() method should change any one of Planet2's properties before printing it out a second time.",
                source, RegexMatcher.matches("^.*?(MethodCallExpr.*?MethodName\\[println\\].*?){2}.*?ExpressionStmt FieldAccessExpr NameExpr\\[planet2\\] NameExpr\\[.*?\\] AssignExpr .*?LiteralExpr.*? \\/ExpressionStmt.*?$"));

    }

}