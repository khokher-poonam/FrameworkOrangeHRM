package com.Frame.qa.TestCases;

import com.Frame.qa.data.ExcelData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExcelDataResult {
    //#######################For retrieve Login Excel sheet data################
    @Test
    public void test()
    {
        ExcelData excelData=new ExcelData();
        List<Object[]> data=excelData.getDataFromSheet( "Login");
        data.forEach(s->System.out.println(Arrays.toString(s)));
    }

    @Test(dataProvider="loginProvider" ,dataProviderClass = ExcelData.class)
    public void test(String Username,String password){
        System.out.println(Username);
        System.out.println(password);
    }
    //#######################For retrieve Contact Excel sheet data################
    @Test
    public void test2()
    {
        ExcelData excelData=new ExcelData();
        List<Object[]> data=excelData.getDataFromSheet( "Contact");
        data.forEach(s->System.out.println(Arrays.toString(s)));
    }
////////////////////////////////////////////////////////////////////////////////////////

    @Test(dataProvider = "dummyDataProvider")
    public void test(String name, int num){
        System.out.println("testing");
        System.out.println(name + "  "+ num);
    }

    @DataProvider
    public Object[][] dummyDataProvider(){
        return new Object[][] {
                {"Ritik",11} ,
                {"Devansh",12}
        };
    }

    @DataProvider
    public Iterator<Object []> anotheDataProvider(){
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"Cat", 23});
        data.add(new Object[]{"Dog", 90});
        return data.iterator();
    }

}
