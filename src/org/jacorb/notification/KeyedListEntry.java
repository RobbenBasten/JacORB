package org.jacorb.notification;

/*
 *        JacORB - a free Java ORB
 *
 *   Copyright (C) 1999-2003 Gerald Brose
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Library General Public
 *   License as published by the Free Software Foundation; either
 *   version 2 of the License, or (at your option) any later version.
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *   Library General Public License for more details.
 *
 *   You should have received a copy of the GNU Library General Public
 *   License along with this library; if not, write to the Free
 *   Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *
 */

/**
 * KeyedListEntry.java
 *
 *
 * Created: Thu Jan 09 15:10:42 2003
 *
 * @author <a href="mailto:bendt@inf.fu-berlin.de">Alphonse Bendt</a>
 * @version $Id$
 */

public class KeyedListEntry {
    int key_;
    private Object value_;
    public Object getValue() {return value_;}


    public KeyedListEntry(int key, Object value) {
	value_ = value;
	key_ = key;
    }
    
    public boolean equals(Object o) {
	if (o instanceof KeyedListEntry) {
	    return ((KeyedListEntry)o).key_ == key_;
	}
	return false;
    }

}// KeyedListEntry
