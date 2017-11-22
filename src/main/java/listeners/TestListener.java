package listeners;

import lombok.extern.slf4j.Slf4j;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Event Listener.
 */

@Slf4j
public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        log.info("Now I'm starting testing : %s, %s",
                result.getTestClass().getName(), result.getMethod().getMethodName());
    }


    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("PASS : %s, %s",
                result.getTestClass().getName(), result.getTestName());
    }


    @Override
    public void onTestFailure(ITestResult result) {
        log.info("FAIL : %s, %s",
                result.getTestClass().getName(), result.getMethod().getMethodName());
    }


    @Override
    public void onTestSkipped(ITestResult result) {
        log.info("SKIP : %s, %s",
                result.getTestClass().getName(), result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
