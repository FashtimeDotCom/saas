package com.dcl.blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class VipVideoMessageZan {
	private long id;
	private long vipVideoMessageId;
	private long createVipId;
	private String createVipName;
	private long createUsrTableId;
	private String touXiangImage;
	@Id
	@GeneratedValue
	@GenericGenerator(name="generator",strategy="increment")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column
	public long getVipVideoMessageId() {
		return vipVideoMessageId;
	}
	public void setVipVideoMessageId(long vipVideoMessageId) {
		this.vipVideoMessageId = vipVideoMessageId;
	}
	@Column
	public long getCreateVipId() {
		return createVipId;
	}
	public void setCreateVipId(long createVipId) {
		this.createVipId = createVipId;
	}
	@Column
	public String getCreateVipName() {
		return createVipName;
	}
	public void setCreateVipName(String createVipName) {
		this.createVipName = createVipName;
	}
	@Column
	public long getCreateUsrTableId() {
		return createUsrTableId;
	}
	public void setCreateUsrTableId(long createUsrTableId) {
		this.createUsrTableId = createUsrTableId;
	}
	@Column
	public String getTouXiangImage() {
		return touXiangImage;
	}
	public void setTouXiangImage(String touXiangImage) {
		this.touXiangImage = touXiangImage;
	}
	
}
