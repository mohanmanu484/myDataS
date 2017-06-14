package cache;

/**
 * Created by mohan on 30/05/17.
 */

public interface Cacheable {
    public boolean isExpired();
    Object getId();
    void setId(int id);
}
