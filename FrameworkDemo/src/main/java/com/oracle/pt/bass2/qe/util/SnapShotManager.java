package com.oracle.pt.bass2.qe.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.databene.commons.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class SnapShotManager {

	public SnapShotManager() {
		// TODO Auto-generated constructor stub
	}
	public static void getScreenshot(String filename) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss_SSS");
		String time=df.format(new Date());
		String path=System.getProperty("user.dir")+File.separator+"image"+File.separator+filename+"_"+time+".png";
		System.out.println(path);
		File sourceFile=((TakesScreenshot)WebDriverManager.getWebDriver()).getScreenshotAs(OutputType.FILE);
		File targetFile=new File(path);
		
		try {
			FileUtil.copy(sourceFile, targetFile, true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
