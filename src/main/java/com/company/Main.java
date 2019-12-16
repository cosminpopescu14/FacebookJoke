package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.inject.Inject;

public class Main {


    private static FacebookService facebook = new FacebookService();



    public static void main(String[] args) {
	// write your code here

        System.out.println(facebook.getFriends());
    }
}
