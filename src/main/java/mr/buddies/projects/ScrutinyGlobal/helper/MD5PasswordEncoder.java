package mr.buddies.projects.ScrutinyGlobal.helper;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.DigestUtils;

public class MD5PasswordEncoder implements PasswordEncoder {


    @Override
    public String encode(CharSequence rawPassword) {
        // Implement MD5 hashing logic here
        // Example:
        return DigestUtils.md5DigestAsHex(rawPassword.toString().getBytes());
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        // Implement matching logic if needed (depends on how you store passwords)
        return encodedPassword.equals(encode(rawPassword));
    }
}
