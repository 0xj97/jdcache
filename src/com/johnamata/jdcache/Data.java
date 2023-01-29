package com.johnamata.jdcache;

import java.util.concurrent.Future;

public class Data<KEY, VALUE> {
    public Future<VALUE> get(KEY k){
        return null;
    }
    public Future<Void> persist(KEY k, VALUE v){
        return null;
    }
}
