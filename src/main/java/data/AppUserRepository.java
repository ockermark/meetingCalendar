package data;

import models.AppUser;

import java.util.List;

public class AppUserRepository {

    private List<AppUser> appUserStorage;

    public List<AppUser> findAll() {
        return appUserStorage;
    }

    public AppUser findById(int userId){

    }

    public AppUser findByUsername(String user){

    }

    public int getAppUserCount(){

    }

    public AppUser persists(AppUser appUser){

    }

    public boolean remove(int userId){

    }

}
