package com.waverleysoftware.core;

import lombok.experimental.UtilityClass;

import static org.joor.Reflect.on;

@UtilityClass
public class PageFactory {

  @SuppressWarnings("unchecked")
  public static <T extends Page> T open(final Class<T> pageClass) {

    T page = on(pageClass).create().get();
    return (T) page.navigateTo();
  }
}
