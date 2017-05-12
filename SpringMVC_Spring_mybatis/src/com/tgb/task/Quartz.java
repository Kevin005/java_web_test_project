package com.tgb.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class Quartz extends QuartzJobBean {
	/**
	 * 定时任务，执行方法
	 * */
	public void tips(){
		System.out.println("time+++++++++++++:");
	}

	public void executeAction(){
		System.out.println("time+++++++++++++:");
	}

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("time+++++++++++++:");
	}

}
