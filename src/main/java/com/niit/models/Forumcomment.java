package com.niit.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table

public class Forumcomment {
	@Id
	@GeneratedValue
	private int fcid;
	public int getFcid() {
		return fcid;
	}
	public void setFcid(int fcid) {
		this.fcid = fcid;
	}
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFcdescription() {
		return fcdescription;
	}
	public void setFcdescription(String fcdescription) {
		this.fcdescription = fcdescription;
	}
	public Date getCommenttime() {
		return commenttime;
	}
	public void setCommenttime(Date commenttime) {
		this.commenttime = commenttime;
	}
	
	private int fid;
	private String fcdescription;
	private Date commenttime;
    public int getFuserid() {
		return fuserid;
	}
	public void setFuserid(int fuserid) {
		this.fuserid = fuserid;
	}
	private int fuserid;
	

}
