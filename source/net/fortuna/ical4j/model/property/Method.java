/*
 * $Id$
 * 
 * Created: [Apr 6, 2004]
 *
 * Copyright (c) 2004, Ben Fortuna
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 	o Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *
 * 	o Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 * 	o Neither the name of Ben Fortuna nor the names of any other contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.fortuna.ical4j.model.property;

import net.fortuna.ical4j.model.ParameterList;
import net.fortuna.ical4j.model.Property;

/**
 * Defines a METHOD iCalendar property.
 *
 * @author benf
 */
public class Method extends Property {

	/**
	 * Used to publish a calendar entry to one or more
     * Calendar Users. There is no interactivity
     * between the publisher and any other calendar
     * user. An example might include a baseball team
     * publishing its schedule to the public. [RFC 2446]
	 */
	public static final String PUBLISH = "PUBLISH";

	/**
	 * Used to schedule a calendar entry with other
     * Calendar Users. Requests are interactive in that
     * they require the receiver to respond using
     * the Reply methods. Meeting Requests, Busy
     * Time requests and the assignment of VTODOs to
     * other Calendar Users are all examples.
     * Requests are also used by the "Organizer" to
     * update the status of a calendar entry. [RFC 2446]
     */
	public static final String REQUEST = "REQUEST";

	/**
	 * A Reply is used in response to a Request to
     * convey "Attendee" status to the "Organizer".
     * Replies are commonly used to respond to meeting
     * and task requests. [RFC2446]
     */
	public static final String REPLY = "REPLY";

	/**
	 * Add one or more instances to an existing
     * VEVENT, VTODO, or VJOURNAL. [RFC 2446]
     */
	public static final String ADD = "ADD";

	/**
	 * Cancel one or more instances of an existing
     * VEVENT, VTODO, or VJOURNAL. [RFC 2446]
     */
	public static final String CANCEL = "CANCEL";

	/**
	 * The Refresh method is used by an "Attendee" to
     * request the latest version of a calendar entry. [RFC 2446]
     */
	public static final String REFRESH = "REFRESH";

	/**
	 * The Counter method is used by an "Attendee" to
     * negotiate a change in the calendar entry.
     * Examples include the request to change a
     * proposed Event time or change the due date for a
     * VTODO. [RFC 2446]
     */
	public static final String COUNTER = "COUNTER";

	/**
	 * Used by the "Organizer" to decline the proposed
     * counter-proprosal. [RFC 2446]
     */
	public static final String DECLINE_COUNTER = "DECLINE-COUNTER";

    private String value;

    /**
     * @param aValue
     *            a value string for this component
     */
    public Method(final String aValue) {
        super(METHOD);
        this.value = aValue;
    }

    /**
     * @param aList
     *            a list of parameters for this component
     * @param aValue
     *            a value string for this component
     */
    public Method(final ParameterList aList, final String aValue) {
        super(METHOD, aList);

        this.value = aValue;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.fortuna.ical4j.model.Property#getValue()
     */
    public String getValue() {
        return value;
    }
}