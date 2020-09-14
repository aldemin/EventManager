package com.demin.eventmanager.model.entity

import com.demin.eventmanager.model.entity.extension.TicketExtension

class Ticket(
    val id: String,
    val extensions: List<TicketExtension>
)