package algo;

import org.junit.Test;
import org.junit.runner.JUnitCore;

import static org.junit.Assert.*;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MagicCounterTest {

	
	
	@Test(timeout = 2000)
	// prevent the infinite loop
	public void testCaseSmallerStart() {

		MagicCounter mMagicCounter = new MagicCounter();
		int mCountFrom, mCountUntil;

		
		mCountFrom = 10;
		mCountUntil = 15;

		

		mMagicCounter.displayMagicalNumber(mCountFrom, mCountUntil);
		assertNotNull(mMagicCounter.i);
		int i = mMagicCounter.i;
		assert i == mCountUntil : "the last item is not reached, " + (mCountUntil - i) + " iteration are missed ";

	}
	
	@Test(timeout = 1000)
	// prevent the infinite loop
	public void testCaseEqualParams() {

		MagicCounter mMagicCounter = new MagicCounter();
		int mCountFrom, mCountUntil;

		mCountFrom = 15;
		mCountUntil = 15;

		mMagicCounter.displayMagicalNumber(mCountFrom, mCountUntil);
		assertNotNull(mMagicCounter.i);
		int i = mMagicCounter.i;
		assert i == mCountUntil : "the last item is not reached, " + (mCountUntil - i) + " iteration are missed ";

	}
	
	@Test(timeout = 2000)
	// prevent the infinite loop
	public void testCaseSmallerEnd() {

		MagicCounter mMagicCounter = new MagicCounter();
		int mCountFrom, mCountUntil;

		mCountFrom = 20;
		mCountUntil = 15;

		mMagicCounter.displayMagicalNumber(mCountFrom, mCountUntil);
		assertNotNull(mMagicCounter.i);
		int i = mMagicCounter.i;
		assert i == mCountUntil : "the last item is not reached, " + (mCountUntil - i) + " iteration are missed ";

	}

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MagicCounterTest.class);

		for (Failure failure : result.getFailures()) {

			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}
}
