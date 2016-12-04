package br.eng.eliseu.gwt.gwtd.client.application;

import br.eng.eliseu.gwt.gwtd.client.application.home.HomeModule;
import br.eng.eliseu.gwt.gwtd.client.application.login.LoginModule;

import com.google.inject.Singleton;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

public class ApplicationModule extends AbstractPresenterModule {
    
    @Override
    protected void configure() {
//	install(new LoginModule());
        install(new HomeModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class, ApplicationPresenter.MyProxy.class);
        

    }
}
