package br.eng.eliseu.gwt.gwtd.client.application;





import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

import br.eng.eliseu.gwt.gwtd.client.application.home.HomeModule;
import br.eng.eliseu.gwt.gwtd.client.application.login.LoginModule;

public class ApplicationModule extends AbstractPresenterModule {
    
    @Override
    protected void configure() {
	install(new LoginModule());
        install(new HomeModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class, ApplicationPresenter.MyProxy.class);
        

    }
}
