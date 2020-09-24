package java01;/**
 * @author wzw
 * @create 2020-09-22 20:01
 */

public class JavaLanguag {
	public static void main(String[] args) {
		/*Java语言概述

		 */
	/*
    1.java se 标准版：
      支持面向桌面级应用
      Java EE  企业版：
      是为开发企业环境下的应用程序提供一套完整的解决方案
      该技术包括Servlet Jsp
      java ME 小型版
      支持java程序运行在移动端
   */

    /*
		2.java在各领域的应用
		 2.1 企业应用：比如各类网站，淘宝、金融
		 2.3  Android平台应用：
		 2.4  大数据平台开发： Hadoop spark

    */
    /*
        3.
           Java之父是James Goslin 团队开发“Green"项目时
           发型C语言缺少垃圾回收器。
           Java是基于jvM运行在不同的操作系统
           Java舍弃了C语言中容易引起错误的指针

           增加了垃圾回收器功能
    * */

      /*4. Java语言的特点
            面向对象 类 对象
            三大特性：封装 继承 多态

            健壮性：吸收了C语言的优点去掉了指针
            提供了想对安全的内存管理与访问机制

            跨平台性：
            通过不同的Java虚拟机， Java程序可以运行在不同的操作系统

      * */
      /*5. Java两种核心机制
             Java虚拟机
             垃圾回收器
      * */
       /*6.Java 一次编译 多次运行
       * */
       /*7.垃圾回收器
          Java提供了一个系统级的线程 跟踪存储空间
          的分配的情况，并在jvm空闲的时候释放那些存储空间
       * */




       /*7.Java语言的环境搭建
       jdk:java development kit Java开发工具包
       jdk是提供给Java开发工作人员使用的，其中包含了Java的开发工具包
       也包括了jre。
       其中的开发工具：编译工具javac.exe 打包工具jar.exe

       jre:java runtime environment Java运行环境
       包括Java虚拟机和Java程序所需的核心类库

       jdk=jre+开发工具集 比如Javac编译工具
       jre=jvm+java se核心类库

       * */
       /*
       *
       * 8.下载jdk www.sun.com
       * jdk安装网上百度
       * 建议安装路径不要用中文或者空格等特殊符号
       * */
       /*
       * 9.在电脑cmd中运行Java程序 前提下载了jdk
       * 并且设置了环境变量 path 执行文件会去根据path路径去找jdk
       * 第一步在系统环境变量中：建立JAVA_HOME=D:develop/java/jdk1.8.0_31
       * 第二步：把%JAVA_HOME%\bin;加入path路径中
      *  运行程序的命令：第一步javac 程序文件 第二步java 文件命
       *
       * */
	}
}
