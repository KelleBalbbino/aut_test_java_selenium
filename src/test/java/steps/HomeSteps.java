package steps;


import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;

public class HomeSteps extends BaseSteps {

    //instâncias
    HomePage homePage = new HomePage();

    @Test
    public void validarPesquisaDeProdutoExistente() {


        homePage.setCliqueNoBtnApp();
        homePage.setEscreverNoCampoDePesquisa();
        homePage.setCliqueNoBtnPesquisar();
        Assert.assertEquals("\"secador taiff\"", homePage.getTextResultadoPesquisa());
        homePage.setCliqueNoBtnSecadorDeCabelo();
    }

    @Test
    public void validarPesquisaDeProdutoInexistente() {

        homePage.setEscreverNoCampoDePesquisar();
        homePage.setCliqueNoBtnPesquisar1();


    }


    @Test
    public void validarProdutoNoCarrinho() {

        homePage.setCliqueAdicionarCarrinho();
        homePage.setEscreverNoCampoDePesquisa2();
        homePage.setCliqueNoBtnPesquisar2();
        homePage.setCliqueNoBtnSmartWatch();


    }


    @Test
    public void validarCadastoNovoUsuario() {

        homePage.setCliqueRegistrarNovoUsuario();
        homePage.setEscreverNoCampoEmail();
        homePage.setEscreverNoCampoSenha();
        homePage.setCliqueNoBtnCriarMinhaConta();


    }


}

