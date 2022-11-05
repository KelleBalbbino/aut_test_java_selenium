package pages;

import org.openqa.selenium.By;

import static jdk.internal.agent.Agent.getText;
import static pages.BasePage.sendKeys;

public class HomePage extends BasePage {


    // Mapear o elemento - campo de pesquisa do Aliexpress


    // Produto Existente Página Home

    private static final By campoDePesquisar
            = By.cssSelector("[placeholder=\"cilios y\"]");

    private static final By btnPesquisar1
            = By.cssSelector("[class=\"search-button\"]");


    private static final By btnApp
            = By.cssSelector("[href=\"//sale.aliexpress.com/download_app_guide.htm\"]");


    private static final By campoDePesquisa
            = By.cssSelector("[placeholder=\"Buscar\"]");


    private static final By btnPesquisar
            = By.cssSelector("[class=\"search-button\"]");

    private static final By textResultadoPesquisar
            = By.cssSelector("#root > div.glosearch-wrap > div > div.main-content > div.right-menu > " +
            "div > div.top-container > div.nav-breadcrumb > div > div:nth-child(2)");


    private static final By btnSecadorDeCabelo
            = By.cssSelector("[class=\"_18_85\"]");


    //Mapeamento Adicionar Produto ao Carrinho
    private static final By adicionarAoCarrinho
            = By.cssSelector("#header > div > div.hm-right > div > div");


    private static final By campoDePesquisa2
            = By.cssSelector("[placeholder=\"Buscar\"]");


    private static final By btnPesquisar2
            = By.cssSelector("[class=\"search-button\"]");



    private static final By btnSmartWatch
            = By.cssSelector("[class=\"_18_85\"]");

// Mapeamento Cadastro de Novo Usuário

    private static final By RegistrarNovoUsuario
            = By.cssSelector("[class=\"_3ggnV\"]");

    private static final By preencheremailvalido
            = By.cssSelector("[label=\"Insira seu email\"]");

    private static final By inserirSenha
            = By.cssSelector("[autocomplete=\"new-password\"]");

    private static final By btnCriarMinhaConta
            = By.cssSelector("#batman-dialog-wrap > div > div > div.cosmos-tabs > " +
            "div.cosmos-tabs-container > div > div > div > button");











    public void setEscreverNoCampoDePesquisar() {

        sendKeys(campoDePesquisar, "Iphone 50 pro max");
    }

    public void setCliqueNoBtnPesquisar1() {

        click(btnPesquisar1);
    }


    public void setCliqueNoBtnApp() {

        click(btnApp);
    }

    public void setEscreverNoCampoDePesquisa() {

        sendKeys(campoDePesquisa, "secador taiff");
    }


    public void setCliqueNoBtnPesquisar() {

        click(btnPesquisar);
    }

    public String getTextResultadoPesquisa() {

        return lerText(textResultadoPesquisar);
    }


    public void setCliqueNoBtnSecadorDeCabelo() {

        click(btnSecadorDeCabelo);

    }

    public void setCliqueAdicionarCarrinho() {

        click(adicionarAoCarrinho);

    }


    public void setEscreverNoCampoDePesquisa2() {

        sendKeys(campoDePesquisa2, "Smartwatch Band Y68 D20");
    }

    public void setCliqueNoBtnPesquisar2() {

        click(btnPesquisar2);
    }

    public void setCliqueNoBtnSmartWatch() {

        click(btnSmartWatch);

    }

    public void setCliqueRegistrarNovoUsuario() {


        click(RegistrarNovoUsuario);


    }

    public void setEscreverNoCampoEmail() {

        sendKeys(preencheremailvalido, "Kellebalbbino@gmail.com");
    }

    public void setEscreverNoCampoSenha() {

        sendKeys(inserirSenha, "K102922");
    }

    public void setCliqueNoBtnCriarMinhaConta() {


        click(btnCriarMinhaConta);


    }



}















