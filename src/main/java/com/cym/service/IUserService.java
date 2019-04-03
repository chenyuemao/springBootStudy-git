package com.cym.service;

public interface IUserService {
    boolean login(String userName,String password);
    boolean register(String userName,String password);


}
