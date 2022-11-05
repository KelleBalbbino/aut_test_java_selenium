package steps;

import org.junit.After;
import org.junit.Before;
import util.Browser;

public class BaseSteps extends Browser {

    @Before
    public void iniciarBrowser(){
        browserUp("https://www.aliexpress.com/");
    }



    @After
    public void finalizarBrowser()    {

        browserDown();
    }



}