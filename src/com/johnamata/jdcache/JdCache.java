package com.johnamata.jdcache;

import java.util.concurrent.Future;

public class JdCache<KEY, VALUE> {

    private Data<KEY, VALUE> data;

    public Future<VALUE> get(KEY k){
    }

    public Future<Void> set(KEY k, VALUE v){
    }
}
