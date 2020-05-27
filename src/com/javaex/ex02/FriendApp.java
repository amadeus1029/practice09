package com.javaex.ex02;


import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
        Scanner addFriend = new Scanner(System.in);
        ArrayList<Friend> friends = new ArrayList<Friend>();

        System.out.println("친구를 3명 등록해주세요");
        for(int i=0;i<3;i++) {
            friends.add(i,new Friend());
            String friendInfo = addFriend.nextLine();
            String[] friendInfoArray = friendInfo.split(" ");
            friends.get(i).setName(friendInfoArray[0]);
            friends.get(i).setHp(friendInfoArray[1]);
            friends.get(i).setSchool(friendInfoArray[2]);
        }

        for(Friend friend : friends) {
            friend.showInfo();
        }

    	
    	
    }

}
