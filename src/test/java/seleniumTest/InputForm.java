package seleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class InputForm{;
    WebDriver driver;
    WebDriverWait wait;


    By inputFormOptionBy = By.xpath("//a[text()='Input Forms']");
    By waitSimpleFormDemo= By.xpath("//li[@class='tree-branch']//a[text()='Simple Form Demo']");
    By userMessageBy = By.xpath("//input[@id='user-message']");
    By showButtonBy = By.xpath("//button[text()='Show Message']");
    By actualResualtTest_1By = By.xpath("//span[@id='display']");
    By sum1By = By.xpath("//input[@id='sum1']");
    By sum2By = By.xpath("//input[@id='sum2']");
    By getTotalBy = By.xpath("//button[text()='Get Total']");
    By actualResualtTest_2By = By.xpath("//span[@id='displayvalue']");
    By waitCheckboxDemo= By.xpath("//li[@class='tree-branch']//a[text()='Checkbox Demo']");
    By option_1By = By.xpath("//label[ text()='Option 1']");
    By option_3By = By.xpath("//label[ text()='Option 3']");
    By option = By.xpath("//label[ text()='Option 1' and text()='Option 3']");
    By waitRadioButtonsDemo = By.xpath("//li[@class='tree-branch']//a[text()='Radio Buttons Demo']");
    By buttonMaleBy = By.xpath("//div//label[@class='radio-inline']//input[@value='Male' and @name='gender']");
    By value_15_50By = By.xpath("//div//label[@class='radio-inline']//input[@value = '15 - 50']");
    By getValueBy = By.xpath("//button[text()='Get values']");
    By male_15_50By = By.xpath("//p[@class='groupradiobutton']");
    By waitSelectDropdownListBy = By.xpath("//li[@class='tree-branch']//a[text()='Select Dropdown List']");
    By dropdownBy = By.xpath("//select[@id='select-demo']//option[@value='Friday']");
    By daySelectedBy = By.xpath("//p[text()='Day selected :- Friday']");
    By multiSelectBy = By.xpath("//select[@id='multi-select']");
    By getAllSelectedBy = By.xpath("//button[text()='Get All Selected']");
    By optionSelectedAreBy = By.xpath("//p[text()='Options selected are : Florida,New York']");
    By waitAjaxFormSubmitBy = By.xpath("//li[@class='tree-branch']//a[text()='Ajax Form Submit']");
    By buttonSubmitBy = By.xpath("//input[@id='btn-submit']");
    By colorValueBy = By.xpath("//input[@style='border: 1px solid rgb(255, 0, 0);']");
    By waitDatePickersBy = By.xpath("//li[@class='tree-branch']//a[text()='Date pickers']");
    By bootstrapDatePickerBy = By.xpath("//li[@class='tree-branch']//a[text()='Bootstrap Date Picker']");
    By inputGroupAddonBy = By.xpath("//span[@class='input-group-addon']//i[@class='glyphicon glyphicon-th']");
    //test_9
    By tableBy = By.xpath("//li[@class='tree-branch']//a[text()='Table']");
    By tableDataSearchBy = By.xpath("//li[@class='tree-branch']//a[text()='Table Data Search']");
    By taskTableFilterBy = By.xpath("//input[@id='task-table-filter']");
    By actualResualtBy_9 = By.xpath("//table[@id='task-table']");
    //test_10
    By tableFilterBy = By.xpath("//li[@class='tree-branch']//a[text()='Table Filter ']");
    By orangeBy = By.xpath("//button[text()='Orange']");
    By expBy = By.xpath("//i[@style='color:orange;']");
    By colorOrangeBy = By.xpath("//div[@class=\"tablefilter\"]//a[@class=\"pull-left\"]//i[@style=\"color:orange;\"]");
    //test_11
    By alertsModalsBy = By.xpath("//li[@class='tree-branch']//a[text()='Alerts & Modals']");
    By javaScriptAlertBy = By.xpath("//ul[@id = 'treemenu']//li//a[text()='Javascript Alerts']");
    By clickMeButtonBy = By.xpath("//button[@onclick=\"myConfirmFunction()\"]");
    By actRes_11By = By.xpath("//p[@id=\"confirm-demo\"]");
    //test_12
    By listBoxBy = By.xpath("//li[@class='tree-branch']//a[text()='List Box']");
    By bootstrapListBoxBy = By.xpath("//li[@class=\"tree-branch\"]//li//a[text()='Bootstrap List Box']");
    By listGroupItemActiveBy = By.xpath("//div[@class=\"dual-list list-left col-md-5\"]//li[@class='list-group-item' and text()='Morbi leo risus']");
    By buttonRightBy = By.xpath("//button[@class=\"btn btn-default btn-sm move-right\"]");
    By rightBy = By.xpath("//div[@class=\"dual-list list-right col-md-5\"]//li[@class=\"list-group-item\" and text()='Morbi leo risus']");
    //test_14
    By jQueryListBoxBy = By.xpath("//li[@class='tree-branch']//a[text()='JQuery List Box']");
    By multiSelect_14By = By.xpath("//div[@class=\"col-sm-5\"]//select[@class=\"form-control pickListSelect pickData\"]");
    By addButtonBy = By.xpath("//div[@class=\"col-sm-2 pickListButtons\"]//button[@class=\"pAdd btn btn-primary btn-sm\"]");
    By pickListResultBy = By.xpath("//div[@class='col-sm-5']//select[@class='form-control pickListSelect pickListResult']");
    //test_15
    By otherBy = By.xpath("//li[@class='tree-branch']//a[text()='Others']");
    By dynamicDataLoadingBy= By.xpath("//li[@class='tree-branch']//a[text()='Dynamic Data Loading']");
    By getNewUserBy = By.xpath("//button[@id=\"save\"]");
    By imgBy = By.xpath("//div[@id=\"loading\"]//*[contains(@src,'https://randomuser.me/api/portraits/')]");
    By emptyFirstNameBy = By.xpath("//div[@id=\"loading\" and contains(text(),'First Name : ')]");
    By emptyLastNameBy = By.xpath("//div[@id=\"loading\" and contains(text(),'Last Name : ')]");



    @Before
    public void beforeEachTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='No, thanks!']"))).click();


    }

    @Test
    public void test_1(){
        String userMes = "Hello, my name is Osana";
        WebElement inputFormOption = driver.findElement(inputFormOptionBy);
        inputFormOption.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitSimpleFormDemo)).click();
        WebElement userMessage = driver.findElement(userMessageBy);
        userMessage.sendKeys(userMes);
        WebElement showButton = driver.findElement(showButtonBy);
        showButton.click();
        String actualResualt = driver.findElement(actualResualtTest_1By).getText();
        Assert.assertEquals(userMes,actualResualt);


    }
   @Test
    public void test_2(){
        String sum = "15";
        WebElement inputFormOption = driver.findElement(inputFormOptionBy);
        inputFormOption.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitSimpleFormDemo)).click();
        WebElement value_1 = driver.findElement(sum1By);
        value_1.sendKeys("10");
        WebElement value_2 = driver.findElement(sum2By);
        value_2.sendKeys("5");
        WebElement getTotal = driver.findElement(getTotalBy);
        getTotal.click();
        String actualResualt = driver.findElement(actualResualtTest_2By).getText();
        Assert.assertEquals(sum,actualResualt);

    }
    @Test
    public void test_3(){
        WebElement inputFormOption = driver.findElement(inputFormOptionBy);
        inputFormOption.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitCheckboxDemo)).click();
        WebElement option_1 = driver.findElement(option_1By);
        option_1.click();
        WebElement option_3 = driver.findElement(option_3By);
        option_3.click();
        Boolean actualResult1 = driver.findElement(option_1By).isSelected();
        Boolean actualResult2 = driver.findElement(option_3By).isSelected();
        Assert.assertTrue(actualResult1==actualResult2);

    }
    @Test
    public void test_4(){

        WebElement inputFormOption = driver.findElement(inputFormOptionBy);
        inputFormOption.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitRadioButtonsDemo)).click();
        WebElement buttonMale = driver.findElement(buttonMaleBy);
        buttonMale.click();
        WebElement value_15_50 = driver.findElement(value_15_50By);
        value_15_50.click();
        WebElement getValue = driver.findElement(getValueBy);
        getValue.click();
        String female_5_15 = "Sex : Female" + "Age group: 5 - 15";
        String actualResual = driver.findElement(male_15_50By).getText();
        Assert.assertNotEquals(female_5_15,male_15_50By);
    }
    @Test
    public void test_5(){
        WebElement inputFormOption = driver.findElement(inputFormOptionBy);
        inputFormOption.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitSelectDropdownListBy)).click();
        String daySelect = "Day selected :- Friday";
        WebElement dropdown = driver.findElement(dropdownBy);
        dropdown.click();
        String actualResualt = driver.findElement(daySelectedBy).getText();
        Assert.assertEquals(daySelect,actualResualt);
    }
    @Test
    public void test_6(){
        WebElement inputFormOption = driver.findElement(inputFormOptionBy);
        inputFormOption.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitSelectDropdownListBy)).click();
        WebElement multiSelect = driver.findElement(multiSelectBy);
        Select dropdown = new Select(multiSelect);
        dropdown.selectByVisibleText("Florida");
        dropdown.selectByVisibleText("New York");
        WebElement getAllSelected = driver.findElement(getAllSelectedBy);
        getAllSelected.click();
        String optionSelected = "Options selected are : Florida,New York";
        String actualResualt = driver.findElement(optionSelectedAreBy).getText();
        Assert.assertEquals(optionSelected,actualResualt);
    }

    @Test
    public void test_7(){
        WebElement inputFormOption = driver.findElement(inputFormOptionBy);
        inputFormOption.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(waitAjaxFormSubmitBy)).click();
        WebElement submitButton = driver.findElement(buttonSubmitBy);
        submitButton.click();
        String expectedColor = "rgb(255, 0, 0)";
        String actualResualt = driver.findElement(colorValueBy).getCssValue("border");
        Assert.assertEquals(expectedColor,actualResualt);
    }
    @Test
    public void test_8(){
        WebElement datePickers = driver.findElement(waitDatePickersBy);
        datePickers.click();
        WebElement bootstrapDatePicker = driver.findElement(bootstrapDatePickerBy);
        bootstrapDatePicker.click();
        WebElement inputGroupAddon = driver.findElement(inputGroupAddonBy);
        inputGroupAddon.click();
        DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        Date yesterday = calendar.getTime();
        String expectedResualt = "Sat Nov 07 22:43:19 EET 2020";
        String actualResual = new String(yesterday.toString());
        Assert.assertEquals(expectedResualt,actualResual);
    }
    @Test
    public void test_9(){
        WebElement table = driver.findElement(tableBy);
        table.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(tableDataSearchBy)).click();
        WebElement taskTableFilter = driver.findElement(taskTableFilterBy);
        taskTableFilter.click();
        taskTableFilter.sendKeys("Emily John");
        taskTableFilter.click();
        String expectedR = "4 Bootstrap 3 Emily John in progress";
        String actualResualt = driver.findElement(actualResualtBy_9).getText();
        Assertions.assertThat(actualResualt).contains(expectedR);
    }
    @Test
    public void test_10(){
        WebElement table = driver.findElement(tableBy);
        table.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(tableFilterBy)).click();
        WebElement exp = driver.findElement(expBy);
        WebElement orange = driver.findElement(orangeBy);
        orange.click();
        List<WebElement> colorOrange = driver.findElements(By.xpath("//div[@class=\"tablefilter\"]//a[@class=\"pull-left\"]//i[@style=\"color:orange;\"]"));
        Assertions.assertThat(colorOrange).contains(exp);
    }

    @Test
    public void test_11(){
        WebElement alertsM = driver.findElement(alertsModalsBy);
        alertsM.click();
        WebElement javaScriptAlert = driver.findElement(javaScriptAlertBy);
        javaScriptAlert.click();
        WebElement clickMeButton = driver.findElement(clickMeButtonBy);
        clickMeButton.click();
        driver.switchTo().alert().dismiss();
        String exp_11 = "You pressed Cancel!";
        String actRes_11 = driver.findElement(actRes_11By).getText();
        Assert.assertEquals(exp_11,actRes_11);
    }
    @Test
    public void test_12(){
        WebElement listBox = driver.findElement(listBoxBy);
        listBox.click();
        WebElement bootstrapListBox = driver.findElement(bootstrapListBoxBy);
        bootstrapListBox.click();
        WebElement listGroupItemActive = driver.findElement(listGroupItemActiveBy);
        listGroupItemActive.click();
        WebElement buttonRight = driver.findElement(buttonRightBy);
        buttonRight.click();
        WebElement right = driver.findElement(rightBy);
        right.click();
    }
    @Test
    public void test_14(){
        WebElement listBox = driver.findElement(listBoxBy);
        listBox.click();
        WebElement jQueryListBox = driver.findElement(jQueryListBoxBy);
        jQueryListBox.click();
        WebElement multiSelect = driver.findElement(multiSelect_14By);
        Select jQueryList = new Select(multiSelect);
        jQueryList.selectByVisibleText("Alice");
        jQueryList.selectByVisibleText("Laura");
        jQueryList.selectByVisibleText("Giovanna");
        WebElement addButton = driver.findElement(addButtonBy);
        addButton.click();
        String expAlice = "Alice";
        String expLaura= "Laura";
        String expGiovanna = "Giovanna";
        String exp_14 = expAlice + "\n"+ expLaura +"\n"+expGiovanna;
        String pickListResualt = driver.findElement(pickListResultBy).getText();
        Assert.assertEquals(exp_14,pickListResualt);
    }
    @Test
    public void test_15() {
        WebElement otherMenu = driver.findElement(otherBy);
        otherMenu.click();
        WebElement dynamicDataLoading = driver.findElement(dynamicDataLoadingBy);
        dynamicDataLoading.click();
        WebElement getNewUser = driver.findElement(getNewUserBy);
        getNewUser.click();
        boolean exp_15_1 = true;
        wait.until(ExpectedConditions.visibilityOfElementLocated(imgBy)).click();
        boolean actRes_15_1 = driver.findElement(imgBy).isEnabled();
        Assert.assertEquals(exp_15_1, actRes_15_1);
        WebElement firstName = driver.findElement(emptyFirstNameBy);
        String textFirstName = firstName.getText();
       /* if (textFirstName.isEmpty()) {
            System.out.println("First Name is empty");
        }
        WebElement lastName = driver.findElement(emptyLastNameBy);
        String textLastName = lastName.getText();
        if (textLastName.isEmpty()) {
            System.out.println("Last Name is empty");
        }*/
    }
   @After
    public void closeBrowser(){

        driver.quit();
    }

}
