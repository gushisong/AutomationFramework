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
					System.out.println("Retry");
					int times=retry.runtimes();
					System.out.println("尝试执行次数 : "+times);
					for(int i=0;i<times;i++) {
						try {
							base.evaluate();
							return ;
						} catch (Throwable e) {
							// TODO: handle exception
							retryThrowable=e;
							System.out.println("尝试执行"+description.getMethodName()+"第"+(i+1)+"次");
							
						}
						
					}
					System.err.println("�ڳ�����"+times+"�κ󣬲���������"+description.getMethodName()+"����ִ��ʧ����");
					throw retryThrowable;
				}else {
					System.out.println("û�ҵ�retry��ǩ");
					base.evaluate();
				}
				
			}
		};
	}

}
