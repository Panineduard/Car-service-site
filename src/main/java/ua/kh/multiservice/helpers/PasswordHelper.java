package ua.kh.multiservice.helpers;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.security.crypto.password.PasswordEncoder;


/**
 * Created by volkswagen1 on 17.12.2015.
 */

public class PasswordHelper implements PasswordEncoder {
    public String encode(CharSequence charSequence) {
        return DigestUtils.md5Hex(charSequence.toString());
    }

    public boolean matches(CharSequence charSequence, String s) {
        return (encode(charSequence)).equals(s);
    }
}
