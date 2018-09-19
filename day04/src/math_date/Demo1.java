package math_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* ������Date
Calendar
	getInstance()  ��ȡ��ǰϵͳʱ������<�൱�ڻ�ȡһ������>
	calendar.get(int)  ��ȡ������ʱ����
	�꣺int=Calendar.YEAR    
	�£�int=Calendar.MONTH+1;
	<�գ�ʱ���֣���> ��Ӧ��DATA--HOUR--MINUTE--SECOND
ע��:�·�Ҫ+1��24Сʱ�Ƶ�ʱΪHOUR_OF_DAY

���ڸ�ʽ���ࣺSimpleDateFormat
	���ã�1.���԰�����ת��ָ����ʽ���ַ���  String format()
	      2.���԰�һ���ַ���ת���ɶ�Ӧ����  parse()
 */
public class Demo1 {

	public static void main(String[] args) throws ParseException {
		//Date date=new Date();
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR)+"��");
		System.out.println((calendar.get(Calendar.MONTH)+1)+"��");
		System.out.println(calendar.get(Calendar.DATE)+"��");

		System.out.println(calendar.get(Calendar.HOUR_OF_DAY)+"ʱ");
		System.out.println(calendar.get(Calendar.MINUTE)+"��");
		System.out.println(calendar.get(Calendar.SECOND)+"��");

		//�������2017-12-10  17:05:34
		Date date=new Date();  //��ȡ��ǰϵͳ����
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy��MM��dd��    hh:mm:ss");//�޲�Ĭ�ϸ�ʽ
		String time=dateformat.format(date);
		System.out.println("��ǰʱ���ǣ�"+time);
		
		String birthday="2018��1��1��    00:00:00";//Ҫ��֤���趨��ʽһ��
		Date date1=dateformat.parse(birthday);
		System.out.println("�����ǣ�"+date1);
	}

}
