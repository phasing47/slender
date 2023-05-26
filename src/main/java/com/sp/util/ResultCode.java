package com.sp.util;

public enum ResultCode {
   SUCCESS(200,"Success"),
    ERROR(201,"Error");
   private Integer code;
   private String msg;

   ResultCode(Integer code,String msg){
       this.code = code;
       this.msg= msg;
   }
   public Integer getCode(){
       return code;
   }
   public String getMsg(){
       return msg;
   }
}
