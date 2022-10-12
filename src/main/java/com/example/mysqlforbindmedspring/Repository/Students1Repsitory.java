package com.example.mysqlforbindmedspring.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Students1Repsitory {

  private Connection con = DatabaseConectionManeger.getConnection();
  public List<Students1> getAllStudents1(){
    List<Students1> students = new ArrayList<>();

    PreparedStatement psts = null;
    try {
      psts = con.prepareStatement("SELECT * from kea.student1");
      ResultSet resultSet = psts.executeQuery();

      while (resultSet.next()){
        students.add(new Students1(
            resultSet.getInt("id1"),
            resultSet.getString("name1"),
            resultSet.getString("email"),
            resultSet.getBoolean("gender")
        ));
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return students;
  }

  public Students1 getStudent(int id){

    try {
      PreparedStatement pstp = con.prepareStatement("Select * From kea.student1");
      pstp.setInt(id, id);
      pstp.setString(id, "");
      ResultSet resultSet1 = pstp.executeQuery();


    }
    catch (SQLException e){
      e.printStackTrace();
    }


    return null;
  }
}
