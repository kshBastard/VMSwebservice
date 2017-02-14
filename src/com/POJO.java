package com;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class POJO  implements Serializable{
	@SerializedName("fname")
	String fname;

	@SerializedName("Lastname")
	String Lastname;
	@SerializedName("image")
	String image;
	@SerializedName("time")
	String time;
	@SerializedName("mobile")
	String mobile;

	@SerializedName("EmailId")
	String EmailId;

	@SerializedName("visittype")
	String visittype;

	@SerializedName("Idcardtype")
	String Idcardtype;

	@SerializedName("Idcardnumber")
	String Idcardnumber;

	@SerializedName("Address")
	String Address;
	@SerializedName("Representing")
	String Representing;
	@SerializedName("Remark")
	String Remark;

	@SerializedName("Visitpurpose")
	String Visitpurpose;

	@SerializedName("persontomeet")
	String persontomeet;

	@SerializedName("duration")
	String duration;
	
	@SerializedName("Area")
	String Area;
	
	@SerializedName("material1")
	String material1;
	@SerializedName("serialNo1")
	String serialNo1;
	@SerializedName("material2")
	String material2;
	
	@SerializedName("serialNo2")
	String serialNo2;
	


	
	

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getVisittype() {
		return visittype;
	}

	public void setVisittype(String visittype) {
		this.visittype = visittype;
	}

	public String getIdcardtype() {
		return Idcardtype;
	}

	public void setIdcardtype(String idcardtype) {
		Idcardtype = idcardtype;
	}

	public String getIdcardnumber() {
		return Idcardnumber;
	}

	public void setIdcardnumber(String idcardnumber) {
		Idcardnumber = idcardnumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getRepresenting() {
		return Representing;
	}

	public void setRepresenting(String representing) {
		Representing = representing;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	public String getVisitpurpose() {
		return Visitpurpose;
	}

	public void setVisitpurpose(String visitpurpose) {
		Visitpurpose = visitpurpose;
	}

	public String getPersontomeet() {
		return persontomeet;
	}

	public void setPersontomeet(String persontomeet) {
		this.persontomeet = persontomeet;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getMaterial1() {
		return material1;
	}

	public void setMaterial1(String material1) {
		this.material1 = material1;
	}

	public String getSerialNo1() {
		return serialNo1;
	}

	public void setSerialNo1(String serialNo1) {
		this.serialNo1 = serialNo1;
	}

	public String getMaterial2() {
		return material2;
	}

	public void setMaterial2(String material2) {
		this.material2 = material2;
	}

	public String getSerialNo2() {
		return serialNo2;
	}

	public void setSerialNo2(String serialNo2) {
		this.serialNo2 = serialNo2;
	}

	/*@Override
	public String toString() {
		return "POJO [fname=" + fname + ", Lastname=" + Lastname + ", image="
				+ image + ", mobile=" + mobile + ", EmailId=" + EmailId
				+ ", visittype=" + visittype + ", Idcardtype=" + Idcardtype
				+ ", Idcardnumber=" + Idcardnumber + ", Address=" + Address
				+ ", Representing=" + Representing + ", Remark=" + Remark
				+ ", Visitpurpose=" + Visitpurpose + ", persontomeet="
				+ persontomeet + ", time=" + time + ", duration=" + duration
				+ ", Area=" + Area + ", material1=" + material1
				+ ", serialNo1=" + serialNo1 + ", material2=" + material2
				+ ", serialNo2=" + serialNo2 + "]";
	}*/
	
}