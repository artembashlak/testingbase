package com.waverleysoftware.core;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.function.Function;

/** Simple wait wrapper. */
@RequiredArgsConstructor
@Getter
public enum WaitCondition {
  visible(ExpectedConditions::visibilityOfElementLocated),
  present(ExpectedConditions::presenceOfElementLocated),
  enabled(ExpectedConditions::elementToBeClickable),
  allVisible(ExpectedConditions::visibilityOfAllElementsLocatedBy);

  private final Function<By, ExpectedCondition<?>> type;
}
