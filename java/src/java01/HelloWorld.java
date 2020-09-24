package java01;

/**
 * @author wzw
 * @create 2020-09-24 15:16
 */
public class HelloWorld {
	public static  void main(String [] agrs){
		/*
		1.java程序运行步骤
		  1.1将Java代码编写到扩展名为.java的文件中
		  2.2通过Javac编译工具对该java文件进行编译，生产java.class文件
		  2.3通过Java命令对生成的class文件进行运行

		  注意：电脑可能会设置隐藏文件名后缀
		  点击电脑 文件 查看 高级设置 取消隐藏已知文件类型的扩展名
		* */




		/*
		* 2.第一个Java程序hellworld
		* */
		System.out.println("Hello World");
		/*
		* 注意：一个程序都需要一个执行的起点，但只能有一个
		* public static void main(String []) args)
		* 就是程序的入口
		*
		* 如果是在cmd下运行代码，注意文件名是否存在；运行路径是否正确
		* 后缀名隐藏，文件名与类名不一致 参考本程序：文件名 HelloWorld 程序名 也是HolleWorld
		* 文件名也要在classspath路径下或者当前路径下
		* * */

		/*总结：
		      学习编程最容易犯的错误就是语法错误。Java要求你必须按照语法规则
		      编码代码。
		      特别刚开始学习编程的同学来说最容易遇到的问题，比如忘记分号
		      大括号 引号 单词拼写错误，Java编译器会报语法错误，要尝试去
		      看到编译器会报告的错误信息

		*
		* */
	}
}
