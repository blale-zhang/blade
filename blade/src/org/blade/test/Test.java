package org.blade.test;

import com.alibaba.druid.util.HttpClientUtils;

public class Test {
	
	public static void post(){
		
		String url = "http://s.360.cn/w360/c.htm?p=huajiao&u=http%3A%2F%2Fwww.huajiao.com%2Fl%2F43211544%2F&id=139759029.3518102620702662700.1465561176516.23&guid=139759029.3518102620702662700.1465561176516.23&f=http%3A%2F%2Fwww.huajiao.com%2Fl%2F43211544%23%23%23&c=&cId=bk%3Aplayer-praises&t=1477223720753";
		
		String url2 = "http://haostat.qihoo.com/haoclk.gif?p=hao360_huajiao&u=http%3A%2F%2Fwww.huajiao.com%2Fl%2Flive&id=139759029.3518102620702662700.1465561176516.23&guid=139759029.3518102620702662700.1465561176516.23&f=http%3A%2F%2Fwww.huajiao.com%2Fl%2F43211544%23%23%23&c=&cId=bk%3Aplayer-praises&t=1477224463759";
		
		
		while(true){
			
			HttpClientUtils.post(url, "dd", 200);
			HttpClientUtils.post(url2, "dd", 200);
		}
		
	}
	
	public static void main(String[] args) {
		Test.post();
	}

}
