package zhu.data;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CcShop {

	public static void main(String[] args) throws IOException {
		if (args[0] == null) {
			System.out.println("no args[0]");
			return;
		}
		//G:/tmp/ccshop1.txt
		readFile(args[0]);
	}
	
	public static void readFile(String pathname) throws IOException{
		try {
			InputStream is = new FileInputStream(pathname);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(is,"gbk"));
			int count = 0;
			// 读取一行，存储于字符串列表中

			Set<String> names = new HashSet<String>();
			Set<String> locationSet = new HashSet<String>();
			Map<String, HashMap<String, Integer>> userInfos = new HashMap<String, HashMap<String,Integer>>();
		    for (String line = bReader.readLine(); line != null; line = bReader.readLine()) {
		        line = line.trim();
		        //分析用户名
		        String nameQuote = line.split(",")[0];
		        String username = nameQuote.substring(1, nameQuote.length()-1);
		        String location = bReader.readLine().trim();
		        String numString = bReader.readLine().split(",")[1].trim();
		        
		        names.add(username);
		        locationSet.add(location);
		        HashMap<String, Integer> info = userInfos.get(username);
		        if (info != null) {
					info.put(location, Integer.valueOf(numString));
				}else {
					info = new HashMap<String, Integer>();
					info.put(location, Integer.valueOf(numString));
					userInfos.put(username, info);
				}
//		        System.out.println(count);
//		        count++;
//		        if (count > 100) {
//					break;
//				}
		    }
//		    System.out.println("size:"+names.size());
		    bReader.close();
		    Data2Excel.save2Excel(names, locationSet, userInfos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void tailRead(String pathname){
		try {
			RandomAccessFile raf = new RandomAccessFile(pathname, "r");
			long len;
			len = raf.length();

			if (len<=3) {
				System.out.println("the file is null");
				return;
			}
			long pos = len -1;
			int count = 0;
			while(pos > 0){
				--pos;
				raf.seek(pos);
				if (raf.readByte() == '\n') {
//					System.out.println(changeCharset(raf.readLine(), ));
					count++;
					if (count > 20) {
						return;
					}
				}
			}
			raf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String changeCharset(String str, String newCharset){
		   //用默认字符编码解码字符串。
		byte[] bs = str.getBytes();
		   //用新的字符编码生成字符串
		try {
			return new String(bs, newCharset);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
