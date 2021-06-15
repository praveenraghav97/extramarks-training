package com.mythreadpool.demo;

import java.util.LinkedList;

public class MyThreadPool {
	
	private WorkerThread[] threadList;
	private LinkedList<Runnable> taskQueue;
	
	private class WorkerThread extends Thread {
		public void run() {
			Runnable r;
			while(true) {
				synchronized (taskQueue) {
					while(taskQueue.isEmpty()) {
						try {
							taskQueue.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}						
					}
					
					r = (Runnable) taskQueue.removeFirst();										
				}
				try {
					r.run();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void enqueue(Runnable r) {
		synchronized (taskQueue) {
			taskQueue.addLast(r);
			taskQueue.notify();
		}		
	}	
	
	public MyThreadPool(int numberOfThreads) {
		this.taskQueue = new LinkedList<Runnable>();
		this.threadList = new WorkerThread[numberOfThreads];
		
		for(int i = 0; i < this.threadList.length; i++) {
			threadList[i] = new WorkerThread();
			threadList[i].start();
		}
	}	
	
}
