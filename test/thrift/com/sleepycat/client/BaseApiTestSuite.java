/*-
 * Copyright (c) 2016, 2018 Oracle and/or its affiliates.  All rights reserved.
 *
 * See the file LICENSE for license information.
 *
 * $Id$
 */

package com.sleepycat.client;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BdbServerAdminTest.class,
        BdbServerConnectionTest.class,
        ForeignKeyTest.class,
        PopulateSecondaryTest.class,
        SCursorTest.class,
        SDatabaseTest.class,
        SEnvironmentTest.class,
        SJoinCursorTest.class,
        SSecondaryCursorTest.class,
        SSecondaryDatabaseTest.class,
        SSequenceTest.class,
        STransactionTest.class
})
public class BaseApiTestSuite {
}
