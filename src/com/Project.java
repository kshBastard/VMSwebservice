package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class Project 
{
public ArrayList<POJO> GetFeeds(Connection connection,POJO pj) throws Exception
{
ArrayList<POJO> feedData = new ArrayList<POJO>();
try
{
	//POJO pj=new POJO();
	String mno=pj.getMobile();
	System.out.println("project no"+mno);
PreparedStatement ps = connection.prepareStatement("SELECT * FROM entryFrom WHERE mobile=" + "'" + mno + "'" );
System.out.println("ps called");
ResultSet rs = ps.executeQuery();
System.out.println("rs called");
while(rs.next())
{
	//POJO pj=new POJO();
	
	POJO feedObject = new POJO();
	System.out.println("pojocalled");
	System.out.println("pojocalled"+rs.getString("fname"));
feedObject.setFname(rs.getString("fname"));
feedObject.setLastname(rs.getString("Lastname"));
feedObject.setMobile(rs.getString("mobile"));
feedObject.setEmailId(rs.getString("EmailId"));
feedObject.setVisittype(rs.getString("Visittype"));
feedObject.setIdcardtype(rs.getString("Idcardtype"));
feedObject.setIdcardnumber(rs.getString("Idcardnumber"));
feedObject.setAddress(rs.getString("Address"));
feedObject.setRepresenting(rs.getString("Representing"));
feedObject.setRemark(rs.getString("Remark"));
feedObject.setImage(rs.getString("image"));
feedData.add(feedObject);
System.out.println("rs called"+feedData.add(feedObject));
System.out.println("data returned");
}
return feedData;
}
catch(Exception e)
{
throw e;
}
}

}