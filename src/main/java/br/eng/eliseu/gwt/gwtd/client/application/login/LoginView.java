package br.eng.eliseu.gwt.gwtd.client.application.login;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class LoginView extends ViewWithUiHandlers<LoginUiHandlers> implements LoginPresenter.MyView {
    interface Binder extends UiBinder<Widget, LoginView> {
    }

    @UiField TextBox username;
    @UiField PasswordTextBox password;
    @UiField Button confirm;

    @Inject
    LoginView( Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        

    }

    @UiHandler("confirm")
    void onConfirm(ClickEvent event) {
        getUiHandlers().confirm(username.getText(), password.getText());
    }
}
