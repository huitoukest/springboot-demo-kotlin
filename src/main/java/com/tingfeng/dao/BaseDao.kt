package com.tingfeng.dao

import com.tingfeng.Entity.BaseEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface BaseDao<T : BaseEntity, ID : java.io.Serializable>
    : JpaRepository<T, ID>, JpaSpecificationExecutor<T>
