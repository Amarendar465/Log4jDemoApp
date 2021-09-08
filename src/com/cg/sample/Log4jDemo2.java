package com.cg.sample;


import org.apache.log4j.Logger;

public class Log4jDemo2 {


public static void main(String args[]) {

for(int i=1 ; i<50000; i++) {
System.out.println("Counter = " + i);
log.debug("This is my debug message. Counter = " + i);
               
            }
      }
}
