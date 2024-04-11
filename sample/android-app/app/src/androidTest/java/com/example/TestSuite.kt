package com.example

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    TestWithWrongName::class,
)
class TestSuite
