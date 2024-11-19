package com.sat.mods;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Books implements Serializable {
		public Books() {
		}
		public Books(int a,String b,String c) {
			this.bid=a;
			this.bname=b;
			this.bauth=c;
		}
		private int bid;
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname = bname;
		}
		public String getBauth() {
			return bauth;
		}
		public void setBauth(String bauth) {
			this.bauth = bauth;
		}
		private String bname;
		private String bauth;
}
