package com.theironyard;

import com.github.javaparser.ParseException;
import net.doughughes.testifier.annotation.Testifier;
import net.doughughes.testifier.matcher.RegexMatcher;
import net.doughughes.testifier.output.OutputStreamInterceptor;
import net.doughughes.testifier.util.SourceCodeExtractor;
import net.doughughes.testifier.util.TestifierAnnotationReader;
import net.doughughes.testifier.watcher.NotifyingWatcher;
import net.doughughes.testifier.watcher.OutputWatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Testifier(sourcePath = "./src/main/java/com/theironyard/Main.java", clazz = Main.class)
public class MainTest {

    @Rule
    public NotifyingWatcher notifyingWatcher = new NotifyingWatcher("https://tiy-testifier-webapp.herokuapp.com/notify");

    @Rule
    public OutputWatcher outputWatcher = new OutputWatcher();

    @Test
    @Testifier(method = "main", args = {String[].class})
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
    @Testifier(method = "main", args = {String[].class})
    public void mainMethodShouldInstantiatePlanet1Test() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(this);

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The main() method should define a variable planet1 and set it to a new instance of the Planet class.",
                methodDescription, RegexMatcher.matches("^.*?ExpressionStmt VariableDeclarationExpr ReferenceType\\[Planet\\] VariableDeclarator VariableDeclaratorId\\[planet1\\] ObjectCreationExpr ClassOrInterfaceType\\[Planet\\] \\/ExpressionStmt.*?$"));

    }

    @Test
    @Testifier(method = "main", args = {String[].class})
    public void mainMethodShouldSetPlanet1NameTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(this);

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The main() method should set planet1's name property before printing it out the first time.",
                methodDescription, RegexMatcher.matches("^.*?ExpressionStmt AssignExpr FieldAccessExpr\\[name\\] NameExpr\\[planet1\\] StringLiteralExpr\\[.*?\\] \\/ExpressionStmt.*?(MethodCallExpr\\[println\\].*?){4}.*?$"));

    }

    @Test
    @Testifier(method = "main", args = {String[].class})
    public void mainMethodShouldSetPlanet1DistanceFromSunTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(this);

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The main() method should set planet1's distanceFromSun property before printing it out the first time.",
                methodDescription, RegexMatcher.matches("^.*?ExpressionStmt AssignExpr FieldAccessExpr\\[distanceFromSun\\] NameExpr\\[planet1\\] (IntegerLiteralExpr|DoubleLiteralExpr)\\[.*?\\] \\/ExpressionStmt.*?(MethodCallExpr\\[println\\].*?){4}.*?$"));

    }

    @Test
    @Testifier(method = "main", args = {String[].class})
    public void mainMethodShouldSetPlanet1SatellitesTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(this);

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The main() method should set planet1's satellites property before printing it out the first time.",
                methodDescription, RegexMatcher.matches("^.*?ExpressionStmt AssignExpr FieldAccessExpr\\[satellites\\] NameExpr\\[planet1\\] IntegerLiteralExpr\\[.*?\\] \\/ExpressionStmt.*?(MethodCallExpr\\[println\\].*?){4}.*?$"));

    }

    @Test
    @Testifier(method = "main", args = {String[].class})
    public void mainMethodShouldSetPlanet1SupportsLifeTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(this);

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The main() method should set planet1's supportsLife property before printing it out the first time.",
                methodDescription, RegexMatcher.matches("^.*?ExpressionStmt AssignExpr FieldAccessExpr\\[satellites\\] NameExpr\\[planet1\\] IntegerLiteralExpr\\[.*?\\] \\/ExpressionStmt.*?(MethodCallExpr\\[println\\].*?){4}.*?$"));

    }

    // planet 2 tests //


    @Test
    @Testifier(method = "main", args = {String[].class})
    public void mainMethodShouldInstantiatePlanet2Test() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(this);

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The main() method should define a variable planet2 and set it to a new instance of the Planet class.",
                methodDescription, RegexMatcher.matches("^.*?ExpressionStmt VariableDeclarationExpr ReferenceType\\[Planet\\] VariableDeclarator VariableDeclaratorId\\[planet2\\] ObjectCreationExpr ClassOrInterfaceType\\[Planet\\] \\/ExpressionStmt.*?$"));

    }

    @Test
    @Testifier(method = "main", args = {String[].class})
    public void mainMethodShouldSetPlanet2NameTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(this);

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The main() method should set planet2's name property before printing it out the first time.",
                methodDescription, RegexMatcher.matches("^.*?ExpressionStmt AssignExpr FieldAccessExpr\\[name\\] NameExpr\\[planet2\\] StringLiteralExpr\\[.*?\\] \\/ExpressionStmt.*?(MethodCallExpr\\[println\\].*?){4}.*?$"));

    }

    @Test
    @Testifier(method = "main", args = {String[].class})
    public void mainMethodShouldSetPlanet2DistanceFromSunTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(this);

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The main() method should set planet2's distanceFromSun property before printing it out the first time.",
                methodDescription, RegexMatcher.matches("^.*?ExpressionStmt AssignExpr FieldAccessExpr\\[distanceFromSun\\] NameExpr\\[planet2\\] (IntegerLiteralExpr|DoubleLiteralExpr)\\[.*?\\] \\/ExpressionStmt.*?(MethodCallExpr\\[println\\].*?){4}.*?$"));

    }

    @Test
    @Testifier(method = "main", args = {String[].class})
    public void mainMethodShouldSetPlanet2SatellitesTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(this);

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The main() method should set planet2's satellites property before printing it out the first time.",
                methodDescription, RegexMatcher.matches("^.*?ExpressionStmt AssignExpr FieldAccessExpr\\[satellites\\] NameExpr\\[planet2\\] IntegerLiteralExpr\\[.*?\\] \\/ExpressionStmt.*?(MethodCallExpr\\[println\\].*?){4}.*?$"));

    }

    @Test
    @Testifier(method = "main", args = {String[].class})
    public void mainMethodShouldSetPlanet2SupportsLifeTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(this);

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The main() method should set planet2's supportsLife property before printing it out the first time.",
                methodDescription, RegexMatcher.matches("^.*?ExpressionStmt AssignExpr FieldAccessExpr\\[satellites\\] NameExpr\\[planet2\\] IntegerLiteralExpr\\[.*?\\] \\/ExpressionStmt.*?(MethodCallExpr\\[println\\].*?){4}.*?$"));

    }

    @Test
    @Testifier(method = "main", args = {String[].class})
    public void mainMethodShouldChangePlanet1PropertyTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(this);

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The main() method should change any one of Planet1's properties before printing it out a second time.",
                methodDescription, RegexMatcher.matches("^.*?(MethodCallExpr\\[println\\].*?){2}ExpressionStmt AssignExpr FieldAccessExpr\\[.*?\\] NameExpr\\[planet1\\] .*?LiteralExpr.*? \\/ExpressionStmt.*?(MethodCallExpr\\[println\\].*?){2}$"));

    }

    @Test
    @Testifier(method = "main", args = {String[].class})
    public void mainMethodShouldChangePlanet2PropertyTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(this);

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The main() method should change any one of Planet2's properties before printing it out a second time.",
                methodDescription, RegexMatcher.matches("^.*?(MethodCallExpr\\[println\\].*?){2}ExpressionStmt AssignExpr FieldAccessExpr\\[.*?\\] NameExpr\\[planet2\\] .*?LiteralExpr.*? \\/ExpressionStmt.*?(MethodCallExpr\\[println\\].*?){2}$"));

    }

}