import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class SampleSteps {

    FrequentFlyer frequentFlyer;

    @Step("Given a traveller has a frequent flyer account with {0} points")
    public void a_traveller_has_a_frequent_flyer_account_with_balance(int initialBalance) {
        frequentFlyer = FrequentFlyer.withInitialBalanceOf(initialBalance);
    }

    @Step("When the traveller flies {0} km")
    public void the_traveller_flies(int distance) {
        frequentFlyer.flies(distance);
    }

    @Step("Then the traveller should have a balance of {0} points")
    public void traveller_should_have_a_balance_of(int expectedBalance ) {
        assertThat(frequentFlyer.getBalance()).isEqualTo(expectedBalance);
    }

    @Step
    public void a_traveller_joins_the_frequent_flyer_program() {
        frequentFlyer = FrequentFlyer.withInitialBalanceOf(0);
    }

}
