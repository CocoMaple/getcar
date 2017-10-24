package com.imooc;
import java.util.Scanner;
public class Getcar {

	public static void main(String[] args) {
		System.out.println("**********************");
		System.out.println("*****欢迎使用达达租车！*****");
		System.out.println("*****Write by 小车*****");
		System.out.println("请问您是否需要租车？（是：1，否：0）\n");
		while(true) {
		Scanner s1=new Scanner(System.in);
		int i=s1.nextInt();
		if(i==0) {
			System.out.println("欢迎再次使用！");
			break;
			}else if(i==1) {
			System.out.println("\t"+"以下是我行现有车型及其价格"+"\t");
			System.out.println("序号"+"\t"+"汽车名称"+"\t"+"租金（元/天）"+" "+"载人量（人）"+" "+"载货量（吨）");
			System.out.println("1"+"\t"+"宝马X6"+"\t"+"200"+"\t"+" 4"+"\t"+" 0");
			System.out.println("2"+"\t"+"金龙客车"+"\t"+"180"+"\t"+" 49"+"\t"+" 0");
			System.out.println("3"+"\t"+"东风天龙"+"\t"+"500"+"\t"+" 2"+"\t"+" 50");
			
			System.out.println("请问您所需车辆的总数为：\n");
			 int totalpeople=0;
			 int totalprice=0;
			 int totalgoods=0;
			while(true) {
				Scanner s2=new Scanner(System.in);
				int num=s2.nextInt();  //用num来储存用户输入的汽车总数
				if(num<=0) {
					System.out.println("您输入有误，请重新输入！\n");
					continue;
				}else {
					for(int j=1;j<=num;j++) {
						System.out.println("请输入要租的第"+j+"辆车的类别序号：");
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
							System.out.println("您输入有误！请重新输入：\n");
							j=0;
						}
						}
					System.out.println("请输入租车天数：\n");
					Scanner s4=new Scanner(System.in);
					int days=s4.nextInt();
					int money=totalprice*days;
					System.out.println("你的租车总金额为："+ money +"元,可以载"+totalpeople+"人,载货"+totalgoods+"吨。");
					break;
					}
				}
			//System.out.println("请输入租车天数：");
			//Scanner s4=new Scanner(System.in);
			//int days=s4.nextInt();
			//int money=totalprice*days;
			//System.out.println("你的租车总金额为："+ money +"元,可以载"+totalpeople+"人,载货"+totalgoods+"吨。");
			}
		else {
			System.out.println("您输入有误，请重新输入！\n");
			continue;
		    }
	break;}
	}
}
