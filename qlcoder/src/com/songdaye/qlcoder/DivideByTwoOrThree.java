package com.songdaye.qlcoder;

/**
 * 
 * @title DivideByTwoOrThree.java
 * @author SongDaYe
 * @time 2016年4月12日 下午7:27:20
 * @description 第2333个能被2或者被3整除的正整数是…?
 * @version V1.0
 */
public class DivideByTwoOrThree {
	public static void main(String[] args) {
		int k = 0;
		for(int i=1;;i++){
			if (i%3==0||i%2==0) {
				k++;
				if (k==2333) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
