package com.djk.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
　* @description: HashMap
　* @author djk
　* @date 2020/4/8 9:06
  */
public class HashMapMain {

    public static void main(String[] args) {

        Map<Object , Object> hashmap = new HashMap() ;
        hashmap.get("djk") ;
        hashmap.put("djk" , "djk");

        Hashtable<Object, Object> objectObjectHashtable = new Hashtable<Object, Object>();
        objectObjectHashtable.put(1 , 1) ;

        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<Object, Object>();
        objectObjectConcurrentHashMap.put(1 , 1) ;

        System.out.println(ExecutionStatus.RUNNING_EXEUTION.name());
    }
}
