package org.opengl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {
  @Test
    public void test(){
      Main main = new Main();
      assertFalse(main.checkEmptyString("wd"));
  }
}