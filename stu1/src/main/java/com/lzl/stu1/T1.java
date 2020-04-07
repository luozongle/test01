package com.lzl.stu1;

import org.junit.Test;
import org.nutz.lang.Lang;
import org.nutz.lang.stream.StringOutputStream;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class T1 {
//    public static void main(String[] args) {
//        Student s1=new Student(1,"张三",10,1);
//        Map<String, Object> stringObjectMap = Lang.obj2map(s1);
//
//        stringObjectMap.forEach((k,v)->System.out.println(k+"   "+v));
//        System.out.println("==================");
//        System.out.println(stringObjectMap.toString());
//        System.out.println(stringObjectMap instanceof HashMap);
//        System.out.println(s1);
//    }


    @Test
    public void t1(){
       String s="111";
        System.out.println(s);
        s+="222";
        System.out.println(s);
    }
}
