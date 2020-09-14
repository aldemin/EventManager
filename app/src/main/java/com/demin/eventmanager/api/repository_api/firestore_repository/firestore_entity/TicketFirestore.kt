package com.demin.eventmanager.api.repository_api.firestore_repository.firestore_entity

import com.demin.eventmanager.model.entity.extension.TicketExtension

class TicketFirestore(
    val id: String,
    val eventId: String,
    val targetPersonId: String,
    val extensions: List<TicketExtension>
) {

}