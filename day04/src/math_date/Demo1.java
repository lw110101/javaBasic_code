package math_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 日期类Date
Calendar
	getInstance()  获取当前系统时间日历<相当于获取一个对象>
	calendar.get(int)  获取年月日时分秒
	年：int=Calendar.YEAR    
	月：int=Calendar.MONTH+1;
	<日，时，分，秒> 对应：DATA--HOUR--MINUTE--SECOND
注意:月份要+1；24小时制的时为HOUR_OF_DAY

日期格式化类：SimpleDateFormat
	作用：1.可以把日期转换指定格式的字符串  String format()
	      2.可以把一个字符串转换成对应日期  parse()
 */
public class Demo1 {

	public static void main(String[] args) throws ParseException {
		//Date date=new Date();
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR)+"年");
		System.out.println((calendar.get(Calendar.MONTH)+1)+"月");
		System.out.println(calendar.get(Calendar.DATE)+"日");

		System.out.println(calendar.get(Calendar.HOUR_OF_DAY)+"时");
		System.out.println(calendar.get(Calendar.MINUTE)+"分");
		System.out.println(calendar.get(Calendar.SECOND)+"秒");

		//需求：输出2017-12-10  17:05:34
		Date date=new Date();  //获取当前系统日历
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy年MM月dd日    hh:mm:ss");//无参默认格式
		String time=dateformat.format(date);
		System.out.println("当前时间是："+time);
		
		String birthday="2018年1月1日    00:00:00";//要保证跟设定格式一致
		Date date1=dateformat.parse(birthday);
		System.out.println("生日是："+date1);
	}

}
