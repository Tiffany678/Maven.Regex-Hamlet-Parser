import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        hamletParser.repalceStr(hamletParser.getP2(), "Horatio", "Tariq");
    }

    @Test
    public void testChangeHoratioToTariq() {
        hamletParser.repalceStr(hamletParser.getP2(), "Hamlet", "Leon");

    }

    @Test
    public void testFindHoratio() {
        hamletParser.find(hamletParser.getP1());
    }

    @Test
    public void testFindHamlet() {
        hamletParser.find(hamletParser.getP2());

    }
}