package net.epsilonlabs.datamanagementefficient.test;

import net.epsilonlabs.datamanagementefficient.library.DataManager;
import android.content.Context;

public class TestThread extends Thread{
	
	private DataManager dm;
	
	public TestThread(Context context){
		this.dm = DataManager.getInstance(context);
	}
	
	@Override
	public void run() {
		super.run();
		dm.open();
		dm.add(new DataSample());
		dm.close();
	}
}
