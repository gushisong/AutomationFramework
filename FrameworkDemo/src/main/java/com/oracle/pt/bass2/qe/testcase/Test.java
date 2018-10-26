package com.oracle.pt.bass2.qe.testcase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.oracle.pt.bass2.qe.util.Constants;
import com.oracle.pt.bass2.qe.util.WebDriverManager;

import net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		String filename="test";
		System.out.println(System.getProperty("user.dir")+File.separator+"image"+File.separator+filename+".png");
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss");
		System.out.println(df.format(new Date() ));
	}

}
