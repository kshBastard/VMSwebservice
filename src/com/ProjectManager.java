package com;

import java.sql.Connection;
import java.util.ArrayList;

public class ProjectManager {

public ArrayList<POJO> GetFeeds(POJO pj)throws Exception {
ArrayList<POJO> feeds = null;
try {
Database database= new Database();
Connection connection = database.Get_Connection();
System.out.println("connection start");
Project project= new Project();
feeds=project.GetFeeds(connection, pj);
}
catch (Exception e) {
throw e;
}
return feeds;
}

}