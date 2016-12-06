package br.eng.eliseu.gwt.gwtd.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwtplatform.mvp.client.proxy.DefaultPlaceManager;

import br.eng.eliseu.gwt.gwtd.client.application.ApplicationModule;
import br.eng.eliseu.gwt.gwtd.client.place.NameTokens;
import br.eng.eliseu.gwt.gwtd.client.resources.ResourceLoader;

public class ClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule
                .Builder()
                .defaultPlace(NameTokens.HOME)
                .errorPlace(NameTokens.HOME)
                .unauthorizedPlace(NameTokens.HOME)
                .build());
        
        install(new ApplicationModule());

        bind(ResourceLoader.class).asEagerSingleton();
    }
}
