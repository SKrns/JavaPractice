/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ PrimitiveDataType
 * 
 * 1. 개요 : 아이유프로필툴력하기
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 * 
 * @author : soon3
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name ="아이유";
		boolean isMale = false;
		int age=25;
		double height=161.8;
		float weight=44.3f;
		char BloodType='A';
		
		System.out.println("<<아이유 프로필>>");
		System.out.printf("이름 : %s\n",name);
		System.out.print("성별 : ");	
		System.out.println(isMale ?"남자" : "여자" );
		System.out.printf("나이 : %d세\n",age);
		System.out.printf("키 : %.1fcm\n",height);
		System.out.print("몸무게 : ");
		System.out.println(weight+"kg");
		System.out.printf("혈액형 : %c형\n",BloodType);
		

	}

}
