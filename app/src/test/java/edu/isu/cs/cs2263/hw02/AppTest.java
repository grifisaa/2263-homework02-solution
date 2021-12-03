package edu.isu.cs.cs2263.hw02;

import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.*;
import org.junit.jupiter.api.Test;
import javafx.stage.Stage;
import org.testfx.matcher.base.NodeMatchers;

import java.util.concurrent.TimeoutException;
import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.assertions.api.Assertions.assertThat;

class AppTest extends ApplicationTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
        ApplicationTest.launch(App.class);
    }

    @Override
    public void start(Stage stage) throws Exception{
        stage.show();
    }

    @AfterEach
    public void afterEachTest() throws TimeoutException {
        FxToolkit.hideStage();
        release(new KeyCode[]{});
        release(new MouseButton[]{});
    }

    @Test
    public void ensureDropDownShows() throws InterruptedException {
        clickOn("#dropDown");
        verifyThat("#dropDown", NodeMatchers.isVisible());
    }

    @Test
    public void ensureDropDownContents() throws InterruptedException {
        clickOn("#dropDown");
        verifyThat("#dropDown", NodeMatchers.hasChild("Computer Science (CS)"));
    }

    @Test
    public void testSetView(){
        clickOn("#dropDown");
        clickOn("Botany (BTNY)");
        clickOn("Display (dept.)");
    }

    @Test
    public void testReset(){
        clickOn("New Course");
        clickOn("#newName");
        write("new one");
        clickOn("Reset");
    }

    @Test
    public void testAdd(){
        clickOn("New Course");
        clickOn("#newName");
        write("added name");
        clickOn("Add Course");
    }

}