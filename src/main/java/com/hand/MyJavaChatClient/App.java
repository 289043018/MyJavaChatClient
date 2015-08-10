package com.hand.MyJavaChatClient;

import java.awt.EventQueue;

import JF.MainWindow;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
					ChatManager.getCM().setWindow(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
