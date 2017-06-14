package cache;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by mohan on 30/05/17.
 */

public class CacheObj implements Cacheable{

    Object cacheObj;
    int timeInMin;
    Date expiredDate;
    int tag;

    public CacheObj(Object cacheObj,int tag, int timeInMin) {
        this.cacheObj = cacheObj;
        this.timeInMin = timeInMin;
        this.tag=tag;

        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.MINUTE,timeInMin);
        expiredDate=new Date(calendar.getTimeInMillis());

    }

    @Override
    public boolean isExpired() {
        return new Date().after(expiredDate);
    }

    @Override
    public Object getId() {
        return tag;
    }

    @Override
    public void setId(int id) {
        this.tag=id;
    }
}
