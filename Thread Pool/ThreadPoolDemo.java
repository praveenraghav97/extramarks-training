package com.mythreadpool.demo;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		MyThreadPool threadPool = new MyThreadPool(4);
		threadPool.enqueue(new Task1());
		threadPool.enqueue(new Task2());
		threadPool.enqueue(new Task3());
		threadPool.enqueue(new Task4());
	}

	private static class Task1 implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Performing Task: 1");
			}
		}
	}

	private static class Task2 implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Performing Task: 2");
			}
		}
	}
	private static class Task3 implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Performing Task: 3");
			}
		}
	}
	private static class Task4 implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Performing Task: 4");
			}
		}
	}
}
