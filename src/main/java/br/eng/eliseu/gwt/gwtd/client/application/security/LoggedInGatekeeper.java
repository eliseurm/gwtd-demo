package br.eng.eliseu.gwt.gwtd.client.application.security;

import com.google.inject.Inject;
import com.gwtplatform.mvp.client.annotations.DefaultGatekeeper;
import com.gwtplatform.mvp.client.proxy.Gatekeeper;

@DefaultGatekeeper
public class LoggedInGatekeeper implements Gatekeeper {

    private final CurrentUser currentUser;
    
    @Inject
    public LoggedInGatekeeper(CurrentUser currentUser) {
        this.currentUser = currentUser;
    }
    
    @Override
    public boolean canReveal() {
	return currentUser.isLoggedIn();
    }

}
