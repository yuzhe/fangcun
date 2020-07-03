package net.ssln.fangcun.collection.util;

import java.util.Random;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.TimeUnit;




public class StringUtil {


	public static String getUUID() {
		String uuid = UUID.randomUUID().toString();//转化为String对象  
        uuid = uuid.replace("-", "");
        return uuid;
         
	}




}
