package com;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.message.internal.MediaTypes;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mysql.jdbc.Statement;


@Path("/WebService")
public class FeedService {

private String name1;

/*@GET
@Path("/GetFeeds")
@Produces("application/json")
public String feed()
{
String feeds = null;
try 
{
ArrayList<POJOField> feedData = null;
ProjectManager projectManager= new ProjectManager();
feedData = projectManager.GetFeeds();
System.out.println("feed data called");
Gson gson = new Gson();
System.out.println(gson.toJson(feedData));
feeds = gson.toJson(feedData);
}

catch (Exception e)
{
System.out.println("Exception Error"); //Console 
}
return feeds;
}*/

//////  Search data ///////

@POST
@Path("/GetFeeds")
@Produces("application/json")
@Consumes({MediaType.APPLICATION_JSON})
public String feed(String mdata)
{
String feeds = null;
try 
{
	Gson gson = new Gson();
	//Gson g=new Gson();
	POJO p=gson.fromJson(mdata,POJO.class);
	System.out.println("mobile"+p.getMobile());
ArrayList<POJO> feedData = null;
ProjectManager projectManager= new ProjectManager();
feedData = projectManager.GetFeeds( p);
System.out.println("feed data called");

System.out.println(gson.toJson(feedData));
feeds = gson.toJson(feedData);
}

catch (Exception e)
{
System.out.println("Exception Error"); //Console 
}
return feeds;
}

/*@POST 
@WebMethod
//@Path (value="/add/{name}/{desig}/{salary}")
@Path (value="/add")
@Produces(MediaType.APPLICATION_JSON)
public String execMAJ(@PathParam(value="name")String name,
                          @PathParam(value="desig")String desig,
        @PathParam(value="salary")String salary ) throws Exception  {
	//String name1=null;
	//this.name1=name;
	POJOField pf=new POJOField();
	Database database= new Database();
    Connection connection = database.Get_Connection();
    System.out.println("connection start");
	
  String req;
      req="INSERT INTO user (name,desig,salary) values(?,?,?)";
      //int r=0;
      ProjectManager projectManager= new ProjectManager();
      feedData = projectManager.GetFeeds();
      
      PreparedStatement st= connection.prepareStatement(req);
     // System.out.println(st);
     st.setString(1,name);// pf.getFname());
     System.out.println(name);
     st.setString(2, desig);
     st.setString(3, salary);
    st.executeUpdate();
      System.out.println(st);
      
  return "succee d'ajout";
}*/
/*
/**
 * Method to insert uname and pwd in DB
 * 
 * @param fname
 * @param Lastname
 * @param image
 * @param EmailId
 * @param visittype
 * @param Idcardtype
 * @param Idcardnumber
 * @param Address
 * @param Representing
 * @param Remark
 * @param mobile
 * @return
 * @throws SQLException
 * @throws Exception
 */
@POST 
@WebMethod

@Path ("/add")	
@Produces("application/json")
@Consumes({MediaType.APPLICATION_JSON})
public String execMAJ( String data //String fname/*,String Lastname  ,String image,String mobile,String EmailId,*/
		//String visittype,String Idcardtype,String Idcardnumber,String Address,
		) throws Exception  {
	System.out.println("data "+data);
	
	POJO pf=new POJO();
	
	Gson g=new Gson();
	POJO p=g.fromJson(data,POJO.class);
	System.out.println("fname"+p.getFname());
	//pf.setFname(bean.getFname());
	
     
    
     
	Database database= new Database();
    Connection connection = database.Get_Connection();
    System.out.println("connection start");
	
  String req;
      req="INSERT INTO  entryFrom values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
     
      
      PreparedStatement st= connection.prepareStatement(req);
     // System.out.println(st);
     st.setString(1,p.getFname());// pf.getFname());
     //System.out.println(fname);
  
     st.setString(2,p.getLastname());
     System.out.println(p.getLastname());
     st.setString(3,p.getImage());
     st.setString(4, p.getMobile());
     st.setString(5,p.getEmailId());
     st.setString(6,p.getVisittype());
     st.setString(7,p.getIdcardtype());
     st.setString(8,p.getIdcardnumber());
     st.setString(9,p.getAddress());
     st.setString(10,p.getRepresenting());
     st.setString(11,p.getRemark());
     st.setString(12,p.getVisitpurpose());
   
     st.setString(13,p.getPersontomeet());
     st.setString(14,p.getTime());
     st.setString(15,p.getDuration());
     st.setString(16,p.getArea());
     st.setString(17,p.getMaterial1());
     st.setString(18,p.getSerialNo1());
     st.setString(19,p.getMaterial2());
     st.setString(20,p.getSerialNo2());
     
     
     
     
    // st.setString(2, desig);
     //st.setString(3, salary);
    st.executeUpdate();
      System.out.println(st);
      
  return "succee d'ajout";
}

}