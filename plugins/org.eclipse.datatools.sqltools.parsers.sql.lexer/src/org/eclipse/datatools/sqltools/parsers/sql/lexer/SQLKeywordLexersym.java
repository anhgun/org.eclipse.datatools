/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.datatools.sqltools.parsers.sql.lexer;

interface SQLKeywordLexersym {
    public final static int
      Char_A = 4,
      Char_B = 19,
      Char_C = 10,
      Char_D = 11,
      Char_E = 1,
      Char_F = 20,
      Char_G = 14,
      Char_H = 16,
      Char_I = 3,
      Char_J = 27,
      Char_K = 21,
      Char_L = 9,
      Char_M = 13,
      Char_N = 5,
      Char_O = 8,
      Char_P = 15,
      Char_Q = 25,
      Char_R = 6,
      Char_S = 7,
      Char_T = 2,
      Char_U = 12,
      Char_V = 18,
      Char_W = 23,
      Char_X = 24,
      Char_Y = 17,
      Char_Z = 22,
      Char__ = 26,
      Char_0 = 32,
      Char_1 = 33,
      Char_2 = 28,
      Char_3 = 34,
      Char_4 = 29,
      Char_5 = 35,
      Char_6 = 30,
      Char_7 = 36,
      Char_8 = 37,
      Char_9 = 38,
      Char_EOF = 31;

      public final static String orderedTerminalSymbols[] = {
                 "",
                 "E",
                 "T",
                 "I",
                 "A",
                 "N",
                 "R",
                 "S",
                 "O",
                 "L",
                 "C",
                 "D",
                 "U",
                 "M",
                 "G",
                 "P",
                 "H",
                 "Y",
                 "V",
                 "B",
                 "F",
                 "K",
                 "Z",
                 "W",
                 "X",
                 "Q",
                 "_",
                 "J",
                 "2",
                 "4",
                 "6",
                 "EOF",
                 "0",
                 "1",
                 "3",
                 "5",
                 "7",
                 "8",
                 "9"
             };

    public final static boolean isValidForParser = true;
}
