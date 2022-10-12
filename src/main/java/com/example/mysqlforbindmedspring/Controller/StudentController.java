package com.example.mysqlforbindmedspring.Controller;

import com.example.mysqlforbindmedspring.Repository.Students1;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class StudentController {
  @RestController("/")
  public List<Students1> index(){

  }
}
