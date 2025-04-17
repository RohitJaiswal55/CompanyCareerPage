package StepDefinitions;

import com.career.bdd.helper.CareerHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private static CareerHelper careerHelper;

    @Before
    public void setUp() {
        careerHelper = new CareerHelper();
        careerHelper.setup();
    }

    @After
    public void tearDown() {
        if (careerHelper != null) {
            careerHelper.teardown();
        }
    }

    public static CareerHelper getCareerHelper() {
        return careerHelper;
    }
}
