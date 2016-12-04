package br.eng.eliseu.gwt.gwtd.client.application.home;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class HomeModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(HomePresenter.class, HomePresenter.MyView.class, HomeView.class, HomePresenter.MyProxy.class);
    }
}
