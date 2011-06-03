package se.sigma.educational;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {

    @Test
    public void sayHello() {
        HelloWorld helloWorld = new HelloWorld();

        String name = "Thomas";

        assertThat(helloWorld.sayHiTo(name), is(name));
    }
}
