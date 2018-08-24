package com.shock.psm.threadsecurity.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * 计数器  --countDownLatch
 * date: 2018年8月21日 上午11:53:10 <br/>  
 * @author czf
 * @version
 */

/**
 * 使用场景：
 * （1）实现最大的并行性：有时我们想同时启动多个线程，实现最大程度的并行性。
 * 例如，我们想测试一个单例类。如果我们创建一个初始计数为1的CountDownLatch，
 * 并让所有线程都在这个锁上等待，那么我们可以很轻松地完成测试。我们只需调用 一次countDown()方法就可以让所有的等待线程同时恢复执行。
（2）开始执行前等待n个线程完成各自任务：例如应用程序启动类要确保在处理用户请求前，所有N个外部系统已经启动和运行了。
（3）死锁检测：一个非常方便的使用场景是，你可以使用n个线程访问共享资源，在每次测试阶段的线程数目是不同的，并尝试产生死锁。
 */
public class CountDownLatchDemo {
	
	
	private static CountDownLatch a =new CountDownLatch(2);
	
	public static void main(String[] args){
		
		new Thread(()->{
			a.countDown();
			System.out.println("...我执行完了1");
		}).start();
		new Thread(()->{
			a.countDown();
			System.out.println("...我执行完了2");
		}).start();
		new Thread(()->{
			a.countDown();
			System.out.println("...我执行完了3");
		}).start();
		
		try {
			a.await();
			System.out.println("...我执行完了4");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
