package com.github.cjqcn.tinyredis.core.server;

import com.github.cjqcn.tinyredis.core.client.RedisClient;
import com.github.cjqcn.tinyredis.core.db.RedisDb;
import com.github.cjqcn.tinyredis.core.listen.ListenerManager;

public interface RedisServer {
    void registerClient(RedisClient redisClient);

    void removeClient(RedisClient redisClient);

    RedisInfo info();

    void init();

    void destroy();

    RedisDb[] dbs();

    boolean auth(String password);

    ListenerManager listenerManager();
}
