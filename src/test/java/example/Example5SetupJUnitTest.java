package example;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Example5SetupJUnitTest {
    private static int a;
    private int b;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass method start: a=" + a);
        a = 1;
        System.out.println("beforeClass method finish: a=" + a);
    }

    @Before
    public void before() {
        System.out.println("before method start: a=" + a + " b=" + b);
        b = 2;
        System.out.println("before method finish: a=" + a + " b=" + b);
    }

    @After
    public void after() {
        System.out.println("after method start: a=" + a + " b=" + b);
        b = 0;
        System.out.println("after method finish: a=" + a + " b=" + b);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass method start: a=" + a);
        a = 0;
        System.out.println("afterClass method finish: a=" + a);
    }

    @Test
    public void simpleTest() {
        System.out.println("running test");
        //given
        int c = 3;

        //when
        int a_plus_b = a + b;
        //then
        assertEquals(a_plus_b, c);
        //and
        assertTrue(c <= 4);
    }
}
