package cache;

import java.util.HashMap;

/**
 * Created by mohan on 30/05/17.
 */

public class CacheManager {


    private HashMap<Object,Cacheable> cacheMap=new HashMap<>();
    public static final int DEFAULT_CACHE_TIME=5;

   /* public void add(Object object){
        CacheObj cacheObj=new CacheObj(object,DEFAULT_CACHE_TIME);
        cacheMap.put(cacheObj.getId(),cacheObj);
    }

    public void get(Object tag){
        cacheMap.get()
    }

    public void clear(){

    }*/


}
