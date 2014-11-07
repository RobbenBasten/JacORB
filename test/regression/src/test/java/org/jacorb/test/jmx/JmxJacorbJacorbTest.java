/*
 *        JacORB - a free Java ORB
 *
 *   Copyright (C) 1999-2014 Gerald Brose / The JacORB Team.
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

package org.jacorb.test.jmx;

import java.util.Properties;
import org.junit.BeforeClass;

public class JmxJacorbJacorbTest extends AbstractJMXTestCase
{
    @BeforeClass
    public static void beforeClassSetUp() throws Exception
    {
        Properties props = new Properties();
        props.put ("org.omg.CORBA.ORBClass",
                   "org.jacorb.orb.ORB");
        props.put ("org.omg.CORBA.ORBSingletonClass",
                   "org.jacorb.orb.ORBSingleton");
        props.put("jacorb.interop.strict_check_on_tc_creation", "off");
        jmxSetup = new JMXClientServerSetup(props, props);

    }
}
