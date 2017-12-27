package com.tingfeng.Entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="girl")
data class Girl (@Id @GeneratedValue var id: Long?,
                 var cupSize : String?,
                 var age : Long?)  :BaseEntity()