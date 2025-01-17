/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */

package org.akaza.openclinica.logic.score;

public class ScoreSymbol {
    /**
     * TERM_SYMBOL is for all of arguments, variables, values.
     */
    public static final char TERM_SYMBOL = 'T';
    public static final char FUNCTION_SYMBOL = 'F';
    public static final char ARGUMENT_SYMBOL = 'A';
    public static final char VARIABLE_SYMBOL = 'V';
    public static final char OPEN_PARENTH_SYMBOL = '(';
    public static final char CLOSE_PARENTH_SYMBOL = ')';
    public static final char ARITHMETIC_OPERATOR_SYMBOL = 'O';
    public static final char COMMA_SYMBOL = ',';
}