package com.demin.eventmanager.model.entity.extension

import com.demin.eventmanager.model.entity.Event
import com.demin.eventmanager.model.entity.Ticket

interface EventExtension: Extension

class GroupExtension(
    val groupList: List<Event>
): EventExtension

class BaseEventExtension(
    val baseEventList: List<Event>
): EventExtension

class IssuedTrackerExtension(
    val issuedTickets: List<Ticket>
): EventExtension

class MaxIssuedTicketExtension(
    val maxIssuedTickets: Int
): EventExtension