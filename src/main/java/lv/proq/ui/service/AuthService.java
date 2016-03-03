package lv.proq.ui.service;

/**
 * Created by Artyom on 3/3/2016.
 */
public interface AuthService {
    void authorizeUser(String userName, String password);
    String getAnonymousUser();
    String getCurrentUser();
}
