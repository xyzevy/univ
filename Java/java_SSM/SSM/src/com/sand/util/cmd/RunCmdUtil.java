package com.sand.util.cmd;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.stereotype.Component;

@Component
public class RunCmdUtil {
	
	public boolean executeMR(String command){
		Runtime runtime = Runtime.getRuntime();
		try {
			Process process = runtime.exec(command);
			InputStream inputStream = process.getInputStream();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String string = "";
			while ((string = bufferedReader.readLine()) != null) {
				if ("Congratulations!".equals(string)) {
					break;
				}
			}
			process.waitFor();
			bufferedReader.close();
			inputStream.close();
			process.destroy();
			if ("Congratulations!".equals(string)) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean executeCommand(String command){
		Runtime runtime = Runtime.getRuntime();
		try{
			Process process = runtime.exec(command);
			process.waitFor();
			process.destroy();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

}
