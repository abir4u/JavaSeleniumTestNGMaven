package factory;

import wrappers.Inspectors;

/**
 * This class is used to share wrapper object with page classes
 * to avoid instantiating them over and over in every case.
 */
public class SharedWrappers {

    protected Inspectors inspectors = new Inspectors(DriverFactory.getDriver());
}
