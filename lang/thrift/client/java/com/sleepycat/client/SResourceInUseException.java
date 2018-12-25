/*-
 * Copyright (c) 2002, 2018 Oracle and/or its affiliates.  All rights reserved.
 *
 * See the file LICENSE for license information.
 *
 * $Id$
 */

package com.sleepycat.client;

/**
 * Thrown if the resources accessed by the current operation is busy, and the
 * current operation conflicts with the operation running on the resources.
 */
public class SResourceInUseException extends SDatabaseException {

    public SResourceInUseException(String message) {
        super(message, 0);
    }

}
