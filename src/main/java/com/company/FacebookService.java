package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Service;

@Service
public class FacebookService {

    @Autowired
    private BaseProvider baseProvider;


    public String getFriends() {
         Facebook facebook = baseProvider.getFacebook();


         return facebook.userOperations().getUserProfile().getBio();

    }
}
