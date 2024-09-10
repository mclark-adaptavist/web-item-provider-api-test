package ut.mattsJiraApp;

import org.junit.Test;
import mattsJiraApp.api.MyPluginComponent;
import mattsJiraApp.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest {
    @Test
    public void testMyName() {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent", component.getName());
    }
}