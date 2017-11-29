package com.waverleysoftware.core;

public interface Page {

  default Page navigateTo() {
    return navigateTo(url());
  }

  Page navigateTo(String url);

  default String url() {
    return "http://1337.com";
  }
}
