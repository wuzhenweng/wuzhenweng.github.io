package java01;

/**
 * @author wzw
 * @create 2020-09-24 15:52
 */
public class Comment {
	public static  void main(String [] agrs){
//		注释
		/*
		注释主要用于说明解释程序的文字就是注释
		程序功能是什么
		提高代码的阅读性：调试程序的重要方法
		注释的内容不会被jvm解释执行
		* */

		//单行注释
		/*多行注释：多行注释李不允许嵌套*/
		/*
		文档注释Java特有
		被注释的内容可以被jdk
		提供的工具文javadoc所解析，生产一套以网页件形式体现的该程序
		的说明文档
		命令：javadoc -d mydoc -author -version Comment.Java

		* */

		/*简单总结
		    java源文件一“.java”为扩展名。
		    源文件的基本组成部分是类

		    Java应用的程序入口是main()方法
		    public static void main(String [] args){}

		    Java语言严格区分大小写

		    Java方法由一条条语句构成，每个语句以；结束
		    括号都是成对出现，缺一不可

		    特别：一个源文件中最多只有一个public类。其它类不限，
		    如果源文件包含一个public类，则文件名必须与程序名一致
		* */

	}
}
