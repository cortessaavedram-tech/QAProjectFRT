package pages;

//import org.openqa.selenium.support.FindBy;


public class PaginaAcceder extends BasePage {

    private String accederLocator1 = "//input[@id='email']";
    private String emailKey = "cortes.com";
    private String accederLocator2 = "//input[@id='password']";
    private String passwordKey = "1234";
    private String sesionButton = "//button[@type='submit']";
    //private String messageSymbolLocator = "//input[@id='email' data-gtm-form-interact-field-id";


    public void emailWrite() {
        write(accederLocator1, emailKey);
    }

    public void passwordWrite() {
        write(accederLocator2, passwordKey);
    }

    public void clickIniciarSesion(){
        clickElement(sesionButton);
    }

    public void emailErrorMessage(){
       
    }

    

}
