package net.ssln.fangcun.gupiao.util;

import java.util.UUID;

public  class StringUtil {

	public static String getUUID(){
		String uuid = UUID.randomUUID().toString(); 
		uuid = uuid.replace("-", "");
		return uuid;
	}
}
