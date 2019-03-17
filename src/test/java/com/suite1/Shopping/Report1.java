package com.suite1.Shopping;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Report.class)
public class Report1 {

	
@Test
public void testRealReportOne(){
	Assert.assertTrue(true);
	
}
@Test

public void testRealReportTwo(){

    Assert.assertTrue(false);

}
@Test(dependsOnMethods="testRealReportTwo")

public void testRealReportThree(){

    

}



}
