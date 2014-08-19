/*
 * file:       MPXJTest.java
 * author:     Jon Iles
 * copyright:  (c) Packwood Software 2006
 * date:       28-Feb-2006
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package net.sf.mpxj.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test suite to collect together MPXJ tests.
 */
@RunWith(Suite.class) @Suite.SuiteClasses(
{
   BasicTest.class,
   LocaleTest.class,
   ProjectCalendarTest.class,
   SplitTaskTest.class,
   MppGraphIndTest.class,
   SlackTest.class,
   MppProjectHeaderTest.class,
   MppTaskTest.class,
   MppResourceTest.class,
   MppSubprojectTest.class,
   MppViewTest.class,
   MppFilterTest.class,
   MppAutoFilterTest.class,
   MppViewStateTest.class,
   MppGroupTest.class,
   MppCalendarTest.class,
   MppEnterpriseTest.class,
   MppBaselineTest.class,
   MppEmbeddedTest.class,
   MppRecurringTest.class,
   MppNullTaskTest.class,
   ProjectWriterUtilityTest.class,
   PlannerCalendarTest.class,
   PlannerResourceTest.class,
   TimephasedTest.class,
   DurationTest.class,
   MppFilterLogicTest.class,
   CostRateTableTest.class,
   AvailabilityTest.class,
   MppColumnsTest.class,
   MppBarStyleTest.class,
   MppGanttTest.class,
   TimephasedSegmentTest.class,
   MppAssignmentTest.class,
   TimephasedSegmentTest2.class,
   MppTaskFlags.class,
   MppResourceFlags.class,
   CustomerDataTest.class
}) public class MPXJTest
{
   /*   
      public MPXJTest()
      {
         addTestSuite(BasicTest.class);
         addTestSuite(LocaleTest.class);
         addTestSuite(ProjectCalendarTest.class);
         addTestSuite(SplitTaskTest.class);
         addTestSuite(MppGraphIndTest.class);
         addTestSuite(SlackTest.class);
         addTestSuite(MppProjectHeaderTest.class);
         addTestSuite(MppTaskTest.class);
         addTestSuite(MppResourceTest.class);
         addTestSuite(MppSubprojectTest.class);
         addTestSuite(MppViewTest.class);
         addTestSuite(MppFilterTest.class);
         addTestSuite(MppAutoFilterTest.class);
         addTestSuite(MppViewStateTest.class);
         addTestSuite(MppGroupTest.class);
         addTestSuite(MppCalendarTest.class);
         addTestSuite(MppEnterpriseTest.class);
         addTestSuite(MppBaselineTest.class);
         addTestSuite(MppEmbeddedTest.class);
         addTestSuite(MppRecurringTest.class);
         addTestSuite(MppNullTaskTest.class);
         addTestSuite(ProjectWriterUtilityTest.class);
         addTestSuite(PlannerCalendarTest.class);
         addTestSuite(PlannerResourceTest.class);
         addTestSuite(TimephasedTest.class);
         addTestSuite(DurationTest.class);
         addTestSuite(MppFilterLogicTest.class);
         addTestSuite(CostRateTableTest.class);
         addTestSuite(AvailabilityTest.class);
         addTestSuite(MppColumnsTest.class);
         addTestSuite(MppBarStyleTest.class);
         addTestSuite(MppGanttTest.class);
         addTestSuite(TimephasedSegmentTest.class);
         addTestSuite(MppAssignmentTest.class);
         addTestSuite(TimephasedSegmentTest2.class);
         addTestSuite(MppTaskFlags.class);
         addTestSuite(MppResourceFlags.class);
         addTestSuite(CustomerDataTest.class);
         
      }
   */

}

/*
import org.junit.runners.AllTests;
import junit.framework.TestSuite;
import junit.framework.Test;

@RunWith(AllTests.class)
public final class MasterTester {

  public static TestSuite suite() {
    TestSuite suite = new TestSuite();
    for (Test test : findAllTestCasesRuntime()) {
      suite.addTest(test);
    }
    return suite;
  }
} 
 
*/