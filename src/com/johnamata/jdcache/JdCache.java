package com.johnamata.jdcache;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

public class JdCache<KEY, VALUE> {
    private final Eviction eviction;
    private Map<KEY, VALUE> map = new ConcurrentHashMap<>();
    private Data<KEY, VALUE> data;

    public JdCache(Data<KEY, VALUE> data, Eviction eviction){
        this.data = data;
        this.eviction = eviction;
        map = new ConcurrentHashMap<>();
    }

    public Future<VALUE> get(KEY k){
        if(map.containsKey(k)){
            return CompletableFuture.completedFuture(map.get(k));
        } else {
            return data.get(k);
        }
    }

    public Future<Void> set(KEY k, VALUE v){
        if(map.containsKey(k)){
            map.put(k, v);
            return null;
        } else {
            return null;
        }
    }
}
