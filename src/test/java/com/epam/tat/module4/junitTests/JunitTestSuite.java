package com.epam.tat.module4.junitTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({ MultTest.class,
                      SubTest.class,
                      SumTest.class })
public class JunitTestSuite {
}
