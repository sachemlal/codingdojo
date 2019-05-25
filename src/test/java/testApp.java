
import org.junit.Assert;
import org.junit.Test;


public class testApp {

    @Test
    public void normalCases()

    {
        Assert.assertEquals("1", Tools.compute("1"));
        Assert.assertEquals("2", Tools.compute("2"));
        Assert.assertEquals("FooFoo", Tools.compute("3"));
        Assert.assertEquals("4", Tools.compute("4"));
        Assert.assertEquals("BarBar", Tools.compute("5"));
        Assert.assertEquals("Foo", Tools.compute("6"));
        Assert.assertEquals("QixQix", Tools.compute("7"));
        Assert.assertEquals("8", Tools.compute("8"));
        Assert.assertEquals("Foo", Tools.compute("9"));
        Assert.assertEquals("Bar*", Tools.compute("10"));
        Assert.assertEquals("Foo", Tools.compute("13"));
        Assert.assertEquals("FooBarBar", Tools.compute("15"));
        Assert.assertEquals("FooQix", Tools.compute("21"));
        Assert.assertEquals("FooFooFoo", Tools.compute("33"));
        Assert.assertEquals("FooBar", Tools.compute("51"));
        Assert.assertEquals("BarFoo", Tools.compute("53"));
        Assert.assertEquals("1*1", Tools.compute("101"));
        Assert.assertEquals("FooFoo*Foo", Tools.compute("303"));
        Assert.assertEquals("FooBarQix*Bar", Tools.compute("105"));
        Assert.assertEquals("FooQix**", Tools.compute("10101"));
    }

    @Test(expected = NumberFormatException.class)
    public void specialCase()

    {
        Tools.compute("abc");
    }

}
