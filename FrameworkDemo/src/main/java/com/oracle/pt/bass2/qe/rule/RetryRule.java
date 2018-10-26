package com.oracle.pt.bass2.qe.rule;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import com.oracle.pt.bass2.qe.annotation.Retry;

public class RetryRule implements TestRule {

	public RetryRule() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Statement apply(Statement base, Description description) {
		// TODO Auto-generated method stub
		return new Statement() {
			
			@Override
			public void evaluate() throws Throwable {
				// TODO Auto-generated method stub
				Throwable retryThrowable=null;
				Retry retry=description.getAnnotation(Retry.class);
				if(retry!=null) {
					System.out.println("找到了Retry注解");
					int times=retry.runtimes();
					System.out.println("运行次数 : "+times);
					for(int i=0;i<times;i++) {
						try {
							base.evaluate();
							return ;
						} catch (Throwable e) {
							// TODO: handle exception
							retryThrowable=e;
							System.out.println("测试用例："+description.getMethodName()+"正在重试第"+(i+1)+"次");
							
						}
						
					}
					System.err.println("在尝试了"+times+"次后，测试用例："+description.getMethodName()+"最终执行失败了");
					throw retryThrowable;
				}else {
					System.out.println("没找到retry标签");
					base.evaluate();
				}
				
			}
		};
	}

}
