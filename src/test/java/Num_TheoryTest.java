import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Num_TheoryTest {

    private Num_Theory num_theoryUnderTest;

    @Before
    public void setUp() {
        num_theoryUnderTest = new Num_Theory();
    }

    @Test
    public void testEvil_Num_1() throws Exception {
        assertEquals(true, num_theoryUnderTest.Evil_Num(24));
    }

    @Test
    public void testEvil_Num_2() throws Exception {
        assertEquals(false, num_theoryUnderTest.Evil_Num(4324));
    }


    @Test
    public void testArmstrong_Num_1() throws Exception {
        assertEquals(true, num_theoryUnderTest.Armstrong_Num(371));
    }

    @Test
    public void testArmstrong_Num_2() throws Exception {
        assertEquals(false, num_theoryUnderTest.Armstrong_Num(125));
    }


    @Test
    public void testPerfect_Num_1() throws Exception {
        assertEquals(true, num_theoryUnderTest.Perfect_Num(496));
    }

    @Test
    public void testPerfect_Num_2() throws Exception {
        assertEquals(false, num_theoryUnderTest.Perfect_Num(552));
    }

    @Test
    public void testStrong_Num_1() throws Exception {
        assertEquals(true, num_theoryUnderTest.Strong_Num(145));
    }

    @Test
    public void testStrong_Num_2() throws Exception {
        assertEquals(false, num_theoryUnderTest.Strong_Num(543));
    }


    @Test
    public void testOdd_prime_num_1() {
        assertEquals(1, num_theoryUnderTest.odd_prime_num(73));
    }

    @Test
    public void testOdd_prime_num_2() {
        assertEquals(0, num_theoryUnderTest.odd_prime_num(80));
    }


    @Test
    public void testGoldbach_Num_1() throws Exception {
        assertEquals(true, num_theoryUnderTest.Goldbach_Num(80));
    }

    @Test
    public void testGoldbach_Num_2() throws Exception {
        assertEquals(false, num_theoryUnderTest.Goldbach_Num(-5));
    }

    @Test
    public void testGoldbach_Num_3() throws Exception {
        assertEquals(false, num_theoryUnderTest.Goldbach_Num(2));
    }


    @Test
    public void testHamming_Num_1() throws Exception {
        assertEquals(true, num_theoryUnderTest.Hamming_Num(900));
    }

    @Test
    public void testHamming_Num_2() throws Exception {
        assertEquals(false, num_theoryUnderTest.Hamming_Num(33));
    }

    @Test
    public void testHamming_Num_3() throws Exception {
        assertEquals(false, num_theoryUnderTest.Hamming_Num(55));
    }

    @Test
    public void testHamming_Num_4() throws Exception {
        assertEquals(false, num_theoryUnderTest.Hamming_Num(86));
    }

    @Test
    public void testNarcissistic_Num_1() throws Exception {
        assertEquals(false, num_theoryUnderTest.Narcissistic_Num(57));
    }

    @Test
    public void testNarcissistic_Num_2() throws Exception {
        assertEquals(true, num_theoryUnderTest.Narcissistic_Num(153));
    }


    @Test
    public void testMarkov_Num_1() throws Exception {
        assertEquals(true, num_theoryUnderTest.Markov_Num(89));
    }


    @Test
    public void testMarkov_Num_2() throws Exception {
        assertEquals(false, num_theoryUnderTest.Markov_Num(65));
    }


    @Test
    public void testMarkov_Num_3() throws Exception {
        assertEquals(true, num_theoryUnderTest.Markov_Num(169));
    }


    @Test
    public void testColombian_Num_1() throws Exception {
        assertEquals(true, num_theoryUnderTest.Colombian_Num(0));
    }

    @Test
    public void testColombian_Num_2() throws Exception {
        assertEquals(true, num_theoryUnderTest.Colombian_Num(20));
    }

    @Test
    public void testColombian_Num_3() throws Exception {
        assertEquals(false, num_theoryUnderTest.Colombian_Num(8));
    }

    @Test
    public void testColombian_Num_4() throws Exception {
        assertEquals(false, num_theoryUnderTest.Colombian_Num(21));
    }

    @Test
    public void testThabit_Num_1() throws Exception {
        assertEquals(false, num_theoryUnderTest.Thabit_Num(0));
    }

    @Test
    public void testThabit_Num_2() throws Exception {
        assertEquals(false, num_theoryUnderTest.Thabit_Num(-5));
    }

    @Test
    public void testThabit_Num_3() throws Exception {
        assertEquals(true, num_theoryUnderTest.Thabit_Num(11));
    }

    @Test
    public void testThabit_Num_4() throws Exception {
        assertEquals(true, num_theoryUnderTest.Thabit_Num(47));
    }

    @Test
    public void testThabit_Num_5() throws Exception {
        assertEquals(false, num_theoryUnderTest.Thabit_Num(6));
    }


    @Test
    public void testWoodall_Num_1() throws Exception {
        assertEquals(true, num_theoryUnderTest.Woodall_Num(1));
    }

    @Test
    public void testWoodall_Num_2() throws Exception {
        assertEquals(true, num_theoryUnderTest.Woodall_Num(7));
    }

    @Test
    public void testWoodall_Num_3() throws Exception {
        assertEquals(true, num_theoryUnderTest.Woodall_Num(23));
    }

    @Test
    public void testWoodall_Num_4() throws Exception {
        assertEquals(false, num_theoryUnderTest.Woodall_Num(0));
    }

    @Test
    public void testWoodall_Num_5() throws Exception {
        assertEquals(false, num_theoryUnderTest.Woodall_Num(6));
    }


    @Test
    public void testLeyland_Num_1() throws Exception {
        assertEquals(false, num_theoryUnderTest.Leyland_Num(2));
    }

    @Test
    public void testLeyland_Num_2() throws Exception {
        assertEquals(false, num_theoryUnderTest.Leyland_Num(-3));
    }

    @Test
    public void testLeyland_Num_3() throws Exception {
        assertEquals(true, num_theoryUnderTest.Leyland_Num(145));
    }


    @Test
    public void testSociable_Num_1() throws Exception {
        assertEquals(true, num_theoryUnderTest.Sociable_Num(14288));
    }

    @Test
    public void testSociable_Num_2() throws Exception {
        assertEquals(false, num_theoryUnderTest.Sociable_Num(13));
    }

    @Test
    public void testSociable_Num_3() throws Exception {
        assertEquals(false, num_theoryUnderTest.Sociable_Num(46661));
    }

    @Test
    public void testSociable_Num_4() throws Exception {
        assertEquals(false, num_theoryUnderTest.Sociable_Num(1));
    }

    @Test
    public void testEmirp_Num_1() throws Exception {
        assertEquals(true, num_theoryUnderTest.Emirp_Num(991));
    }

    @Test
    public void testEmirp_Num_2() throws Exception {
        assertEquals(false, num_theoryUnderTest.Emirp_Num(625));
    }


    @Test
    public void testEmirp_Num_3() throws Exception {
        assertEquals(false, num_theoryUnderTest.Emirp_Num(43));
    }


    @Test
    public void testRamanujan_Num_1() throws Exception {
        assertEquals(true, num_theoryUnderTest.Ramanujan_Num(4104));
    }

    @Test
    public void testRamanujan_Num_2() throws Exception {
        assertEquals(false, num_theoryUnderTest.Ramanujan_Num(3529));
    }

    @Test
    public void testRamanujan_Num_3() throws Exception {
        assertEquals(true, num_theoryUnderTest.Ramanujan_Num(1729));


    }
}
