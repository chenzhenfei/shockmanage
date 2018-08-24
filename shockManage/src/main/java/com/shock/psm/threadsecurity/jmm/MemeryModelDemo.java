package com.shock.psm.threadsecurity.jmm;

import java.util.HashSet;
import java.util.Set;


public class MemeryModelDemo {
    private static int count;
    private static boolean stop;
    public static void initCountAndStop() {
        count = 1;
        stop = false;
    }
    public static void doLoop() {
        while(!stop) {
            count++;
        }
    }
    public static void printResult() {
        System.out.println(count);
        Set<Boolean> a =new HashSet<Boolean>();
        while(a.size()<=1){
        	a.add(stop);
        };
        System.out.println(a.stream().count());
    }
	public static void main(String[] args){
        Thread a =new Thread(()->{
        	initCountAndStop();
        	doLoop();
        });
        
        Thread b = new Thread(()->{
        	try {
//				a.join();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	printResult();
        });
        try {
        	a.start();
			b.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        
//        System.out.println(count);
//        System.out.println(stop);
//        
        
	}
	
    
}
