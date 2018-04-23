package com.tingfeng.controller

import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.text.SimpleDateFormat
import java.util.*


@RestController
@RequestMapping("/cache")
@CacheConfig(cacheNames= arrayOf("users")) //如果不配置cacheconfig，那么在cacheable中必须指定value
class CacheController{

    @RequestMapping("cached")
    @Cacheable(key="'cache_d'",condition ="true")
    fun cacheDefault():String{
        return getDateString()
    }


    @RequestMapping("cachem")
    @Cacheable(value = "myCache",key="'cache_m'",condition ="true")
    fun cachem():String{
        return getDateString()
    }


    fun getDateString():String{
        return SimpleDateFormat("yyyy-mm-dd HH:mm:ss.sss").format( Date())
    }
}