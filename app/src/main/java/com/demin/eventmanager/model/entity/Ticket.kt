package com.demin.eventmanager.model.entity

import com.demin.eventmanager.model.entity.extension.TicketExtension

class Ticket(
    val id: String,
    val eventId: String,
    val personId: String,
    val extensions: List<TicketExtension>
)