package com.greatlearning.driver;

import com.greatlearning.services.BalancingBrackets;

  public class Driver {
    public static void main(String[] args){
    String bracketsExpression = "([[{}]])";
    Boolean result;
    result = BalancingBrackets.checkingbalancedbrackets(bracketsExpression);
    if(result)
    System.out.println("The entered String has Balanced Brackets");
    else
    System.out.println("The entered Strings do not contain Balanced Brackets");
    }
  }


 