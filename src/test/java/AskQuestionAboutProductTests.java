import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.AskQuestionAboutProductPAGE;

public class AskQuestionAboutProductTests extends BasePage {
    private AskQuestionAboutProductPAGE askQuestionAboutProductPAGE;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        askQuestionAboutProductPAGE = new AskQuestionAboutProductPAGE(driver);

    }
    @Test
    public void clickOnAppleIpad() {
        askQuestionAboutProductPAGE.clickOnAppleIpad1();


        askQuestionAboutProductPAGE.clickOnAskQuestion();
        askQuestionAboutProductPAGE.inputNameField("testUser");
        askQuestionAboutProductPAGE.inputEmailField("adala@madala.com");
        askQuestionAboutProductPAGE.subjectMessageField("testQuestion");
        askQuestionAboutProductPAGE.textMessageArea("Is this product tested already?");


    }





}
