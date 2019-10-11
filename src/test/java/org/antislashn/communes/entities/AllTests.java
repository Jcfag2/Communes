package org.antislashn.communes.entities;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCommuneDAO.class, TestDepartementDB.class, TestRegionDB.class })
public class AllTests {

}
