package entities.user_entities;

import Interface_adapters.login_interface_adapters.Login;
import use_cases.user_attribute_modification_use_case.Changeable;

import UseCases.Changeable;
import app_screen_interface_adapters.UserAppScreenGateway;

import java.io.Serializable;
public abstract class User implements Serializable, Changeable, Login {
    protected String username;
    protected String password;
    protected String email;
    boolean verified = false;
    boolean online = false;
    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public String getUsername(){
        return this.username;
    }
    private String getPassword(){
        return this.password;
    }

    @Override
//    from Changeable
    public void changeFeature(String feature, String newFeature){
        if (feature == "Username"){
            this.username = newFeature;
        } else if (feature == "Password"){
            this.password = newFeature;
        } else if (feature == "Email"){
            this.email = newFeature;
        }
    }

    public void login(){
        UserAppScreenGateway appScreenGateway = new UserAppScreenGateway(this.getUsername());
    }

}
