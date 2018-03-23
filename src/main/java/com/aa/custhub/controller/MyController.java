package com.aa.custhub.controller;

import com.aa.custhub.emd.sequencer.EMDCacheKey;
import com.google.gson.Gson;
import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @RequestMapping("/getCacheStore")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        RemoteCacheManager cacheMgr = new RemoteCacheManager();

        RemoteCache<EMDCacheKey, Object> cache = cacheMgr.getCache("EMD_CACHE");

        System.out.println(cache.size());
        return new Gson().toJson(cache.keySet());
        //return String.valueOf(cache.size());
    }
}