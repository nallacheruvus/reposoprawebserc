package com.sat.hos;

import javax.xml.ws.Endpoint;

import com.sat.impl.NFaceImpl;

public class HosterMn {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:3343/ws/first", new NFaceImpl());
		System.out.println("Service Hosted");
	}
}
