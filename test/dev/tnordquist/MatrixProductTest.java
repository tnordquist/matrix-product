package dev.tnordquist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MatrixProductTest {

  private static Object[][] matrixProduct() {
    return new Object[][]{

        {new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 2016},
        {new int[][]{{-1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, -324},
        {new int[][]{{-1, 2, 3}, {4, 5, -6}, {7, 8, 9}}, 1080}

    };
  }

  @ParameterizedTest
  @MethodSource
  void matrixProduct(int[][] input, int expected) {
    int actual = MatrixProduct.matrixProduct(input);
    assertEquals(expected, actual);
  }
}