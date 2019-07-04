package demo;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class Demo {

	public static void main(String[] args) throws Exception {
		String s="汤姆";
		
		//使用utf-8编码
		String s8 = URLEncoder.encode(s, "utf-8");
		System.out.println("u8:-"+s8);
		
		//使用iso-8859-1解码
		String so = URLDecoder.decode(s8, "iso8859-1");
		System.out.println("iso:-"+so);
		
		/*
		String so_ = URLEncoder.encode(so,"iso8859-1");
		System.out.println(so_);
		
		String s8_ = URLDecoder.decode(so_, "utf-8");
		System.out.println(s8_);*/
		
		/*byte[] bytes = so.getBytes("iso8859-1");
		String sss = new String(bytes, "utf-8");*/
		
		String ss = new String(so.getBytes("iso8859-1"),"utf-8");
		System.out.println(ss);
	}

}
