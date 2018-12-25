/*-
 * Copyright (c) 2002, 2018 Oracle and/or its affiliates.  All rights reserved.
 *
 * See the file LICENSE for license information.
 *
 * $Id$
 */

package com.sleepycat.client;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BdbServerConnectionTest extends ClientTestBase {

    @Test
    public void testOpenEnvironment() throws Exception {
        SEnvironment env = connection.openEnvironment("env",
                new SEnvironmentConfig().setAllowCreate(true));
        env.close();

        assertThat(Files.isDirectory(testRoot.resolve("env")), is(true));
    }

    @Test
    public void testOpenEnvironmentNonExist() throws Exception {
        thrown.expect(IOException.class);
        thrown.expectMessage("Cannot access home directory.");
        connection.openEnvironment("env", null);
    }
}