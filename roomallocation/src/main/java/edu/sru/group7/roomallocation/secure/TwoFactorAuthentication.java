package edu.sru.group7.roomallocation.secure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sru.group7.roomallocation.controller.EmailController;
import edu.sru.group7.roomallocation.controller.UtilityController;
import edu.sru.group7.roomallocation.domain.User;
import edu.sru.group7.roomallocation.repositories.UserRepository;
import edu.sru.group7.roomallocation.repositories.UserRoleRepository;

@Service
public class TwoFactorAuthentication {

    @Autowired
    private EmailController emailController;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UtilityController util;

    public void send2FACode(User user) {
        String code = util.randomStringGenerator();
        user.setTwoFactorAuthenticationCode(code);
        emailController.sendTwoFactorAuthEmail(user, code);
        userRepository.save(user);
    }

    public boolean verify2FACode(User user, String code) {
        if (user.getTwoFactorAuthenticationCode().equals(code)) {
            user.setTwoFactorAuthenticationCode(null);
            userRepository.save(user);
            return true;
        }
        return false;
    }

    public void set2FAEnabled(User user, boolean enabled) {
        user.setTwoFactorEnabled(enabled);
        userRepository.save(user);
    }
}
