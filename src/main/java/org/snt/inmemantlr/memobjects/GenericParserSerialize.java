/**
 * Inmemantlr - In memory compiler for Antlr 4
 * <p>
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2016 Julian Thome <julian.thome.de@gmail.com>
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 **/

package org.snt.inmemantlr.memobjects;

import java.io.Serializable;

/**
 * an object that is used for serializing a generic
 * parser that is already compiled
 */
public class GenericParserSerialize implements Serializable {

    private static final long serialVersionUID = -8824622790097111310L;

    private MemoryTupleSet mset;
    private String parserName;
    private String lexerName;

    /**
     * constructor
     *
     * @param mset       set of source/byte code tuples
     * @param parserName parser name
     * @param lexerName  lexer name
     */
    public GenericParserSerialize(MemoryTupleSet mset, String parserName, String lexerName) {
        if (mset == null || mset.size() == 0)
            throw new IllegalArgumentException("mset must not be null or empty");

        this.mset = mset;
        this.parserName = parserName;
        this.lexerName = lexerName;
    }

    public MemoryTupleSet getMemoryTupleSet() {
        return mset;
    }

    public String getParserName() {
        return parserName;
    }

    public String getLexerName() {
        return lexerName;
    }
}
