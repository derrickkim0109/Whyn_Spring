package com.springlec.whyn.notice;

import java.sql.Timestamp;

public class NoticeDto {
	
	String nno;
	String ntitle;
	String ncontent;
	Timestamp ninsertdate ;
	int nviewcount;
	String nSearchBar;
	String nSearchBox;
	public NoticeDto(String nno, String ntitle, String ncontent, Timestamp ninsertdate, int nviewcount,
			String nSearchBar, String nSearchBox) {
		super();
		this.nno = nno;
		this.ntitle = ntitle;
		this.ncontent = ncontent;
		this.ninsertdate = ninsertdate;
		this.nviewcount = nviewcount;
		this.nSearchBar = nSearchBar;
		this.nSearchBox = nSearchBox;
	}
	public String getNno() {
		return nno;
	}
	public void setNno(String nno) {
		this.nno = nno;
	}
	public String getNtitle() {
		return ntitle;
	}
	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}
	public String getNcontent() {
		return ncontent;
	}
	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}
	public Timestamp getNinsertdate() {
		return ninsertdate;
	}
	public void setNinsertdate(Timestamp ninsertdate) {
		this.ninsertdate = ninsertdate;
	}
	public int getNviewcount() {
		return nviewcount;
	}
	public void setNviewcount(int nviewcount) {
		this.nviewcount = nviewcount;
	}
	public String getnSearchBar() {
		return nSearchBar;
	}
	public void setnSearchBar(String nSearchBar) {
		this.nSearchBar = nSearchBar;
	}
	public String getnSearchBox() {
		return nSearchBox;
	}
	public void setnSearchBox(String nSearchBox) {
		this.nSearchBox = nSearchBox;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}//-------------
