package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
        Scanner addGoods = new Scanner(System.in);
        ArrayList<Goods> goodsList = new ArrayList<Goods>();
        System.out.println("상품을 입력해주세요(종료 q)");
        boolean end = false;
        int sum = 0;

        do {
            try {
                String str = addGoods.nextLine();
                str = str.trim();
                if(str.equals("q")) {
                    System.out.println("[입력완료]");
                    end = true;
                } else {
                    String[] goodsInfoArray = str.split(",");
                    String name = goodsInfoArray[0];
                    int price = Integer.parseInt(goodsInfoArray[1].trim());
                    int count = Integer.parseInt(goodsInfoArray[2].trim());
                    goodsList.add(new Goods(name,price,count));
                }
            } catch(NumberFormatException e) {
                System.out.println("가격과 수량은 숫자만 입력해주세요");
                addGoods = new Scanner(System.in);
            }
        } while(!end);

        for(Goods goods : goodsList) {
            goods.showInfo();
            sum += goods.getCount();
        }
        System.out.println("모든 상품의 갯수는 "+sum+"개입니다.");
        addGoods.close();


       
    }

}
