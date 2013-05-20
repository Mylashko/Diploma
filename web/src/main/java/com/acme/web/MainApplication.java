package com.acme.web;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * @author Alex Panov
 *         Date: 5/16/13
 */

public class MainApplication extends WebApplication {
    @Override
    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }
}
