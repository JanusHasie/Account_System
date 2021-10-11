package za.ac.nwu.ac.logic.flow.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*; //cannot add maven dependency. Maven does not find org.junit.Assert

public class FetchAccountTypeFlowImplTest {

        private FetchAccountTypeFlowImpl classToTest;
        @Before
        public void setUp() throws Exception {
            classToTest = new FetchAccountTypeFlowImpl(null);
        }
        @After
        public void tearDown() throws Exception {
            classToTest = null;
        }

        @Test
        public void methodToTest() {
            assertTrue(classToTest.methodToTest());
        }
    }

