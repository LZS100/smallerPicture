package com.linzs.smallerPicture;

import java.io.File;

public class Test implements Runnable {
	private String name;
	 public Test(String name){
		this.name = name;
	}
	@Override
	public void run (){
		while(true) {
			System.out.println(name + "线程运行");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}
