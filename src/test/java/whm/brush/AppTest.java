package whm.brush;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import whm.brush.csdnandcnblogs.JsoupGetArticleUrl;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );

    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        List<String> csdnBlogsUrl = JsoupGetArticleUrl.getCsdnBlogsUrl();
        List<String> jbakeBlogsUrl = JsoupGetArticleUrl.getJbakeBlogsUrl();
        System.out.println(jbakeBlogsUrl);


        assertTrue( true );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAppCsdn()
    {
        List<String> csdnBlogsUrl = JsoupGetArticleUrl.getCsdnBlogsUrl();
        List<String> jbakeBlogsUrl = JsoupGetArticleUrl.getJbakeBlogsUrl();
        System.out.println(jbakeBlogsUrl);

    }

    /**
     * Rigourous Test :-)
     */
    public void testAppJbake()
    {

    }

}
