package pers.william.po;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class RequestThread extends Thread{

	private Socket socket;
	
	public RequestThread(Socket socket){
		this.socket = socket;
	}
	
	public void run(){

		BufferedReader reader = null;
		PrintStream writer = null;
		try {
			writer = new PrintStream(socket.getOutputStream());
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(reader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(reader==null||writer==null)return ;
		
		String msg = ((Integer)((int)Math.random()*9000+1000)).toString();
		writer.println("GET " + msg + " HTTP /1.1");
		writer.flush();
		try {
			System.out.println(reader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.println("GET " + "end" + " HTTP /1.1");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
