package com.demin.eventmanager.model.entity

import android.graphics.Bitmap

data class Person(
    val id: String,
    val name: String,
    var contacts: Map<ContactTag, String>,
    var address: String?,
    val otherInformation: String?,
    var avatar: Bitmap? = null
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Person) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

}