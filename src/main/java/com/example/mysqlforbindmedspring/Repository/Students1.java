package com.example.mysqlforbindmedspring.Repository;

public class Students1 {

  private int id1;
  private String name1;
  private String email;
  private boolean gender;

  Students1(int id, String name,String email,boolean gender){
    this.id1 =id;
    this.name1 =name;
    this.email =email;
    this.gender = gender;
  }

  public String getName1() {
    return name1;
  }

  public int getId1() {
    return id1;
  }

  public String getEmail() {
    return email;
  }

  public boolean isGender() {
    return gender;
  }

  public void setName1(String name) {
    this.name1 = name;
  }

  public void setId1(int id) {
    this.id1 = id;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setGender(boolean gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Students1{" +
        "id1=" + id1 +
        ", name1='" + name1 + '\'' +
        ", email='" + email + '\'' +
        ", gender=" + gender +
        '}';
  }
}
