package com.shock.psm.excutorpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadStatusTest {
	private static ExecutorService es = new ThreadPoolExecutor(5, 100, 0L,
			TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(100000));
	
	/**
	 * es_cached :缓冲池
	 */
	private static ExecutorService es_cached = Executors.newCachedThreadPool();
	
	/**
	 * es_fixed :固定池
	 */
	private static ExecutorService es_fixed = Executors.newFixedThreadPool(3);
	
	/**
	 * 单线程 池子
	 */
	private static ExecutorService es_single =Executors.newSingleThreadExecutor();
	
	/**
	 * 定时调度 池子
	 */
	private static ScheduledExecutorService es_schedule =Executors.newScheduledThreadPool(3);
	
	
	
	public static void main(String[] args) throws Exception {
//		cacheExec();
		fixedExec();
//		singleExec();
//		scheduleExec();
		ThreadPoolExecutor tpe = ((ThreadPoolExecutor) es_cached);

		while (true) {
			System.out.println();

			int queueSize = tpe.getQueue().size();
	
			System.out.println("当前排队线程数：" + queueSize);

			int activeCount = tpe.getActiveCount();
			System.out.println("当前活动线程数：" + activeCount);

			long completedTaskCount = tpe.getCompletedTaskCount();
			System.out.println("执行完成线程数：" + completedTaskCount);

			long taskCount = tpe.getTaskCount();
			System.out.println("总线程数：" + taskCount);

			Thread.sleep(3000);
		}
		
	}
	
	
	/**
	 * 
	 * 缓冲池： 先查看池中是否存在之前建立过的线程还未终止的线程 ，如果有就reuse，
	 * 否则就创建新的线程使用  ,判断是否reuse 是通过默认60s 的 timeout
	 * <br/>  
	 * @author czf 
	 * 2018年8月13日下午4:03:06
	 */
	public static void cacheExec(){
		for (int i = 0; i < 10; i++) {
			if(i==9){
				try {
					Thread.sleep(70000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
			es_cached.execute(()->{
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(10000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
		
	}
	
	
	public static void fixedExec(){
		for (int i = 0; i < 10; i++) {
			es_fixed.execute(()->{
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
		
	} 
	
	public static void singleExec(){
		for (int i = 0; i < 10; i++) {
			es_single.execute(()->{
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
		
	} 
	
	public static void scheduleExec(){
		for (int i = 0; i < 10; i++) {
			es_schedule.schedule((()->{
				System.out.println(Thread.currentThread().getName()+"delay 3 seconds");
			}),3, TimeUnit.SECONDS);
		}
		
	} 
	
	
	
}
