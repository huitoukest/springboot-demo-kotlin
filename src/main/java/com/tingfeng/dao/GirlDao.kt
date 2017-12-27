package com.tingfeng.dao

import com.tingfeng.Entity.Girl
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GirlDao: JpaRepository<Girl, Long> {

}