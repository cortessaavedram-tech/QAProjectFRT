package steps;

//import java.util.List;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import java.util.Arrays;


import io.cucumber.java.en.*;
import pages.BasePage;
import pages.PaginaPrincipal;
import pages.PaginaAcceder;

public class FreeRangeSteps{
    
    PaginaPrincipal landingPage = new PaginaPrincipal();
    BasePage basePage = new BasePage();
    PaginaAcceder accederPage = new PaginaAcceder();

    
    @Given("The user navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }

    @Given("the user is on Acceder Section")
    public void iGoToAcceder(){
        landingPage.clickOnAcceder();
    }

    @When("^The user clicks on the section (.*)$")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }

    @When("the user enters an incorrect email")
    public void uWriteEmail(){
        accederPage.emailWrite();
    }

    @And("clicks on Inicio de sesion button")
    public void uClickIniciarSesion(){
        accederPage.clickIniciarSesion();
    }

    @Then("^The (.*) corresponds to (.*)$")
    public void theSectionCorrespondsToUrl(String sectionName, String expectedUrl) {
        String actualUrl = basePage.getCurrentPageUrl();
        assertTrue(actualUrl.contains(expectedUrl));
    }
    
    @Then("the message: You have to include this @ symbol, must appear")
    public void messageIncludesSymbolError(String locator, String expectedLocator){
        String actualLocator = basePage.getCurrentLocator(expectedLocator);
        accederPage.emailErrorMessage();
        assertTrue(actualLocator.contains(expectedLocator));;
    }


}
