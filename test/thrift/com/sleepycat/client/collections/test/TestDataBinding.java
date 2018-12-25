/*-
 * Copyright (c) 2002, 2018 Oracle and/or its affiliates.  All rights reserved.
 *
 * See the file LICENSE for license information.
 *
 */

package com.sleepycat.client.collections.test;

import com.sleepycat.client.bind.EntryBinding;
import com.sleepycat.client.SDatabaseEntry;

/**
 * @author Mark Hayes
 */
class TestDataBinding implements EntryBinding {

    public Object entryToObject(SDatabaseEntry data) {

        if (data.getSize() != 1) {
            throw new IllegalStateException("size=" + data.getSize());
        }
        byte val = data.getData()[data.getOffset()];
        return new Long(val);
    }

    public void objectToEntry(Object object, SDatabaseEntry data) {

        byte val = ((Number) object).byteValue();
        data.setData(new byte[] { val }, 0, 1);
    }
}
