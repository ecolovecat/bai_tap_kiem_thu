import junit.framework.TestCase;

public class VaccinateTest extends TestCase {

    public void testCheckCovidBound1() {
        Vaccinate test = new Vaccinate();
        assertEquals(true, test.checkCovid(20,9));
    }

    public void testCheckCovidBound2() {
        Vaccinate test = new Vaccinate();
        assertEquals(true, test.checkCovid(20,3));
    }

    public void testCheckCovidBound3() {
        Vaccinate test = new Vaccinate();
        assertEquals(true, test.checkCovid(20,4));
    }

    public void testCheckCovidBound4() {
        Vaccinate test = new Vaccinate();
        assertEquals(true, test.checkCovid(20,33));
    }

    public void testCheckCovidBound5() {
        Vaccinate test = new Vaccinate();
        assertEquals(true, test.checkCovid(20,34));
    }

    public void testCheckCovidBound6() {
        Vaccinate test = new Vaccinate();
        assertEquals(true, test.checkCovid(18,9));
    }

    public void testCheckCovidBound7() {
        Vaccinate test = new Vaccinate();
        assertEquals(true, test.checkCovid(19,9));
    }

    public void testCheckCovidBound8() {
        Vaccinate test = new Vaccinate();
        assertEquals(true, test.checkCovid(65,9));
    }

    public void testCheckCovidBound9() {
        Vaccinate test = new Vaccinate();
        assertEquals(true, test.checkCovid(64,9));
    }

    public void testCheckCovidBound10() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(18,2));
    }

    public void testCheckCovidBound11() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(19,2));
    }

    public void testCheckCovidBound12() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(65,2));
    }

    public void testCheckCovidBound13() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(18,-1));
    }

    public void testCheckCovidBound14() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(18,35));
    }

    public void testCheckCovidBound15() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(17,5));
    }

    public void testCheckCovidBound16() {
        Vaccinate test = new Vaccinate();
        assertEquals(true, test.checkCovid(20,10));
    }

    public void testCheckCovidEquivalent1() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(2,2));
    }

    public void testCheckCovidEquivalent2() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(2,5));
    }

    public void testCheckCovidEquivalent3() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(2,45));
    }

    public void testCheckCovidEquivalent4() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(40,2));
    }

    public void testCheckCovidEquivalent5() {
        Vaccinate test = new Vaccinate();
        assertEquals(true, test.checkCovid(40,5));
    }

    public void testCheckCovidEquivalent6() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(40,47));
    }

    public void testCheckCovidEquivalent7() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(70,1));
    }

    public void testCheckCovidEquivalent8() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(70,5));
    }

    public void testCheckCovidEquivalent9() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(70,40));
    }
    
    public void testCheckCovid() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(70,40));
    }
    
    public void testCheckCovid() {
        Vaccinate test = new Vaccinate();
        assertEquals(false, test.checkCovid(70,40));
    }
}
