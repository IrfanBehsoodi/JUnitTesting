package com.sourceclass.junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.sourceclass.junit.helper.ArraysTest;
import com.sourceclass.junit.helper.StringHelperTest;
import com.sourceclass.junit.helper.ArraysCompareTest;
import com.sourceclass.junit.helper.StringHelperParameterizedTest;

@RunWith(Suite.class)
@SuiteClasses({ArraysCompareTest.class,StringHelperParameterizedTest.class})
public class DummyTestSuite {

}
