package com.demin.eventmanager.model.entity

import com.demin.eventmanager.model.entity.extension.EventExtension
import java.util.*

class Event(
    val id: String,
    val organizerId: String,
    val createDate: Date,
    var title: String,
    var description: String? = null,
    var address: String,
    val extensionList: List<EventExtension>
)