package com.waverleysoftware.core;

import static org.joor.Reflect.on;

import lombok.experimental.UtilityClass;

/**
 * Utility class for Page object using.
 */
@UtilityClass
public class PageFactory {

    @SuppressWarnings("unchecked")
  public static <T extends Page> T open(final Class<T> pageClass) {

        final T page = on(pageClass).create().get();
        return (T) page.navigateTo();
    }
}
