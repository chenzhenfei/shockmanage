package com.shock.psm.threadsecurity.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;


/**
 * 循环屏障 --CyclicBarrier ：它要做的事情是，让一组线程到达一个屏障（也可以叫同步点）时被阻塞，直到最后一个线程到达屏障时，屏障才会开门，所有被屏障拦截的线程才会继续干活
 * date: 2018年8月21日 上午11:53:54 <br/>  
 * @author czf
 * @version
 */
public class CyclicBarrierDemo {
	
	public static void main(String[] args){
		CyclicBarrier a =new CyclicBarrier(2) ; 
//		new Thread(()->{
//			try {
//				System.out.println("...屏障一到了，等待");
//				a.await();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("...我执行完了1");
//		}).start();
//		
//		new Thread(()->{
//			try {
//				System.out.println("...屏障二到了，等待");
//				a.await();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("...我执行完了2");
//		}).start();
//		new Thread(()->{
//			try {
//				System.out.println("...屏障三到了，等待");
//				a.await();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("...我执行完了3");
//		}).start();
		
		try {
			System.out.println("...屏障四到了，等待");
			a.await();
			System.out.println("...我执行完了4");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
