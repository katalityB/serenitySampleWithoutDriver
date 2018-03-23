import org.junit.*;
import org.junit.runner.RunWith;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class FrequentFlyerTest {

    @Steps
    SampleSteps sampleSteps;

    @Test
    public void shouldCalculatePointsBasedOnDistance() {
        // GIVEN
        sampleSteps.a_traveller_has_a_frequent_flyer_account_with_balance(10000);

        // WHEN
        sampleSteps.the_traveller_flies(1000);

        // THEN
        sampleSteps.traveller_should_have_a_balance_of(10100);
    }

}
