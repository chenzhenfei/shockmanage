package com.shock.psm.excutorpool;

import java.util.TimerTask;

public class RunableTest extends TimerTask{
		
		@Override
		public boolean cancel() {
			// TODO Auto-generated method stub
			return super.cancel();
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
}
