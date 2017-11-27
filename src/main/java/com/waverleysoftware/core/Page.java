package com.waverleysoftware.core;

public interface Page {

  Page navigateTo();

  default String url() {
    return "http://1337.com";
  }
}
