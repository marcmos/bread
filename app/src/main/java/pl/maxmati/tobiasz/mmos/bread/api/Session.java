package pl.maxmati.tobiasz.mmos.bread.api;

/**
 * Created by mmos on 10.02.16.
 * @author mmos
 */
public class Session {
    private final User user;
    private final String sessionCookie;

    public Session(User user, String sessionCookie) {
        this.user = user;
        this.sessionCookie = sessionCookie;
    }

    @Override
    public String toString() {
        return "Session{" +
                "user=" + user +
                ", sessionCookie='" + sessionCookie + '\'' +
                '}';
    }
}