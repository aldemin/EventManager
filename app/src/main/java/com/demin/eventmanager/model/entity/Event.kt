package com.demin.eventmanager.model.entity

import com.demin.eventmanager.model.entity.extension.EventExtension
import java.util.*

class Event(
    val id: String,
    val organizerPerson: Person,
    val createDate: Date,
    var title: String,
    var description: String,
    var address: String,
    val extensionList: List<EventExtension>? = null,
    val ticketList: List<Ticket>
)