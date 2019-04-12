package com.xrq.aop;
/**
 * 增加一个横切关注点
 * @author Administrator
 *
 */
public class LogHandler
{
    public void logBefore()
    {
        System.out.println("Log before method");
    }
    
    public void logAfter()
    {
        System.out.println("Log after method");
    }
}