package com.crafter6789.loztwiprincess.lib;

import org.apache.logging.log4j.Level;

import java.util.ArrayList;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.relauncher.FMLRelaunchLog;

public class MLogHelper {
	
/**	public static void addLogLines (int logType, ArrayList<String> arrayList) {
		switch (logType) {
			default:
				FMLLog.bigWarning("A bad log entry was attempted. LogHelper is in:%s", "com.crafter6789.loztwiprincess.lib.LogHelper");
			case 0:
				FMLRelaunchLog.log(Level.ALL, arrayList.get(1), arrayList.remove(1));
			case 1:
				FMLRelaunchLog.log(Level.TRACE, arrayList.get(1), arrayList.remove(1));
			case 2:
				FMLRelaunchLog.log(Level.DEBUG, arrayList.get(1), arrayList.remove(1));
			case 3:
				FMLRelaunchLog.log(Level.INFO, arrayList.get(1), arrayList.remove(1));
			case 4:
				FMLRelaunchLog.log(Level.WARN, arrayList.get(1), arrayList.remove(1));
			case 5:
				FMLRelaunchLog.log(Level.ERROR, arrayList.get(1), arrayList.remove(1));
			case 6:
				FMLRelaunchLog.log(Level.FATAL, arrayList.get(1), arrayList.remove(1));
			case 7:
				FMLRelaunchLog.log(Level.OFF, arrayList.get(1), arrayList.remove(1));
		}
	}*/
	
	public static void addLogLines (int logType, String format, Object... data) {
		if (logType == 0) {
			FMLLog.log(Level.ALL, format, data);
		}else if (logType == 1){
			FMLLog.log(Level.TRACE, format, data);
		}else if (logType == 2){
			FMLLog.log(Level.DEBUG, format, data);
		}else if (logType == 3){
			FMLLog.log(Level.INFO, format, data);
		}else if (logType == 4){
			FMLLog.log(Level.WARN, format, data);
		}else if (logType == 5){
			FMLLog.log(Level.ERROR, format, data);
		}else if (logType == 6){
			FMLLog.log(Level.FATAL, format, data);
		}else if (logType == 7){
			FMLLog.log(Level.OFF, format, data);
		}else{
				FMLLog.bigWarning("A bad log entry was attempted. LogHelper is in:%s", "com.crafter6789.loztwiprincess.lib.LogHelper");
		}
	}
	
}
