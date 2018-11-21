package com.sc.vag;

import com.sc.vag.utils.GeneralUtilities;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Created by 1533435 on 11/21/2018.
 */
public class AppTest {

    @Test
    public void testAppConstructor() {
        String value = GeneralUtilities.convertToString(7);
        assertEquals("Seven", value);
    }
}
