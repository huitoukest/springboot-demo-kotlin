package com.tingfeng.dao

import com.tingfeng.Entity.Account
import org.springframework.stereotype.Repository

@Repository
 interface AccountDao:BaseDao<Account, Long> {

    fun findByName(name:String):List<Account>
}
