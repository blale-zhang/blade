package org.blade.rpc;

public class HelloDubbo implements IHelloDubbo {

	public String greeting(){
		return "hello dubbo!";
	}
}
