package com.imooc;
import java.util.Scanner;
public class Getcar {

	public static void main(String[] args) {
		System.out.println("**********************");
		System.out.println("*****��ӭʹ�ô���⳵��*****");
		System.out.println("*****Write by С��*****");
		System.out.println("�������Ƿ���Ҫ�⳵�����ǣ�1����0��\n");
		while(true) {
		Scanner s1=new Scanner(System.in);
		int i=s1.nextInt();
		if(i==0) {
			System.out.println("��ӭ�ٴ�ʹ�ã�");
			break;
			}else if(i==1) {
			System.out.println("\t"+"�������������г��ͼ���۸�"+"\t");
			System.out.println("���"+"\t"+"��������"+"\t"+"���Ԫ/�죩"+" "+"���������ˣ�"+" "+"�ػ������֣�");
			System.out.println("1"+"\t"+"����X6"+"\t"+"200"+"\t"+" 4"+"\t"+" 0");
			System.out.println("2"+"\t"+"�����ͳ�"+"\t"+"180"+"\t"+" 49"+"\t"+" 0");
			System.out.println("3"+"\t"+"��������"+"\t"+"500"+"\t"+" 2"+"\t"+" 50");
			
			System.out.println("���������賵��������Ϊ��\n");
			 int totalpeople=0;
			 int totalprice=0;
			 int totalgoods=0;
			while(true) {
				Scanner s2=new Scanner(System.in);
				int num=s2.nextInt();  //��num�������û��������������
				if(num<=0) {
					System.out.println("�������������������룡\n");
					continue;
				}else {
					for(int j=1;j<=num;j++) {
						System.out.println("������Ҫ��ĵ�"+j+"�����������ţ�");
						Scanner s3=new Scanner(System.in);
						int k=s3.nextInt();
						if(k==1) {
							totalpeople+=4;
							totalgoods+=0;
							totalprice+=200;
						}else if(k==2){
							totalpeople+=49;
							totalgoods+=0;
							totalprice+=180;
						}else if(k==3) {
							totalpeople+=2;
							totalgoods+=50;
							totalprice+=500;
						}else {
							System.out.println("�������������������룺\n");
							j=0;
						}
						}
					System.out.println("�������⳵������\n");
					Scanner s4=new Scanner(System.in);
					int days=s4.nextInt();
					int money=totalprice*days;
					System.out.println("����⳵�ܽ��Ϊ��"+ money +"Ԫ,������"+totalpeople+"��,�ػ�"+totalgoods+"�֡�");
					break;
					}
				}
			//System.out.println("�������⳵������");
			//Scanner s4=new Scanner(System.in);
			//int days=s4.nextInt();
			//int money=totalprice*days;
			//System.out.println("����⳵�ܽ��Ϊ��"+ money +"Ԫ,������"+totalpeople+"��,�ػ�"+totalgoods+"�֡�");
			}
		else {
			System.out.println("�������������������룡\n");
			continue;
		    }
	break;}
	}
}
