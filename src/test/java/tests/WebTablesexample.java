package tests;

import com.cybertek.utilities.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablesexample extends TestBase {

    @Test
    public void printWholeTable() {
        login();
        WebElement table = driver.findElement(By.id("ct1l00_mainContent_orderGrid"));
        System.out.println(table.getText());

    }

    public void login() {

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER);
    }

    @Test
    public void printAllHeaders() {
        login();
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='ct1l00_mainContent_orderGrid']//th"));
        for (WebElement header : headers) {
            System.out.println(header.getText());
        }
    }

    @Test
    public void printRows() {
        login();

        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

        System.out.println("Number of rows " + allRows.size());
        for (WebElement header : allRows) {
            System.out.println(header.getText());
        }
        //print the one row
        System.out.println("printing row " + 3);
        System.out.println(allRows.get(2).getText());
    }

    @Test
    public void printTableSize() {
        login();
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        System.out.println("number of rows " + allRows.size());
        List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/th"));
        System.out.println("numbeers os cols: " + allHeaders);
    }

    //print a row without using a list
    @Test
    public void printRow2() {
        login();
        WebElement row = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[5]"));
        System.out.println(row.getText());
    }

    //print all the cells of a row whose index in the xpath
    @Test
    public void printAllCellsInOneRow() {
        login();
        List<WebElement> cells = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td"));
        for (WebElement header : cells) {
            System.out.println(header.getText());
        }
    }

    //print by cordinates based on roe and column number
    @Test
    public void printByCordinates() {
        login();
        WebElement cell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[3]/td[3]"));
        System.out.println(cell.getText());
        System.out.println(getCell(5, 6).getText());
    }

    //this is Dynamyc
    public WebElement getCell(int row, int col) {
        String xpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + row + "]/td[" + col + "]";
        return driver.findElement(By.xpath(xpath));
    }
    //print all values in asingle column
    @Test
    public void printcolumn() {
        login();
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for (WebElement header : allNames) {
            System.out.println(header.getText());
        } }
        //find the sekect checkbox for a given name
    @Test
    public void selectCheckBox() {
        login();
        WebElement checkbox = driver.findElement
                (By.xpath("//td[.='Susan McLaren]/../td[1]/input"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());
    }
    //verify that Mark is exist in the column and city
    @Test
    public void test() {
        login();
        int nameIndex = getColumnIndex("Name");
        System.out.println(nameIndex);
        List<WebElement> allNames= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th["+nameIndex+"]"));
        boolean found= false;
        for (int i=0; i<allNames.size(); i++){
            if(allNames.get(i).getText().equals("Mark Smith")){
                found=true;
                break;
            }
        }
        Assert.assertTrue(found);

        int cityIndex= getColumnIndex("City");
        List<WebElement> allCities= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th["+cityIndex+"]"));
        for (int i=0; i<allCities.size(); i++){
            if(allCities.get(i).getText().equals("Whitestone,British")){
                //found=true;
                break;
            }
        }

    }
    //get column name as parameteres return index of column name
    public int getColumnIndex(String column){
        List<WebElement> allHeader= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));
        for (int i=0; i<allHeader.size(); i++){
            if(allHeader.get(i).getText().equals(column)){
                return i+1;
            }
        }
        return 0;

    }










}