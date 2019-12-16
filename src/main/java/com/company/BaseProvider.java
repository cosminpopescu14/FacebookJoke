package com.company;

import org.springframework.context.annotation.Configuration;
import org.springframework.social.facebook.api.Facebook;


@Configuration
public class BaseProvider {

    public Facebook getFacebook() {
        return facebook;
    }

    public void setFacebook(Facebook facebook) {
        this.facebook = facebook;
    }

    private Facebook facebook;
}